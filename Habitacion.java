package ProyectoHotel;

public class Habitacion {
    /*
     * Tipos de habitación:
     * suite
     * doble
     * individual
     */
    String TipoDeHabitacion;
    int NumeroDeHabitacion;
    boolean Disponibilidad;

    public Habitacion(String TipoDeHabitacion, int NumeroDeHabitacion, boolean Disponibilidad) {
        this.TipoDeHabitacion = TipoDeHabitacion;
        this.NumeroDeHabitacion = NumeroDeHabitacion;
        this.Disponibilidad = Disponibilidad;
    }
}