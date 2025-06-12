import java.util.ArrayList;
import java.util.List;

public abstract class Habitacion {

    List<Habitacion> habitaciones =  new ArrayList<Habitacion>();
    private int cur;

    public int getCur() {
        return cur;
    }

    public Habitacion(int cur) {
        this.cur = cur;
    }

    abstract void reservarHabitacion(int cur);

    abstract void reservarHabitacion(Habitacion h);
    abstract  void reservarHabitacion();




}


