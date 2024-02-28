

import ProyectoHotel.Cliente;

public class Reserva {

    Cliente Cliente;
    Habitacion Habitacion;
    int DiasDeEstancia;

    public int CalcularCosto(Reserva reserva) {
        /*
         * Precio individual: 45
         * Precio Doble: 75
         * Precio Suite: 225
         */

       
        //crear una variable costoPorDia y ponerle el costo por noche de ese tipo de habitación
        int CostoPorDiaSuite = 225;
        int CostoPorDiaIndividual = 45;
        int CostoPorDiaDoble = 75;
        //multiplicar el costo por noche por la cantidad de dias
        
        if(reserva.Habitacion.TipoDeHabitacion.equals("Individual")) {
            return DiasDeEstancia * CostoPorDiaIndividual;
        }
        if(reserva.Habitacion.TipoDeHabitacion.equals("Suite")) {
            return DiasDeEstancia * CostoPorDiaSuite;
        }
        if(reserva.Habitacion.TipoDeHabitacion.equals("Doble")) {
            return DiasDeEstancia * CostoPorDiaDoble;
        }

        return 0;
        
        
    }
    
}