/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author aser
 */
public class Estudiante {

    public String id;
    public String nombre;
    public String sexo;
    public String grado;
    public int edad;
    public String nombreAcudiente;
    public String telefonoAcudiente;

    public Estudiante(String id, String nombre, String sexo, String grado, int edad, String nombreAcudiente, String telefonoAcudiente) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.grado = grado;
        this.edad = edad;
        this.nombreAcudiente = nombreAcudiente;
        this.telefonoAcudiente = telefonoAcudiente;
    }

}