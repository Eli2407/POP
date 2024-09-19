//
//package Matrices;
//
//import java.util.ArrayList;
//import java.util.List;
//import javax.swing.JOptionPane;
//
//public class Ejercicio38 {
//     public static void main(String[] args) {
//        // Lista para almacenar la información de los estudiantes
//         List<Estudiante> estudiantes = new ArrayList<>();
//        
//        // Solicitar la información de los estudiantes
//        while (true) {
//            String opcion = JOptionPane.showInputDialog(
//                "Seleccione una opción:\n" +
//                "1. Agregar estudiante\n" +
//                "2. Mostrar estadísticas\n" +
//                "3. Salir"
//            );
//
//            switch (opcion) {
//                case "1":
//                    agregarEstudiante(estudiantes);
//                    break;
//                case "2":
//                    mostrarEstadisticas(estudiantes);
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
//    public static void agregarEstudiante(List<Estudiante> estudiantes) {
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
//        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante"));
//        String facultad = JOptionPane.showInputDialog(
//            "Ingrese la facultad del estudiante:\n" +
//            "1. Ingeniería\n" +
//            "2. Medicina\n" +
//            "3. Derecho\n" +
//            "4. Ciencias Sociales\n" +
//            "5. Administración"
//        );
//        double promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el promedio del estudiante"));
//
//        // Mapear la facultad a su nombre
//        String facultadNombre;
//        switch (facultad) {
//            case "1":
//                facultadNombre = "Ingeniería";
//                break;
//            case "2":
//                facultadNombre = "Medicina";
//                break;
//            case "3":
//                facultadNombre = "Derecho";
//                break;
//            case "4":
//                facultadNombre = "Ciencias Sociales";
//                break;
//            case "5":
//                facultadNombre = "Administración";
//                break;
//            default:
//                facultadNombre = "Desconocida";
//                break;
//        }
//
//        estudiantes.add(new Estudiante(nombre, edad, facultadNombre, promedio));
//        JOptionPane.showMessageDialog(null, "Estudiante agregado exitosamente.");
//    }
//
//    public static void mostrarEstadisticas(List<Estudiante> estudiantes) {
//        if (estudiantes.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "No hay estudiantes para mostrar estadísticas.");
//            return;
//        }
//
//        // Variables para cálculos
//        int countIngenieria = 0, countMedicina = 0, countDerecho = 0, countCienciasSociales = 0, countAdministracion = 0;
//        double totalEdadIngenieria = 0, totalEdadMedicina = 0, totalEdadDerecho = 0, totalEdadCienciasSociales = 0, totalEdadAdministracion = 0;
//        int count18_25 = 0, count26_35 = 0, countAbove35 = 0;
//        int count1_2 = 0, count2_3 = 0, count3_4 = 0, count4_5 = 0, countAbove5 = 0;
//
//        for (Estudiante est : estudiantes) {
//            // Contar y acumular edades por facultad
//            switch (est.getFacultad()) {
//                case "Ingeniería":
//                    countIngenieria++;
//                    totalEdadIngenieria += est.getEdad();
//                    break;
//                case "Medicina":
//                    countMedicina++;
//                    totalEdadMedicina += est.getEdad();
//                    break;
//                case "Derecho":
//                    countDerecho++;
//                    totalEdadDerecho += est.getEdad();
//                    break;
//                case "Ciencias Sociales":
//                    countCienciasSociales++;
//                    totalEdadCienciasSociales += est.getEdad();
//                    break;
//                case "Administración":
//                    countAdministracion++;
//                    totalEdadAdministracion += est.getEdad();
//                    break;
//            }
//
//            if (est.getEdad() >= 18 && est.getEdad() <= 25) count18_25++;
//            else if (est.getEdad() >= 26 && est.getEdad() <= 35) count26_35++;
//            else if (est.getEdad() > 35) countAbove35++;
//
//            if (est.getPromedio() >= 1.0 && est.getPromedio() <= 2.0) count1_2++;
//            else if (est.getPromedio() >= 2.1 && est.getPromedio() <= 3.0) count2_3++;
//            else if (est.getPromedio() >= 3.1 && est.getPromedio() <= 4.0) count3_4++;
//            else if (est.getPromedio() >= 4.1 && est.getPromedio() <= 5.0) count4_5++;
//            else if (est.getPromedio() > 5.0) countAbove5++;
//        }
//
//        double promedioEdadIngenieria = countIngenieria > 0 ? totalEdadIngenieria / countIngenieria : 0;
//        double promedioEdadMedicina = countMedicina > 0 ? totalEdadMedicina / countMedicina : 0;
//        double promedioEdadDerecho = countDerecho > 0 ? totalEdadDerecho / countDerecho : 0;
//        double promedioEdadCienciasSociales = countCienciasSociales > 0 ? totalEdadCienciasSociales / countCienciasSociales : 0;
//        double promedioEdadAdministracion = countAdministracion > 0 ? totalEdadAdministracion / countAdministracion : 0;
//
//        double porcentaje18_25 = estudiantes.size() > 0 ? (double) count18_25 / estudiantes.size() * 100 : 0;
//        double porcentaje26_35 = estudiantes.size() > 0 ? (double) count26_35 / estudiantes.size() * 100 : 0;
//        double porcentajeAbove35 = estudiantes.size() > 0 ? (double) countAbove35 / estudiantes.size() * 100 : 0;
//
//        StringBuilder estadisticas = new StringBuilder("Estadísticas de Estudiantes:\n");
//        estadisticas.append("Promedio de edad en Ingeniería: ").append(promedioEdadIngenieria).append("\n");
//        estadisticas.append("Promedio de edad en Medicina: ").append(promedioEdadMedicina).append("\n");
//        estadisticas.append("Promedio de edad en Derecho: ").append(promedioEdadDerecho).append("\n");
//        estadisticas.append("Promedio de edad en Ciencias Sociales: ").append(promedioEdadCienciasSociales).append("\n");
//        estadisticas.append("Promedio de edad en Administración: ").append(promedioEdadAdministracion).append("\n\n");
//        
//        estadisticas.append("Porcentaje de estudiantes con edades entre 18 y 25 años: ").append(porcentaje18_25).append("%\n");
//        estadisticas.append("Porcentaje de estudiantes con edades entre 26 y 35 años: ").append(porcentaje26_35).append("%\n");
//        estadisticas.append("Porcentaje de estudiantes con edades superiores a 35 años: ").append(porcentajeAbove35).append("%\n\n");
//
//        estadisticas.append("Total de estudiantes con promedio entre 1.0 y 2.0: ").append(count1_2).append("\n");
//        estadisticas.append("Total de estudiantes con promedio entre 2.1 y 3.0: ").append(count2_3).append("\n");
//        estadisticas.append("Total de estudiantes con promedio entre 3.1 y 4.0: ").append(count3_4).append("\n");
//        estadisticas.append("Total de estudiantes con promedio entre 4.1 y 5.0: ").append(count4_5).append("\n");
//        estadisticas.append("Total de estudiantes con promedio superior a 5.0: ").append(countAbove5).append("\n");
//
//        JOptionPane.showMessageDialog(null, estadisticas.toString());
//    }
//}
//
//
//class Estudiante {
//    private String nombre;
//    private int edad;
//    private String facultad;
//    private double promedio;
//
//    public Estudiante(String nombre, int edad, String facultad, double promedio) {
//        this.nombre = nombre;
//        this.edad = edad;
//        this.facultad = facultad;
//        this.promedio = promedio;
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
//    public String getFacultad() {
//        return facultad;
//    }
//
//    public double getPromedio() {
//        return promedio;
//    }
//}
