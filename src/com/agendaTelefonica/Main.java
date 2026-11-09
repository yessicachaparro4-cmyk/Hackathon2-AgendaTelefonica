package com.agendaTelefonica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        agendaTelefonica();
    }

    public static void agendaTelefonica(){
        Scanner entrada = new Scanner(System.in);
        var salir = false;
        AgendaContactos contactos = new AgendaContactos();
        System.out.println("*** Bienvenido a nuestra Agenda Telefonica ***");
        System.out.println();

        while(!salir){ // Mientras salir sea false...
            try{
                var opcion = mostrarMenu(entrada);
                salir = ejecutarOpciones(opcion, entrada, contactos);
            }
            catch(Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            finally { // Se ejecuta independientemente de que ocurra o no un error
                System.out.println();
            }
        }
    }

    private static int mostrarMenu(Scanner entrada){
        System.out.print("""
                Menu:
                1. Agregar contacto 
                2. Verificar si existe contacto
                3. Listar contactos
                4. Buscar contacto
                5. Eliminar Contacto
                6. Modificar telefono
                7. Comprobar si Agenda esta llena
                8. Mostrar espacios libres
                9. Salir
                Elige una opcion: \s
                """);
        return Integer.parseInt(entrada.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion, Scanner entrada, AgendaContactos contactos){
        var salir = false;

        switch(opcion){
            case 1 -> agregarContacto(entrada, contactos);
            case 2 -> existeContacto(entrada, contactos);
            case 3 -> listarContactos(contactos);
            case 4 -> buscarContacto(entrada, contactos);
            case 5 -> elminarContacto(entrada, contactos);
            case 6 -> modificarTelefono(entrada, contactos);
            case 7 -> agendaEstaLlena(contactos);
            case 8 -> mostrarEspaciosLibres(contactos);
            case 9 -> {
                System.out.println("Regresa pronto!");
                salir = true;
            }
            default -> System.out.println("Por favor ingresa una opción valida");
        }
        return salir;
    }

    private static void agregarContacto(Scanner entrada, AgendaContactos contactos){
        // Verificar capacidad de la agenda ???

        System.out.print("Nombre del contacto: ");
        var nombre = entrada.nextLine();
        System.out.print("Apellido del contacto: ");
        var apellido = entrada.nextLine();
        System.out.print("Telefono del contacto: ");
        var telefono = entrada.nextLine();

        contactos.añadirContacto(new Contacto(nombre, apellido, telefono));
    }

    private static void existeContacto(Scanner entrada, AgendaContactos contactos){
        System.out.print("Nombre del contacto: ");
        var nombre = entrada.nextLine();
        System.out.print("Apellido del contacto: ");
        var aoellido = entrada.nextLine();
        System.out.print("Telefono del contacto: ");
        var telefono = entrada.nextLine();

        var existeContacto = contactos.existeContacto(new Contacto (nombre, aoellido, telefono));
        if(existeContacto){
            System.out.println("El contacto ya existe en tu agenda");
        }
        else{
            System.out.println("El contacto aún no existe en tu agenda");
        }
    }

    private static void listarContactos(AgendaContactos contactos){
        contactos.listarContactos();
    }

    private static void buscarContacto(Scanner entrada, AgendaContactos contactos){
        System.out.print("Nombre del contacto: ");
        var nombre = entrada.nextLine();

        System.out.print("Apellido del contacto: ");
        var apellido = entrada.nextLine();

        contactos.buscarContacto(nombre, apellido);
    }

    private static void elminarContacto(Scanner entrada, AgendaContactos contactos){
        System.out.print("Nombre del contacto: ");
        var nombre = entrada.nextLine();
        System.out.print("Apellido del contacto: ");
        var apellido = entrada.nextLine();
        System.out.print("Telefono del contacto: ");
        var telefono = entrada.nextLine();

        contactos.eliminarContacto(new Contacto(nombre, apellido, telefono));
    }

    private static void modificarTelefono(Scanner entrada, AgendaContactos contactos){
        System.out.print("Nombre del contacto: ");
        var nombre = entrada.nextLine();
        System.out.print("Apellido del contacto: ");
        var apellido = entrada.nextLine();
        contactos.modificarTelefono(nombre, apellido);
    }

    private static void agendaEstaLlena(AgendaContactos contactos){
        var agendaEstaLLena = contactos.agendaLlena();
        System.out.println(agendaEstaLLena ? "Agenda llena, no puedes agregar mas contactos" : "Agenda con espacio disponible, puede agregar nuevos contactos");
    }

    private static void mostrarEspaciosLibres(AgendaContactos contactos){
        System.out.println(contactos.espaciosLibre());
    }
}
