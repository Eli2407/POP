//
//package Arrays;
//
//import javax.swing.JOptionPane;
//
//public class Ejercicio27 {
//    private static final int MAX_RESERVAS = 100;
//    private static Reserva[] reservas = new Reserva[MAX_RESERVAS];
//    private static int numReservas = 0;
//
//    public static void main(String[] args) {
//        inicializarReservas();
//
//        while (true) {
//            String opcion = JOptionPane.showInputDialog(
//                "Seleccione una opción:\n" +
//                "1. Mostrar todas las reservas registradas\n" +
//                "2. Agregar una nueva reserva\n" +
//                "3. Actualizar el número de entradas en una reserva existente\n" +
//                "4. Buscar reservas por nombre del cliente\n" +
//                "5. Calcular y mostrar el ingreso total generado por las reservas\n" +
//                "6. Salir"
//            );
//
//            switch (opcion) {
//                case "1":
//                    mostrarReservas();
//                    break;
//                case "2":
//                    agregarReserva();
//                    break;
//                case "3":
//                    actualizarEntradas();
//                    break;
//                case "4":
//                    buscarReserva();
//                    break;
//                case "5":
//                    calcularIngresoTotal();
//                    break;
//                case "6":
//                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
//                    return;
//                default:
//                    JOptionPane.showMessageDialog(null, "Opción no válida.");
//            }
//        }
//    }
//
//    public static void inicializarReservas() {
//        reservas[0] = new Reserva("Juan Pérez", "Matrix", 2, 200);
//        reservas[1] = new Reserva("Ana Gómez", "Inception", 3, 300);
//        reservas[2] = new Reserva("Luis Martínez", "The Matrix", 1, 100);
//        numReservas = 3; 
//    }
//
//    public static void mostrarReservas() {
//        if (numReservas == 0) {
//            JOptionPane.showMessageDialog(null, "No hay reservas registradas.");
//            return;
//        }
//
//        StringBuilder lista = new StringBuilder("Reservas Registradas:\n");
//        for (int i = 0; i < numReservas; i++) {
//            Reserva r = reservas[i];
//            lista.append("Nombre del Cliente: ").append(r.getNombreCliente())
//                 .append(", Película: ").append(r.getPelicula())
//                 .append(", Número de Entradas: ").append(r.getNumeroEntradas())
//                 .append(", Precio Total: $").append(r.getPrecioTotal())
//                 .append("\n");
//        }
//        JOptionPane.showMessageDialog(null, lista.toString());
//    }
//
//    public static void agregarReserva() {
//        if (numReservas >= MAX_RESERVAS) {
//            JOptionPane.showMessageDialog(null, "No se pueden agregar más reservas.");
//            return;
//        }
//
//        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
//        String pelicula = JOptionPane.showInputDialog("Ingrese el nombre de la película");
//        int numeroEntradas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de entradas"));
//        double precioTotal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio total"));
//
//        reservas[numReservas] = new Reserva(nombreCliente, pelicula, numeroEntradas, precioTotal);
//        numReservas++;
//        JOptionPane.showMessageDialog(null, "Reserva agregada exitosamente.");
//    }
//
//    public static void actualizarEntradas() {
//        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente para actualizar la reserva");
//        Reserva reserva = buscarReservaPorNombre(nombreCliente);
//
//        if (reserva != null) {
//            int nuevoNumeroEntradas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo número de entradas"));
//            double nuevoPrecioTotal = nuevoNumeroEntradas * (reserva.getPrecioTotal() / reserva.getNumeroEntradas()); // Suponiendo que el precio total por entrada es constante
//            reserva.setNumeroEntradas(nuevoNumeroEntradas);
//            reserva.setPrecioTotal(nuevoPrecioTotal);
//            JOptionPane.showMessageDialog(null, "Número de entradas actualizado.");
//        } else {
//            JOptionPane.showMessageDialog(null, "Reserva no encontrada.");
//        }
//    }
//
//    public static void buscarReserva() {
//        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente a buscar");
//        Reserva reserva = buscarReservaPorNombre(nombreCliente);
//
//        if (reserva != null) {
//            JOptionPane.showMessageDialog(null,
//                "Nombre del Cliente: " + reserva.getNombreCliente() +
//                "\nPelícula: " + reserva.getPelicula() +
//                "\nNúmero de Entradas: " + reserva.getNumeroEntradas() +
//                "\nPrecio Total: $" + reserva.getPrecioTotal());
//        } else {
//            JOptionPane.showMessageDialog(null, "Reserva no encontrada.");
//        }
//    }
//
//    public static void calcularIngresoTotal() {
//        double ingresoTotal = 0;
//        for (int i = 0; i < numReservas; i++) {
//            ingresoTotal += reservas[i].getPrecioTotal();
//        }
//        JOptionPane.showMessageDialog(null, "Ingreso total generado por las reservas: $" + ingresoTotal);
//    }
//
//    private static Reserva buscarReservaPorNombre(String nombreCliente) {
//        for (int i = 0; i < numReservas; i++) {
//            if (reservas[i].getNombreCliente().equalsIgnoreCase(nombreCliente)) {
//                return reservas[i];
//            }
//        }
//        return null;
//    }
//}
//
//class Reserva {
//    private String nombreCliente;
//    private String pelicula;
//    private int numeroEntradas;
//    private double precioTotal;
//
//    public Reserva(String nombreCliente, String pelicula, int numeroEntradas, double precioTotal) {
//        this.nombreCliente = nombreCliente;
//        this.pelicula = pelicula;
//        this.numeroEntradas = numeroEntradas;
//        this.precioTotal = precioTotal;
//    }
//
//    public String getNombreCliente() {
//        return nombreCliente;
//    }
//
//    public String getPelicula() {
//        return pelicula;
//    }
//
//    public int getNumeroEntradas() {
//        return numeroEntradas;
//    }
//
//    public void setNumeroEntradas(int numeroEntradas) {
//        this.numeroEntradas = numeroEntradas;
//    }
//
//    public double getPrecioTotal() {
//        return precioTotal;
//    }
//
//    public void setPrecioTotal(double precioTotal) {
//        this.precioTotal = precioTotal;
//    }
//}
