import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hr;
        boolean salir = true;
        String nombre;
        String apellido;
        String dni;

        String seleccion;
        List<Habitacion> habitacionesDisponibles = new ArrayList<>();
        Habitacion e1 = new Estandar(101, "Estadar1");
        Habitacion e2 = new Estandar(102, "Estadar2");
        Habitacion p1 = new Premium(201, "Premiun1");
        Habitacion p2 = new Premium(202, "Premiun2");
        Habitacion s1 = new Premium(301, "Suite1");
        Habitacion s2 = new Premium(302, "Suite1");
//
        habitacionesDisponibles.add(e1);
        habitacionesDisponibles.add(e2);
        habitacionesDisponibles.add(p1);
        habitacionesDisponibles.add(p2);
        habitacionesDisponibles.add(s1);
        habitacionesDisponibles.add(s2);
        Reserva reserva = new Reserva(habitacionesDisponibles);
        Servicio servicio = new Servicio();
//        System.out.println("habitacionesDisponibles: ");
//
//
//        reserva.reservarHabitacion(e1);
//
//        System.out.println("habitacionesDisponibles: ");
//        reserva.mostrarHabitacion();
//
//        System.out.println("-----------------------------");
//        System.out.println("Habitaciones reservadas");
//        reserva.mostrarHabitacionReservada();
        while (salir) {
            System.out.println("Bienvenidos al servicio de hotel ");
            System.out.println("************************************\n");

            System.out.println("Elija una opcion\n1.Ver Habitaciones Disponibles\n2.Cargar habitaciones a su reserva\n3.Confirmar Reserva\n4.Mostrar Reserva\n5.Salir");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Habitaciones Disponibles: ");
                    reserva.mostrarHabitacion();
                    break;
                case 2:
                    System.out.println("Elija el tipo de habitacion");
                    reserva.mostrarHabitacion();
                    hr = sc.nextInt();
                    if (hr == 101) {
                        reserva.reservarHabitacion(e1);
                    } else if (hr == 102) {
                        reserva.reservarHabitacion(e2);
                    } else if (hr == 201) {
                        reserva.reservarHabitacion(p1);
                    } else if (hr == 202) {
                        reserva.reservarHabitacion(p2);
                    } else if (hr == 301) {
                        reserva.reservarHabitacion(s1);
                    } else if (hr == 302) {
                        reserva.reservarHabitacion(s2);
                    }
                    break;
                case 3:
                    System.out.println("confirmar reserva");
                    reserva.mostrarHabitacionReservada();
                    System.out.println("ingrese nombre");
                    nombre = sc.next();
                    System.out.println("ingrese apellido");
                    apellido = sc.next();
                    System.out.println("Dni");
                    dni = sc.nextLine();
                    System.out.println("desea incluir desayuno, presione s/n, s incluye servicio y n no  incluye servicio");
                    seleccion = sc.nextLine();
                    if(seleccion.equals("s")){
                        servicio.obtenerAcceso();

                    }

                    System.out.println("desea incluir Spa, presione s/n, s incluye servicio y n no  incluye servicio");
                    seleccion = sc.nextLine();
                    if(seleccion.equals("s")){
                        servicio.obtenerAcceso();

                    }


                    System.out.println("desea incluir desayuno, presione s/n, s incluye servicio y n no  incluye servicio");
                    seleccion = sc.nextLine();
                    if(seleccion.equals("s")){
                        servicio.obtenerAcceso("Transporte");

                    }



//            }else{
//                    break;
//            }

                     break;
                case 4:
                    System.out.println("Salir");
                    salir = false;
                    break;

            }

        }
    }

}
