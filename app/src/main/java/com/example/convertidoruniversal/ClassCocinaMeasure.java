package com.example.convertidoruniversal;

public class ClassCocinaMeasure {
    //Creo variables:
    private String nombre; //lo pongo como privado a mi clase.
    private String medida1;
    private String medida2;
    private String medida3;

    //CONSTRUCTOR. Siempre tienen q ser públicos. así alguien fuera de esta clase puede acceder.
    public ClassCocinaMeasure(String nombre, String medida1, String medida2, String medida3){

        //asigno los inputs a las variables:
        //en java cuando setteas cosas hay q poner el "this" si o si.
        this.nombre=nombre; //con this me refiero a esta clase.
        this.medida1=medida1; //con this me refiero a esta clase.
        this.medida2=medida2; //con this me refiero a esta clase.
        this.medida3=medida3; //con this me refiero a esta clase.

    }

    //GETTERS - IN
    public String getNombre() {
        return nombre;
    }
    public String getMedida1() {
        return medida1;
    }
    public String getMedida2() {
        return medida2;
    }
    public String getMedida3() {
        return medida3;
    }
    //GETTERS - OUT

    //SETTERS - IN
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setMedida1(String medida1) {
        this.medida1 = medida1;
    }
    public void setMedida2(String medida2) {
        this.medida2 = medida2;
    }
    public void setMedida3(String medida3) {
        this.medida3 = medida3;
    }
    //SETTERS - OUT
}
