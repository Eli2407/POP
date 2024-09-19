//
//package Matrices;
//
//import java.util.ArrayList;
//import java.util.List;
//import javax.swing.JOptionPane;
//
//public class Ejercicio39 {
//    public static void main(String[] args) {
//        List<Cliente> clientes = new ArrayList<>();
//
//        while (true) {
//            String opcion = JOptionPane.showInputDialog(
//                "Seleccione una opción:\n" +
//                "1. Agregar cliente\n" +
//                "2. Mostrar estadísticas\n" +
//                "3. Salir"
//            );
//
//            switch (opcion) {
//                case "1":
//                    agregarCliente(clientes);
//                    break;
//                case "2":
//                    mostrarEstadisticas(clientes);
//                    break;
//                case "3":
//                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
//                    return;
//                default:
//                    JOptionPane.showMessageDialog(null, "Opción no válida.");
//            }
//        }
//    }
//
//    public static void agregarCliente(List<Cliente> clientes) {
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
//        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente"));
//        String categoria = JOptionPane.showInputDialog(
//            "Ingrese la categoría del cliente:\n" +
//            "1. Pesas\n" +
//            "2. Cardio\n" +
//            "3. Yoga\n" +
//            "4. Natación\n" +
//            "5. Boxeo"
//        );
//        int mesesMembresia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de meses de membresía"));
//
//        String categoriaNombre;
//        switch (categoria) {
//            case "1":
//                categoriaNombre = "Pesas";
//                break;
//            case "2":
//                categoriaNombre = "Cardio";
//                break;
//            case "3":
//                categoriaNombre = "Yoga";
//                break;
//            case "4":
//                categoriaNombre = "Natación";
//                break;
//            case "5":
//                categoriaNombre = "Boxeo";
//                break;
//            default:
//                categoriaNombre = "Desconocida";
//                break;
//        }
//
//        clientes.add(new Cliente(nombre, edad, categoriaNombre, mesesMembresia));
//        JOptionPane.showMessageDialog(null, "Cliente agregado exitosamente.");
//    }
//
//    public static void mostrarEstadisticas(List<Cliente> clientes) {
//        if (clientes.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "No hay clientes para mostrar estadísticas.");
//            return;
//        }
//
//        int countPesas = 0, countCardio = 0, countYoga = 0, countNatacion = 0, countBoxeo = 0;
//        double totalEdadPesas = 0, totalEdadCardio = 0, totalEdadYoga = 0, totalEdadNatacion = 0, totalEdadBoxeo = 0;
//        int count18_25 = 0, count26_35 = 0, countAbove35 = 0;
//        int count1_5 = 0, count6_10 = 0, count11_15 = 0, count16_20 = 0, countAbove20 = 0;
//
//        for (Cliente cli : clientes) {
//
//            switch (cli.getCategoria()) {
//                case "Pesas":
//                    countPesas++;
//                    totalEdadPesas += cli.getEdad();
//                    break;
//                case "Cardio":
//                    countCardio++;
//                    totalEdadCardio += cli.getEdad();
//                    break;
//                case "Yoga":
//                    countYoga++;
//                    totalEdadYoga += cli.getEdad();
//                    break;
//                case "Natación":
//                    countNatacion++;
//                    totalEdadNatacion += cli.getEdad();
//                    break;
//                case "Boxeo":
//                    countBoxeo++;
//                    totalEdadBoxeo += cli.getEdad();
//                    break;
//            }
//
//            if (cli.getEdad() >= 18 && cli.getEdad() <= 25) count18_25++;
//            else if (cli.getEdad() >= 26 && cli.getEdad() <= 35) count26_35++;
//            else if (cli.getEdad() > 35) countAbove35++;
//
//            if (cli.getMesesMembresia() >= 1 && cli.getMesesMembresia() <= 5) count1_5++;
//            else if (cli.getMesesMembresia() >= 6 && cli.getMesesMembresia() <= 10) count6_10++;
//            else if (cli.getMesesMembresia() >= 11 && cli.getMesesMembresia() <= 15) count11_15++;
//            else if (cli.getMesesMembresia() >= 16 && cli.getMesesMembresia() <= 20) count16_20++;
//            else if (cli.getMesesMembresia() > 20) countAbove20++;
//        }
//
//        double promedioEdadPesas = countPesas > 0 ? totalEdadPesas / countPesas : 0;
//        double promedioEdadCardio = countCardio > 0 ? totalEdadCardio / countCardio : 0;
//        double promedioEdadYoga = countYoga > 0 ? totalEdadYoga / countYoga : 0;
//        double promedioEdadNatacion = countNatacion > 0 ? totalEdadNatacion / countNatacion : 0;
//        double promedioEdadBoxeo = countBoxeo > 0 ? totalEdadBoxeo / countBoxeo : 0;
//
//        double porcentaje18_25 = clientes.size() > 0 ? (double) count18_25 / clientes.size() * 100 : 0;
//        double porcentaje26_35 = clientes.size() > 0 ? (double) count26_35 / clientes.size() * 100 : 0;
//        double porcentajeAbove35 = clientes.size() > 0 ? (double) countAbove35 / clientes.size() * 100 : 0;
//
//        StringBuilder estadisticas = new StringBuilder("Estadísticas de Clientes:\n");
//        estadisticas.append("Promedio de edad en Pesas: ").append(promedioEdadPesas).append("\n");
//        estadisticas.append("Promedio de edad en Cardio: ").append(promedioEdadCardio).append("\n");
//        estadisticas.append("Promedio de edad en Yoga: ").append(promedioEdadYoga).append("\n");
//        estadisticas.append("Promedio de edad en Natación: ").append(promedioEdadNatacion).append("\n");
//        estadisticas.append("Promedio de edad en Boxeo: ").append(promedioEdadBoxeo).append("\n\n");
//
//        estadisticas.append("Porcentaje de clientes con edades entre 18 y 25 años: ").append(porcentaje18_25).append("%\n");
//        estadisticas.append("Porcentaje de clientes con edades entre 26 y 35 años: ").append(porcentaje26_35).append("%\n");
//        estadisticas.append("Porcentaje de clientes con edades superiores a 35 años: ").append(porcentajeAbove35).append("%\n\n");
//
//        estadisticas.append("Total de clientes con membresía entre 1 y 5 meses: ").append(count1_5).append("\n");
//        estadisticas.append("Total de clientes con membresía entre 6 y 10 meses: ").append(count6_10).append("\n");
//        estadisticas.append("Total de clientes con membresía entre 11 y 15 meses: ").append(count11_15).append("\n");
//        estadisticas.append("Total de clientes con membresía entre 16 y 20 meses: ").append(count16_20).append("\n");
//        estadisticas.append("Total de clientes con membresía superior a 20 meses: ").append(countAbove20).append("\n");
//
//        JOptionPane.showMessageDialog(null, estadisticas.toString());
//    }
//}
//
//class Cliente {
//    private String nombre;
//    private int edad;
//    private String categoria;
//    private int mesesMembresia;
//
//    public Cliente(String nombre, int edad, String categoria, int mesesMembresia) {
//        this.nombre = nombre;
//        this.edad = edad;
//        this.categoria = categoria;
//        this.mesesMembresia = mesesMembresia;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public int getEdad() {
//        return edad;
//    }
//
//    public String getCategoria() {
//        return categoria;
//    }
//
//    public int getMesesMembresia() {
//        return mesesMembresia;
//    }
//}
