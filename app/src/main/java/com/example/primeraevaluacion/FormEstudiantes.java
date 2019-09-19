package com.example.primeraevaluacion;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Toast;

import Entidades.Estudiante;

import static com.example.primeraevaluacion.MainActivity.itemEstudiante;
import static com.example.primeraevaluacion.MainActivity.listaEstudiantes;

public class FormEstudiantes extends AppCompatActivity {
    EditText edtNombre, edtCodigo, edtMateria, edtPrimero, edtSegundo, edtTercero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        edtNombre = findViewById(R.id.edtNombre);
        edtCodigo = findViewById(R.id.edtCodigo);
        edtMateria = findViewById(R.id.edtMateria);
        edtPrimero = findViewById(R.id.edtPrimero);
        edtSegundo = findViewById(R.id.edtSegundo);
        edtTercero = findViewById(R.id.edtTercero);
    }

    public void clickGuardar(View v) {
        if (edtNombre.getText().toString().isEmpty()) {
            new AlertDialog.Builder(this).setTitle("Alerta").setMessage("!Por favor llene el Nombre!").show();
        } else if (edtCodigo.getText().toString().isEmpty()) {
            new AlertDialog.Builder(this).setTitle("Alerta").setMessage("!Por favor llene el Codigo!").show();
        } else if (edtMateria.getText().toString().isEmpty()) {
            new AlertDialog.Builder(this).setTitle("Alerta").setMessage("!Por favor llene la Materia!").show();
        } else if (edtPrimero.getText().toString().isEmpty()) {
            new AlertDialog.Builder(this).setTitle("Alerta").setMessage("!Por favor llene su primera nota!").show();
        } else if (edtSegundo.getText().toString().isEmpty()) {
            new AlertDialog.Builder(this).setTitle("Alerta").setMessage("!Por favor llene su segunda nota!").show();
        } else if (edtTercero.getText().toString().isEmpty()) {
            new AlertDialog.Builder(this).setTitle("Alerta").setMessage("!Por favor llene su tercera nota!").show();
        } else {
            double nota2 = Double.parseDouble(edtSegundo.getText().toString());
            double nota1 = Double.parseDouble(edtPrimero.getText().toString());
            double nota3 = Double.parseDouble(edtTercero.getText().toString());
            double promedio = (nota1 * 0.30) + (nota2 * 0.30) + (nota3 * 0.40);

            if (nota1 > 10) {
                new AlertDialog.Builder(this).setTitle("Alerta").setMessage("!Nota de el primer parcial no valida!").show();
            } else if (nota2 > 10) {
                new AlertDialog.Builder(this).setTitle("Alerta").setMessage("!Nota de el segundo parcial no valida!").show();
            } else if (nota3 > 10) {
                new AlertDialog.Builder(this).setTitle("Alerta").setMessage("!Nota de el tercer parcial no valida!").show();
            } else {
                itemEstudiante.setNombre(edtNombre.getText().toString());
                itemEstudiante.setCodigo(edtCodigo.getText().toString());
                itemEstudiante.setMateria(edtMateria.getText().toString());
                itemEstudiante.setPrimero(nota1);
                itemEstudiante.setSegundo(nota2);
                itemEstudiante.setTercero(nota3);
                itemEstudiante.setPromedio(promedio);

                if (!itemEstudiante.getNombre().isEmpty() && !itemEstudiante.getCodigo().isEmpty() && !itemEstudiante.getMateria().isEmpty()) {
                    listaEstudiantes.add(itemEstudiante);
                    itemEstudiante = new Estudiante();
                    finish();
                    Toast.makeText(this, "Estudiante Agregado con Exito", Toast.LENGTH_LONG).show();
                }
            }
        }
    }
}
