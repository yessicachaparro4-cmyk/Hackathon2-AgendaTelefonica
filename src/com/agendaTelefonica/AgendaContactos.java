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
