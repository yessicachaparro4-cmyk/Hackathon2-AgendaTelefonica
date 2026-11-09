package com.agendaTelefonica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        agendaTelefonica();
    }

    public static void agendaTelefonica(){
        Scanner entrada = new Scanner(System.in);
        var salir = false;
        // AgendaContactos contactos = new AgendaContactos();
        System.out.println("*** Bienvenido a nuestra Agenda Telefonica ***");
        System.out.println();

        while(!salir){ // Mientras salir valga false...
            try{
                var opcion = mostrarMenu(entrada);
                salir = ejecutarOpciones(opcion, entrada);
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

    private static boolean ejecutarOpciones(int opcion, Scanner entrada){
        var salir = false;

        switch(opcion){
            case 1 -> agregarContacto(entrada); // falta mandar contactos
            case 2 -> existeContacto(entrada); // falta mandar contactos
            case 3 -> listarContactos(); // falta mandar contactos
            case 4 -> buscarContacto(entrada); // falta mandar contactos
            case 5 -> elminarContacto(entrada); // falta mandar contactos
            case 6 -> modificarTelefono(entrada); // falta mandar contactos
            case 7 -> agendaEstaLlena(); // falta mandar contactos
            case 8 -> mostrarEspaciosLibres(); // falta mandar contactos
            case 9 -> {
                System.out.println("Regresa pronto!");
                salir = true;
            }
            default -> System.out.println("Por favor ingresa una opción valida");
        }
        return salir;
    }

    private static void agregarContacto(Scanner entrada){
        // Verificar capacidad de la agenda ???

        System.out.print("Nombre del contacto: ");
        var nombre = entrada.nextLine();
        System.out.print("Apellido del contacto: ");
        var aoellido = entrada.nextLine();
        System.out.print("Telefono del contacto: ");
        var telefono = entrada.nextLine();

        //contactos.agregarContacto(new Contacto(nombre, apellido, telefono);
    }

    private static void existeContacto(Scanner entrada){
        System.out.print("Nombre del contacto: ");
        var nombre = entrada.nextLine();
        System.out.print("Apellido del contacto: ");
        var aoellido = entrada.nextLine();
        //contactos.existeContacto(new Contacto(nombre, apellido);
    }

    private static void listarContactos(){
        // contactos.listarContactos();
    }

    private static void buscarContacto(Scanner entrada){
        System.out.print("Nombre del contacto: ");
        var nombre = entrada.nextLine();

        // contactos.buscarContacto(nombre);
    }

    private static void elminarContacto(Scanner entrada){
        System.out.print("Nombre del contacto: ");
        var nombre = entrada.nextLine();
        System.out.print("Apellido del contacto: ");
        var aoellido = entrada.nextLine();
        System.out.print("Telefono del contacto: ");
        var telefono = entrada.nextLine();

        //contactos.eliminarContacto(new Contacto(nombre, apellido, telefono);
    }

    private static void modificarTelefono(Scanner entrada){
        System.out.print("Nombre del contacto: ");
        var nombre = entrada.nextLine();
        System.out.print("Apellido del contacto: ");
        var aoellido = entrada.nextLine();
        System.out.print("Telefono del contacto: ");
        var telefono = entrada.nextLine();
        //contactos.modificarTelefono(new Contacto(nombre, apellido, telefono);
    }

    private static void agendaEstaLlena(){
        //contactos.agendaLlena()
    }

    private static void mostrarEspaciosLibres(){
        //contactos.espaciosLibres();
    }
}
