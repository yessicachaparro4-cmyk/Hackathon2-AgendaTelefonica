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
    public boolean existeContacto(Contacto c) {
        for (Contacto contactoActual : contacto) {

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
    public void buscarContacto(String nombre, String apellido) {
        for (Contacto contactoActual : contacto) {

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
    public void eliminarContacto(Contacto c) {
        Contacto contactoEncontrado = null;

        for (Contacto contactoActual : contacto) {

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
            contacto.remove(contactoEncontrado);
            System.out.println("Contacto eliminado correctamente");
        } else {
            System.out.println("El contacto no existe en la agenda");
        }
    }
}
