package ProyectoHotel;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main() {
        List<Cliente> listaClientes = new LinkedList<Cliente>();
        List<Cliente> Client1 = new Cliente(Guille, 617543067, GuilleSeCagaEnDavidagmail.com);
        List<Cliente> Client2 = new Cliente(DavidManuelEugenSoos, 643235422, DoboNoTeVeagmail.com);
        listaClientes.add(Client1);
        listaClientes.add(Client2);

        List<Habitacion> listaHabitaciones = new LinkedList<Habitacion>();
        List<Habitacion> Habitac1 = new Habitacion("Suite", 100, true);
        List<Habitacion> Habitac2 = new Habitacion("HabitacionIndividual", 22, false);
        listaHabitaciones.add(Habitac1);
        listaHabitaciones.add(Habitac2);
        
    }
    
}
