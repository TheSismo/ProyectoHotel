package ProyectoHotel;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main() {
        List<Cliente> listaClientes = new LinkedList<Cliente>();
        listaClientes.add(new Cliente("Matias", "JoeMama@gmail.com", 611542387));
        listaClientes.add(new Cliente("Jhairo Velazquez", "Momovil@gmail.com", 546201436));
        listaClientes.add(new Cliente("Culeador de Gallinas", "Funagallinas@gmail.com", 645213587));

        List<Habitacion> listaHabitaciones = new LinkedList<Habitacion>();
        listaHabitaciones.add(new Habitacion("Suite", 45, true));
        listaHabitaciones.add(new Habitacion("HabitacionDoble", 42, false));
        listaHabitaciones.add(new Habitacion("HabitacionIndividual", 22, true));

        List<Reserva> listaReservas = new LinkedList<Reserva>();
        listaReservas.add(new Reserva("Matias", "HabitacionDoble", 7));
        listaReservas.add(new Reserva("Jhairo Velazquez", "HabitacionIndividual", 4));
 

        //crear el objeto recepción
        )

        //Mostrar al usuario un menú con números y las opciones de acciones que puede hacer (registrar cliente, realizar reserva, salir)
    }
    
}
