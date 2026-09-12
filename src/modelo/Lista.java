/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import exceptions.EstudianteException;

/**
 *
 * @author aser
 */
public class Lista {

    public Nodo cab;

    public Lista() {
        this.cab = null;
    }

    public boolean getIsEmpty() {

        if (cab == null) {
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {

        if (getIsEmpty()) {
            return 0;
        } else {

            Nodo p = cab;
            int cont = 0;

            while (p != null) {
                cont++;
                p = p.sig;
            }
            return cont;
        }
    }

    public Nodo getLast() {

        if (getIsEmpty()) {
            return null;
        } else {
            Nodo p = cab;

            while (p.sig != null) {
                p = p.sig;
            }

            return p;
        }
    }

    //                        id              e                                          p
    //p.e.id es el la id del estudiante que está en ese nodo
    public Nodo buscarEstudiantePorId(String id) {

        if (getIsEmpty()) {
            return null;
        } else {

            Nodo p = cab;

            while (p != null) {

                if (id.equals(p.e.id)) {
                    return p;
                } else {
                    p = p.sig;
                }
            }
            return null;
        }
    }

    //debe recibir los datos ya validados, sino explota todo
    public Nodo crearNodo(Estudiante e) throws EstudianteException {

        Nodo b = buscarEstudiantePorId(e.id);

        if (b != null) {
            throw new EstudianteException("El estudiante con el id: " + e.id + " ya existe");
        }

        Nodo info = new Nodo(e);
        return info;
    }

    public void añadirNodoAlFinal() {

    }

    public void añadirNodoEnMedio(Nodo info) {

    }

    public void añadirNodoAlInicio() {

    }

    public Nodo buscarEstudiantePorNombre(String nombre) {
        return null;
    }

    public boolean eliminarEstudiantePorId(String id) {
        return false;
    }

    //1
    public Estudiante[] estudianteMayorEdad(String grado) {
        return null;
    }

    //2
    public String[] obtenerNombresMujeres5() {
        return null;
    }

    public String obtenerCantidadMujeres5() {
        return null;
    }

    public String obtenerEdadPromedioMujeres5() {
        return null;
    }

    public String[] reporteMujeres5() {
        return null;
    }

    //3
    public String totalMujeres1() {
        return null;
    }

    public String totalHombres1() {
        return null;
    }

}
