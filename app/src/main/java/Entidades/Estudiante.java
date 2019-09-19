package Entidades;

public class Estudiante {
    private String nombre;
    private String codigo;
    private String materia;
    private Double primero;
    private Double segundo;
    private Double tercero;
    private Double promedio;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCodigo() {
        return codigo;
    }


    public void setMateria(String materia) {
        this.materia = materia;
    }
    public String getMateria() {
        return materia;
    }


    public void setPrimero(Double primero) {
        this.primero = primero;
    }
    public Double getPrimero() {
        return primero;
    }


    public void setSegundo(Double segundo) {
        this.segundo = segundo;
    }
    public Double getSegundo() {
        return segundo;
    }


    public void setTercero(Double tercero) {
        this.tercero = tercero;
    }
    public Double getTercero() {
        return tercero;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }
    public Double getPromedio() {
        return promedio;
    }
}

