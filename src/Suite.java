public class Suite extends Habitacion {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public Suite(int cur, String nombre) {
        super(cur);
        this.nombre = nombre;
    }

    @Override
    void reservarHabitacion(int cur) {

    }

    @Override
    void reservarHabitacion(Habitacion h) {

    }

    @Override
    void reservarHabitacion() {

    }
}
