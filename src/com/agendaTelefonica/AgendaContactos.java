package com.agendaTelefonica;

import java.util.ArrayList;
import java.util.Scanner;

public class AgendaContactos {

    private ArrayList<Contacto> contactos;

    // Constructor
    public AgendaContactos() {
        contactos = new ArrayList<>(10);
    }

    // ******************* Añadir contacto *********************************
    public void añadirContacto(Contacto c) {

        if (c == null || c.getNombre() == null || c.getApellido() == null) {
            System.out.println("Nombre y apellido obligatorios.");
            return;
        }

        if (c.getNombre().trim().isEmpty() || c.getApellido().trim().isEmpty()) {
            System.out.println("Nombre y apellido no pueden estar vacíos.");
            return;
        }

        if (existeContacto(c)) {
            System.out.println("El contacto ya existe.");
            return;
        }

        if (agendaLlena()) {
            System.out.println("Agenda llena, no se puede agregar nuevos contactos");
            return;
        }

        contactos.add(c);
        System.out.println("Contacto añadido correctamente.");
    }

    // ******************** Existe contacto **********************************

    public boolean existeContacto(Contacto c) {
        for (Contacto contactoActual : contactos) {

            boolean mismoNombre = contactoActual.getNombre()
                    .equalsIgnoreCase(c.getNombre());

            boolean mismoApellido = contactoActual.getApellido()
                    .equalsIgnoreCase(c.getApellido());

            if (mismoNombre && mismoApellido) {
                return true;
            }
        }
        return false;
    }

    // ******************** Listar Contactos *********************************

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

    // ******************** Buscar Contacto **********************************
    public void buscarContacto(String nombre, String apellido) {
        for (Contacto contactoActual : contactos) {

            boolean mismoNombre = contactoActual.getNombre()
                    .equalsIgnoreCase(nombre);

            boolean mismoApellido = contactoActual.getApellido()
                    .equalsIgnoreCase(apellido);

            if (mismoNombre && mismoApellido) {
                System.out.println("Teléfono: " + contactoActual.getTelefono());
                return;
            }
        }

        System.out.println("Contacto no encontrado");
    }

    // ******************** Eliminar Contacto ********************************
    public void eliminarContacto(Contacto c) {
        Contacto contactoEncontrado = null;

        for (Contacto contactoActual : contactos) {

            boolean mismoNombre = contactoActual.getNombre()
                    .equalsIgnoreCase(c.getNombre());

            boolean mismoApellido = contactoActual.getApellido()
                    .equalsIgnoreCase(c.getApellido());

            if (mismoNombre && mismoApellido) {
                contactoEncontrado = contactoActual;
                break;
            }
        }

        if (contactoEncontrado != null) {
            contactos.remove(contactoEncontrado);
            System.out.println("Contacto eliminado correctamente");
        } else {
            System.out.println("El contacto no existe en la agenda");
        }
    }

    // ******************** Modificar telefono *******************************
    public void modificarTelefono(String nombre, String apellido){
        for (Contacto contactoActual : contactos) {

            boolean mismoNombre = contactoActual.getNombre()
                    .equalsIgnoreCase(nombre);

            boolean mismoApellido = contactoActual.getApellido()
                    .equalsIgnoreCase(apellido);

            if (mismoNombre && mismoApellido) {
                System.out.println("Contacto encontrado...");
                System.out.println("Teléfono actual : " + contactoActual.getTelefono());
                Scanner entrada = new Scanner(System.in);
                System.out.print("Introduce el nuevo numero de telefono: ");
                var nuevoTelefono = entrada.nextLine();
                contactoActual.setTelefono(nuevoTelefono);
                System.out.println("Teléfono actualizado correctamente.");
                return;
            }
        }

        System.out.println("Contacto no encontrado");
    }

    // ******************** Agenda llena *************************************
    public boolean agendaLlena (){
        if(this.contactos.size() == 10){
            return true;
        } else {
            return false;
        }
    }

    // ******************** Espacios Libres **********************************
    public String espaciosLibre(){
        return "Se pueden agregar "+ (10 - this.contactos.size()+" contactos más");
    }
}