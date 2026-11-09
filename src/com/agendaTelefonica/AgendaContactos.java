package com.agendaTelefonica;

import java.util.ArrayList;
public class AgendaContactos {
   private  ArrayList<Contacto> contacto;

    public ArrayList<Contacto> getContactos() {
        return contacto;
    }


    public AgendaContactos() {
    this.contacto = new ArrayList<Contacto>(10);
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
