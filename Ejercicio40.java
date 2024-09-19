//
//package Matrices;
//
//import java.util.ArrayList;
//import java.util.List;
//import javax.swing.JOptionPane;
//
//public class Ejercicio40 {
//    public static void main(String[] args) {
//        // Lista para almacenar la información de los pacientes
//        List<Paciente> pacientes = new ArrayList<>();
//
//        // Solicitar la información de los pacientes
//        while (true) {
//            String opcion = JOptionPane.showInputDialog(
//                "Seleccione una opción:\n" +
//                "1. Agregar paciente\n" +
//                "2. Mostrar estadísticas\n" +
//                "3. Salir"
//            );
//
//            switch (opcion) {
//                case "1":
//                    agregarPaciente(pacientes);
//                    break;
//                case "2":
//                    mostrarEstadisticas(pacientes);
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
//    public static void agregarPaciente(List<Paciente> pacientes) {
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del paciente");
//        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del paciente"));
//        String area = JOptionPane.showInputDialog(
//            "Ingrese el área del paciente:\n" +
//            "1. Cardiología\n" +
//            "2. Neurología\n" +
//            "3. Pediatría\n" +
//            "4. Oncología\n" +
//            "5. Traumatología"
//        );
//        int tiempoInternacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo de internación en días"));
//
//        // Mapear el área a su nombre
//        String areaNombre;
//        switch (area) {
//            case "1":
//                areaNombre = "Cardiología";
//                break;
//            case "2":
//                areaNombre = "Neurología";
//                break;
//            case "3":
//                areaNombre = "Pediatría";
//                break;
//            case "4":
//                areaNombre = "Oncología";
//                break;
//            case "5":
//                areaNombre = "Traumatología";
//                break;
//            default:
//                areaNombre = "Desconocida";
//                break;
//        }
//
//        pacientes.add(new Paciente(nombre, edad, areaNombre, tiempoInternacion));
//        JOptionPane.showMessageDialog(null, "Paciente agregado exitosamente.");
//    }
//
//    public static void mostrarEstadisticas(List<Paciente> pacientes) {
//        if (pacientes.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "No hay pacientes para mostrar estadísticas.");
//            return;
//        }
//
//        int countCardiologia = 0, countNeurologia = 0, countPediatria = 0, countOncologia = 0, countTraumatologia = 0;
//        double totalEdadCardiologia = 0, totalEdadNeurologia = 0, totalEdadPediatria = 0, totalEdadOncologia = 0, totalEdadTraumatologia = 0;
//        int count18_25 = 0, count26_35 = 0, countAbove35 = 0;
//        int count1_5 = 0, count6_10 = 0, count11_15 = 0, count16_20 = 0, countAbove20 = 0;
//
//        for (Paciente pac : pacientes) {
//            switch (pac.getArea()) {
//                case "Cardiología":
//                    countCardiologia++;
//                    totalEdadCardiologia += pac.getEdad();
//                    break;
//                case "Neurología":
//                    countNeurologia++;
//                    totalEdadNeurologia += pac.getEdad();
//                    break;
//                case "Pediatría":
//                    countPediatria++;
//                    totalEdadPediatria += pac.getEdad();
//                    break;
//                case "Oncología":
//                    countOncologia++;
//                    totalEdadOncologia += pac.getEdad();
//                    break;
//                case "Traumatología":
//                    countTraumatologia++;
//                    totalEdadTraumatologia += pac.getEdad();
//                    break;
//            }
//
//            if (pac.getEdad() >= 18 && pac.getEdad() <= 25) count18_25++;
//            else if (pac.getEdad() >= 26 && pac.getEdad() <= 35) count26_35++;
//            else if (pac.getEdad() > 35) countAbove35++;
//
//            if (pac.getTiempoInternacion() >= 1 && pac.getTiempoInternacion() <= 5) count1_5++;
//            else if (pac.getTiempoInternacion() >= 6 && pac.getTiempoInternacion() <= 10) count6_10++;
//            else if (pac.getTiempoInternacion() >= 11 && pac.getTiempoInternacion() <= 15) count11_15++;
//            else if (pac.getTiempoInternacion() >= 16 && pac.getTiempoInternacion() <= 20) count16_20++;
//            else if (pac.getTiempoInternacion() > 20) countAbove20++;
//        }
//
//        double promedioEdadCardiologia = countCardiologia > 0 ? totalEdadCardiologia / countCardiologia : 0;
//        double promedioEdadNeurologia = countNeurologia > 0 ? totalEdadNeurologia / countNeurologia : 0;
//        double promedioEdadPediatria = countPediatria > 0 ? totalEdadPediatria / countPediatria : 0;
//        double promedioEdadOncologia = countOncologia > 0 ? totalEdadOncologia / countOncologia : 0;
//        double promedioEdadTraumatologia = countTraumatologia > 0 ? totalEdadTraumatologia / countTraumatologia : 0;
//
//        double porcentaje18_25 = pacientes.size() > 0 ? (double) count18_25 / pacientes.size() * 100 : 0;
//        double porcentaje26_35 = pacientes.size() > 0 ? (double) count26_35 / pacientes.size() * 100 : 0;
//        double porcentajeAbove35 = pacientes.size() > 0 ? (double) countAbove35 / pacientes.size() * 100 : 0;
//
//        StringBuilder estadisticas = new StringBuilder("Estadísticas de Pacientes:\n");
//        estadisticas.append("Promedio de edad en Cardiología: ").append(promedioEdadCardiologia).append("\n");
//        estadisticas.append("Promedio de edad en Neurología: ").append(promedioEdadNeurologia).append("\n");
//        estadisticas.append("Promedio de edad en Pediatría: ").append(promedioEdadPediatria).append("\n");
//        estadisticas.append("Promedio de edad en Oncología: ").append(promedioEdadOncologia).append("\n");
//        estadisticas.append("Promedio de edad en Traumatología: ").append(promedioEdadTraumatologia).append("\n\n");
//
//        estadisticas.append("Porcentaje de pacientes con edades entre 18 y 25 años: ").append(porcentaje18_25).append("%\n");
//        estadisticas.append("Porcentaje de pacientes con edades entre 26 y 35 años: ").append(porcentaje26_35).append("%\n");
//        estadisticas.append("Porcentaje de pacientes con edades superiores a 35 años: ").append(porcentajeAbove35).append("%\n\n");
//
//        estadisticas.append("Total de pacientes con tiempo de internación entre 1 y 5 días: ").append(count1_5).append("\n");
//        estadisticas.append("Total de pacientes con tiempo de internación entre 6 y 10 días: ").append(count6_10).append("\n");
//        estadisticas.append("Total de pacientes con tiempo de internación entre 11 y 15 días: ").append(count11_15).append("\n");
//        estadisticas.append("Total de pacientes con tiempo de internación entre 16 y 20 días: ").append(count16_20).append("\n");
//        estadisticas.append("Total de pacientes con tiempo de internación superior a 20 días: ").append(countAbove20).append("\n");
//
//        JOptionPane.showMessageDialog(null, estadisticas.toString());
//    }
//}
//
//class Paciente {
//    private String nombre;
//    private int edad;
//    private String area;
//    private int tiempoInternacion;
//
//    public Paciente(String nombre, int edad, String area, int tiempoInternacion) {
//        this.nombre = nombre;
//        this.edad = edad;
//        this.area = area;
//        this.tiempoInternacion = tiempoInternacion;
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
//    public String getArea() {
//        return area;
//    }
//
//    public int getTiempoInternacion() {
//        return tiempoInternacion;
//    }
//}
