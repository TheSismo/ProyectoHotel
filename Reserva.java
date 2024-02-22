package ProyectoHotel;

import java.util.Scanner;

public class Reserva {

    String Cliente;
    String Habitacion;
    int DiasDeEstancia;

    public Reserva(String Cliente, String Habitacion, int DiasDeEstancia) {
        this.Cliente = Cliente;
        this.Habitacion = Habitacion;
        this.DiasDeEstancia = DiasDeEstancia;
    }
}