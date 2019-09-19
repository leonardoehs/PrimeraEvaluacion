package com.example.primeraevaluacion;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import Adaptadores.AdaptadorEstudiante;
import Entidades.Estudiante;

import static com.example.primeraevaluacion.MainActivity.listaEstudiantes;

public class ListaEstudiantes extends AppCompatActivity {
    ListView listRegistros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_registros);
        listRegistros=findViewById(R.id.listRegistros);
        listRegistros.setAdapter(new AdaptadorEstudiante(this,R.layout.plantilla_registro, listaEstudiantes));
        if (listaEstudiantes == null || listaEstudiantes.size() == 0) {
            Toast.makeText(this, "Lista Vacia", Toast.LENGTH_LONG).show();
        } else {
            listRegistros.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Estudiante estuSel = listaEstudiantes.get(position);
                    if(estuSel != null){
                        if(estuSel.getPromedio()<6){
                            Toast.makeText(ListaEstudiantes.this, estuSel.getNombre() + " dejo la materia",Toast.LENGTH_LONG).show();
                        }else{
                            Toast.makeText(ListaEstudiantes.this, estuSel.getNombre() + " aprobo la materia",Toast.LENGTH_LONG).show();
                        }

                    }

                }
            });
        }
    }

}
