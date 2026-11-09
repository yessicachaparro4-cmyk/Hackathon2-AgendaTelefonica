package com.agendaTelefonica;

import java.util.ArrayList;
import java.util.List;

public class AgendaContactos {
    List<Contacto> contactos = new ArrayList<Contacto>(10);

    public AgendaContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    public String agendaLlena (){
        if(this.contactos.size() == 10){
            return "Agenda llena, no se puede agregar nuevos contactos";
        }else {
            return "Agenda con espacio disponible, puede agregar nuevos contactos";
        }
    }

    public String espaciosLibre(){
        return "Se pueden agregar "+ (10 - this.contactos.size()+" contactos nuevos");
    }

}
