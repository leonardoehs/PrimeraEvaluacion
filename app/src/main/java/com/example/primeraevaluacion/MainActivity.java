package com.example.primeraevaluacion;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

import Entidades.Estudiante;


public class MainActivity extends AppCompatActivity{
    public static List<Estudiante> listaEstudiantes;
    public static Estudiante itemEstudiante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.listaEstudiantes =new ArrayList<>();
        itemEstudiante =new Estudiante();

    }
    public void clickNuevoRegistro(View v){
        Intent nuevoRegistro=new Intent(MainActivity.this, FormEstudiantes.class);
        startActivity(nuevoRegistro);
    }
    public void clickListaRegistro(View v){
        if(listaEstudiantes ==null || listaEstudiantes.size()==0){
            new AlertDialog.Builder(this).setTitle("Alerta").setMessage("!Lista Vacia!").show();
        }else {
            Intent lista=new Intent(this, ListaEstudiantes.class);
            startActivity(lista);
        }
    }
    public void clickMisDatos(View v){
        Intent datos=new Intent(this, MisDatos.class);
        startActivity(datos);
    }

}
