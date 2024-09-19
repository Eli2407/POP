//
//package Matrices;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import javax.swing.JOptionPane;
//
//public class Ejercicio35 {
//     public static void main(String[] args) {
//        String[][] reservas = new String[0][7];
//
//        while (true) {
//            String opcion = JOptionPane.showInputDialog(
//                "Seleccione una opción:\n" +
//                "1. Registrar nueva reserva\n" +
//                "2. Cancelar reserva\n" +
//                "3. Mostrar información de reservas\n" +
//                "4. Calcular costo total de la estancia\n" +
//                "5. Salir"
//            );
//
//            switch (opcion) {
//                case "1":
//                    reservas = registrarReserva(reservas);
//                    break;
//                case "2":
//                    reservas = cancelarReserva(reservas);
//                    break;
//                case "3":
//                    mostrarInformacionReservas(reservas);
//                    break;
//                case "4":
//                    calcularCostoTotal(reservas);
//                    break;
//                case "5":
//                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
//                    return;
//                default:
//                    JOptionPane.showMessageDialog(null, "Opción no válida.");
//            }
//        }
//    }
//
//    public static String[][] registrarReserva(String[][] reservas) {
//        String[] nuevaReserva = new String[7];
//        nuevaReserva[0] = JOptionPane.showInputDialog("Ingrese el nombre del huésped");
//        nuevaReserva[1] = JOptionPane.showInputDialog("Ingrese el apellido del huésped");
//        nuevaReserva[2] = JOptionPane.showInputDialog("Ingrese la cédula del huésped");
//        nuevaReserva[3] = JOptionPane.showInputDialog("Ingrese el número de habitación");
//        nuevaReserva[4] = JOptionPane.showInputDialog("Ingrese la fecha de entrada (dd/MM/yyyy)");
//        nuevaReserva[5] = JOptionPane.showInputDialog("Ingrese la fecha de salida (dd/MM/yyyy)");
//        nuevaReserva[6] = JOptionPane.showInputDialog("Ingrese el precio por noche");
//
//        // Añadir nueva reserva a la matriz
//        String[][] nuevasReservas = new String[reservas.length + 1][7];
//        for (int i = 0; i < reservas.length; i++) {
//            nuevasReservas[i] = reservas[i];
//        }
//        nuevasReservas[reservas.length] = nuevaReserva;
//
//        JOptionPane.showMessageDialog(null, "Reserva registrada exitosamente.");
//        return nuevasReservas;
//    }
//
//    public static String[][] cancelarReserva(String[][] reservas) {
//        String cedulaEliminar = JOptionPane.showInputDialog("Ingrese la cédula del huésped cuya reserva desea cancelar");
//        int index = -1;
//        for (int i = 0; i < reservas.length; i++) {
//            if (reservas[i][2].equals(cedulaEliminar)) {
//                index = i;
//                break;
//            }
//        }
//
//        if (index != -1) {
//            String[][] nuevasReservas = new String[reservas.length - 1][7];
//            for (int i = 0, j = 0; i < reservas.length; i++) {
//                if (i != index) {
//                    nuevasReservas[j++] = reservas[i];
//                }
//            }
//            JOptionPane.showMessageDialog(null, "Reserva cancelada exitosamente.");
//            return nuevasReservas;
//        } else {
//            JOptionPane.showMessageDialog(null, "Reserva no encontrada.");
//            return reservas;
//        }
//    }
//
//    public static void mostrarInformacionReservas(String[][] reservas) {
//        StringBuilder informacion = new StringBuilder("Información de Reservas:\n");
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        
//        for (String[] reserva : reservas) {
//            String nombre = reserva[0];
//            String apellido = reserva[1];
//            String cedula = reserva[2];
//            String numHabitacion = reserva[3];
//            String fechaEntrada = reserva[4];
//            String fechaSalida = reserva[5];
//            String precioPorNoche = reserva[6];
//            
//            informacion.append("Nombre: ").append(nombre)
//                .append("\nApellido: ").append(apellido)
//                .append("\nCédula: ").append(cedula)
//                .append("\nNúmero de Habitación: ").append(numHabitacion)
//                .append("\nFecha de Entrada: ").append(fechaEntrada)
//                .append("\nFecha de Salida: ").append(fechaSalida)
//                .append("\nPrecio por Noche: ").append(precioPorNoche)
//                .append("\n");
//        }
//
//        JOptionPane.showMessageDialog(null, informacion.toString());
//    }
//
//    public static void calcularCostoTotal(String[][] reservas) {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        double costoTotal = 0;
//
//        for (String[] reserva : reservas) {
//            try {
//                Date fechaEntrada = sdf.parse(reserva[4]);
//                Date fechaSalida = sdf.parse(reserva[5]);
//                long diferenciaEnMilisegundos = fechaSalida.getTime() - fechaEntrada.getTime();
//                long diferenciaEnDias = diferenciaEnMilisegundos / (1000 * 60 * 60 * 24);
//
//                double precioPorNoche = Double.parseDouble(reserva[6]);
//                double costoReserva = diferenciaEnDias * precioPorNoche;
//
//                costoTotal += costoReserva;
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }
//        }
//
//        JOptionPane.showMessageDialog(null, "El costo total de las estancias es: $" + costoTotal);
//    }
//}
