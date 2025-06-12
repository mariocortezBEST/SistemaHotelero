public class Premium extends Habitacion{
    @Override
    void reservarHabitacion(int cur) {

    }

    @Override
    void reservarHabitacion(Habitacion h) {

    }

    @Override
    void reservarHabitacion() {

    }

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public Premium(int cur, String nombre) {
        super(cur);
        this.nombre = nombre;
    }
}
