import java.util.ArrayList;
import java.util.List;

public class Reserva {

    List<Habitacion> habitacionesDisponibles = new ArrayList<>();
    List<Habitacion> habitacionesReservada = new ArrayList<>();

    Habitacion e1= new Estandar(001, "Estadar1");
    Habitacion e2= new Estandar(002, "Estadar2");
    Habitacion p1= new Premium(003, "Premiun1");
    Habitacion p2= new Premium(004, "Premiun2");
    Habitacion s1= new Premium(005, "Suite1");
    Habitacion s2= new Premium(006, "Suite1");

    public Reserva(List<Habitacion> habitacionesDisponibles) {
        this.habitacionesDisponibles = habitacionesDisponibles;
    }
    public List<Habitacion> getHabitacionesDisponibles() {
        return habitacionesDisponibles;
    }
    public void mostrarHabitacion() {
        for (Habitacion habitacion : habitacionesDisponibles) {

            System.out.println(habitacion.getCur());
        }

    }
    public List<Habitacion> getHabitacionesReservada() {
        return habitacionesReservada;
    }
    public void cargaMultiplesReservas(Habitacion habitacionesDisponibles){



    }

    public void reservarHabitacion(Habitacion habitacion) {
        habitacionesReservada.add(habitacion);

    }

    public void mostrarHabitacionReservada() {
        for (Habitacion habitacion : habitacionesReservada) {

            System.out.println(habitacion.getCur());
        }

    }
}
