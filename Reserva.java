package ProyectoHotel;

import java.util.Scanner;

public class Reserva {

    String Cliente;
    String Habitacion;
    int DiasDeEstancia;

    public static void main(String[] args) {
        int DiasDeEstancia;
        Scanner leer = new Scanner(System.in);

        System.out.print("Cuantos dias durara tu estancia: ") ;
        DiasDeEstancia = leer.nextInt();

        System.out.println("El precio de la habitacion es: " + DiasDeEstancia * HabitacionDoble);
    }
   
}