public class Servicio implements IservicioActivable {
    private String tipo;
    private boolean codigoAcceso=true;
    @Override
    public void obtenerAcceso() {
        System.out.println("servicion  incluido: "+tipo+"acceso: "+ codigoAcceso);

    }

    public void obtenerAcceso(String tipo) {
        System.out.println("link de transporte enviado");
    }




}
