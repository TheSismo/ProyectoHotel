package ProyectoHotel;

public class Habitacion {
    String TipoDeHabitacion;
    int Suite = 225;
    int HabitacionDoble = 75;
    int HabitacionIndividual = 50;
    int NumeroDeHabitacion;
    boolean Disponibilidad;

    public Habitacion(String TipoDeHabitacion, int NumeroDeHabitacion, boolean Disponibilidad) {
        this.TipoDeHabitacion = TipoDeHabitacion;
        this.NumeroDeHabitacion = NumeroDeHabitacion;
        this.Disponibilidad = Disponibilidad;
    }
}