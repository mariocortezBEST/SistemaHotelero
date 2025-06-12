public class Estandar extends Habitacion{
    @Override
    void reservarHabitacion(int cur) {

    }

    private String nombre;

    public String getNombre() {
        return nombre;
    }


    public Estandar(int cur, String nombre) {
        super(cur);
        this.nombre = nombre;
    }


    @Override
    void reservarHabitacion(Habitacion h) {

    }

    @Override
    void reservarHabitacion() {

    }
}
