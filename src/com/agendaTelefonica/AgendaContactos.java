package com.agendaTelefonica;

import java.util.ArrayList;

public class AgendaContactos {

    private ArrayList<Contacto> contactos;
    private int capacidadMaxima;

    // Constructor
    public AgendaContactos() {
        contactos = new ArrayList<>();
        capacidadMaxima = 10;
    }

//    public AgendaContactos(int capacidadMaxima) {
//        contactos = new ArrayList<>();
//
//        if (capacidadMaxima > 0) {
//            this.capacidadMaxima = capacidadMaxima;
//        } else {
//            this.capacidadMaxima = 10;
//        }
//    }

    // Añadir contacto
    public void añadirContacto(Contacto c) {

        if (c == null || c.getNombre() == null || c.getApellido() == null) {
            System.out.println("Nombre y apellido obligatorios.");
            return;
        }

        if (c.getNombre().trim().isEmpty() || c.getApellido().trim().isEmpty()) {
            System.out.println("Nombre y apellido no pueden estar vacíos.");
            return;
        }

//        if (existeContacto(c)) {
//            System.out.println("El contacto ya existe.");
//            return;
//        }
//
//        if (agendaLlena()) {
//            System.out.println("La agenda está llena.");
//            return;
//        }

        contactos.add(c);
        System.out.println("Contacto añadido correctamente.");
    }


// Listar Contactos

    public void listarContactos() {

        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía.");
            return;
        }

        ArrayList<Contacto> ordenados = new ArrayList<>(contactos);

        for (int i = 0; i < ordenados.size() - 1; i++) {

            for (int j = i + 1; j < ordenados.size(); j++) {

                Contacto primero = ordenados.get(i);
                Contacto segundo = ordenados.get(j);

                int comparacion = primero.getNombre().compareToIgnoreCase(segundo.getNombre());

                if (comparacion == 0) {
                    comparacion = primero.getApellido().compareToIgnoreCase(segundo.getApellido());
                }

                if (comparacion > 0) {
                    ordenados.set(i, segundo);
                    ordenados.set(j, primero);
                }
            }
        }

        for (Contacto contacto : ordenados) {

            System.out.println(contacto.getNombre() + " " + contacto.getApellido() + " - " + contacto.getTelefono());
        }
    }

    // Mariana

//    public List<Contacto> getContactos() {
//        return contacto;
//    }
//
//    public void setContactos(List<Contacto> contacto) {
//        this.contacto = contacto;
//    }
//
//    public AgendaContactos(List<Contacto> contacto) {
//        setContactos(contacto);
//    }
//
//    public String agendaLlena (){
//        if(this.contacto.size() == 10){
//            return "Agenda llena, no se puede agregar nuevos contactos";
//        }else {
//            return "Agenda con espacio disponible, puede agregar nuevos contactos";
//        }
//    }
//
//    public String espaciosLibre(){
//        return "Se pueden agregar "+ (10 - this.contacto.size()+" contactos nuevos");
//    }
}

/*

package com.agendaTelefonica;

import java.util.ArrayList;
import java.util.List;

public class AgendaContactos {
   private  List<Contacto> contacto = new ArrayList<Contacto>(10);

    public List<Contacto> getContactos() {
        return contacto;
    }

    public void setContactos(List<Contacto> contacto) {
        this.contacto = contacto;
    }

    public AgendaContactos(List<Contacto> contacto) {
        setContactos(contacto);
    }

    public String agendaLlena (){
        if(this.contacto.size() == 10){
            return "Agenda llena, no se puede agregar nuevos contactos";
        }else {
            return "Agenda con espacio disponible, puede agregar nuevos contactos";
        }
    }

    public String espaciosLibre(){
        return "Se pueden agregar "+ (10 - this.contacto.size()+" contactos nuevos");
    }

}
*/