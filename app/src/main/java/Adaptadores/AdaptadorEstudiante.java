package Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.example.primeraevaluacion.R;

import Entidades.Estudiante;
import java.util.List;

public class AdaptadorEstudiante extends BaseAdapter {
    private List<Estudiante> datasource;
    private Context cntx;
    private int IdLayoutPlantilla;

    public List<Estudiante> GetData(){
        return this.datasource;
    }

    /**
     * Constructor que permite inicializar las variables de la clase
     * @param context
     * @param IdPlantilla
     * @param sources
     */

    public AdaptadorEstudiante(Context context, int IdPlantilla, List<Estudiante> sources){
        //Inicializamos las variables
        this.cntx = context;
        this.IdLayoutPlantilla = IdPlantilla;
        this.datasource = sources;
    }
    @Override
    public int getCount() {
        return this.datasource.size();
    }

    @Override
    public Estudiante getItem(int position) {
        return this.datasource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            //Creamos el Administrador de Layout
            LayoutInflater inflater = (LayoutInflater) this.cntx.getSystemService(this.cntx.LAYOUT_INFLATER_SERVICE);
            //Le damos vida al archivo xml ahora es un Layout
            convertView = inflater.inflate(this.IdLayoutPlantilla,null);

            //Buscamos los controles de nuestra plantilla
            TextView txvNombre = convertView.findViewById(R.id.txvNombre);
            TextView txvCodigo = convertView.findViewById(R.id.txvCodigo);
            TextView txvMateria=convertView.findViewById(R.id.txvMateria);
            /*TextView txvPrimero=convertView.findViewById(R.id.txvNota1);
            TextView txvSegundo=convertView.findViewById(R.id.txvNota2);
            TextView txvTercero=convertView.findViewById(R.id.txvNota3);*/
            TextView txvPromedio=convertView.findViewById(R.id.txvPromedio);
            TextView txvId=convertView.findViewById(R.id.txvId);


            //Obtenemos el dato a mostrar
            txvNombre.setText(this.datasource.get(position).getNombre());
            txvCodigo.setText(this.datasource.get(position).getCodigo());
            txvMateria.setText(this.datasource.get(position).getMateria());
            /*txvPrimero.setText(this.datasource.get(position).getPrimero().toString());
            txvSegundo.setText(this.datasource.get(position).getSegundo().toString());
            txvTercero.setText(this.datasource.get(position).getTercero().toString());*/
            txvPromedio.setText(this.datasource.get(position).getPromedio().toString());
            String posicion = Integer.toString(position+1);
            txvId.setText(posicion);
        }
        return convertView;
    }
}

