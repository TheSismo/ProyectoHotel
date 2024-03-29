
package ProyectoHotel;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import Habitacion.Disponibilidad;
public class Main {
    public static void main() {
        List<Cliente> listaClientes = new LinkedList<Cliente>();
        listaClientes.add(new Cliente("Matias", "JoeMama@gmail.com", 611542387));
        listaClientes.add(new Cliente("Jhairo Velazquez", "Momovil@gmail.com", 546201436));
        listaClientes.add(new Cliente("Culeador de Gallinas", "Funagallinas@gmail.com", 645213587));

        List<Habitacion> listaHabitaciones = new LinkedList<Habitacion>();
        listaHabitaciones.add(new Habitacion(25, false, "Suite"));
        listaHabitaciones.add(new Habitacion(42, true, "Doble"));
        listaHabitaciones.add(new Habitacion(47, true, "Individual"));

        List<Reserva> listaReservas = new LinkedList<Reserva>();
        listaReservas.add(new Reserva("Matias", "HabitacionDoble", 7));
        listaReservas.add(new Reserva("Jhairo Velazquez", "HabitacionIndividual", 4));
        listaReservas.add(new Reserva("Joseador", "HabitacionIndividual", 4));
 

        //crear el objeto recepción
        Recepcion(listaClientes, listaHabitaciones);

        //Mostrar al usuario un menú con números y las opciones de acciones que puede hacer (registrar cliente, realizar reserva, salir)
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que quieres hacer?");
        System.out.println("1 - Reservar una habitación");
        System.out.println("2 - Registrar un cliente");

        int eleccion = sc.nextInt();
        sc.nextLine();

        if(eleccion == 1) {
            if(Disponibilidad == false) System.out.println("La habitacion no esta disponible" + listaHabitacion.Disponibilidad);
             MostrarDisponibilidad(listaHabitaciones.Disponibilidad);

        if(eleccion == 2) {
            HacerReserva(Reserva.Cliente, Reserva.Habitacion, + CostoDeLaHabitacion);
        }
        }

    }

    private static void Recepcion(List<Cliente> listaCliente, List<Habitacion> listaHabitaciones) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Recepcion'");
    }
    
}
