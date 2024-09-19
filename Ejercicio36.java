//
//package Matrices;
//
//import javax.swing.JOptionPane;
//
//public class Ejercicio36 {
//        public static void main(String[] args) {
//        String[][] estudiantes = new String[0][8]; 
//
//        while (true) {
//            String opcion = JOptionPane.showInputDialog(
//                "Seleccione una opción:\n" +
//                "1. Registrar nuevo estudiante\n" +
//                "2. Ingresar notas para un estudiante\n" +
//                "3. Mostrar información de estudiantes\n" +
//                "4. Salir"
//            );
//
//            switch (opcion) {
//                case "1":
//                    estudiantes = registrarEstudiante(estudiantes);
//                    break;
//                case "2":
//                    ingresarNotas(estudiantes);
//                    break;
//                case "3":
//                    mostrarInformacionEstudiantes(estudiantes);
//                    break;
//                case "4":
//                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
//                    return;
//                default:
//                    JOptionPane.showMessageDialog(null, "Opción no válida.");
//            }
//        }
//    }
//
//    public static String[][] registrarEstudiante(String[][] estudiantes) {
//        String[] nuevoEstudiante = new String[8];
//        nuevoEstudiante[0] = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
//        nuevoEstudiante[1] = JOptionPane.showInputDialog("Ingrese el apellido del estudiante");
//        nuevoEstudiante[2] = JOptionPane.showInputDialog("Ingrese el número de identificación");
//        nuevoEstudiante[3] = JOptionPane.showInputDialog("Ingrese el curso");
//
//
//        for (int i = 4; i < 7; i++) {
//            nuevoEstudiante[i] = "0";
//        }
//
// 
//        String[][] nuevosEstudiantes = new String[estudiantes.length + 1][8];
//        for (int i = 0; i < estudiantes.length; i++) {
//            nuevosEstudiantes[i] = estudiantes[i];
//        }
//        nuevosEstudiantes[estudiantes.length] = nuevoEstudiante;
//
//        JOptionPane.showMessageDialog(null, "Estudiante registrado exitosamente.");
//        return nuevosEstudiantes;
//    }
//
//    public static void ingresarNotas(String[][] estudiantes) {
//        String id = JOptionPane.showInputDialog("Ingrese el número de identificación del estudiante para ingresar notas");
//        for (int i = 0; i < estudiantes.length; i++) {
//            if (estudiantes[i][2].equals(id)) {
//                for (int j = 4; j < 7; j++) {
//                    estudiantes[i][j] = JOptionPane.showInputDialog("Ingrese la nota para la asignatura " + (j - 3));
//                }
//                JOptionPane.showMessageDialog(null, "Notas ingresadas exitosamente.");
//                return;
//            }
//        }
//        JOptionPane.showMessageDialog(null, "Estudiante no encontrado.");
//    }
//
//    public static void mostrarInformacionEstudiantes(String[][] estudiantes) {
//        StringBuilder informacion = new StringBuilder("Información de Estudiantes:\n");
//
//        for (String[] estudiante : estudiantes) {
//            String nombre = estudiante[0];
//            String apellido = estudiante[1];
//            String id = estudiante[2];
//            String curso = estudiante[3];
//            double nota1 = Double.parseDouble(estudiante[4]);
//            double nota2 = Double.parseDouble(estudiante[5]);
//            double nota3 = Double.parseDouble(estudiante[6]);
//
//            double promedio = (nota1 + nota2 + nota3) / 3;
//
//            informacion.append("Nombre: ").append(nombre)
//                .append("\nApellido: ").append(apellido)
//                .append("\nID: ").append(id)
//                .append("\nCurso: ").append(curso)
//                .append("\nNota 1: ").append(nota1)
//                .append("\nNota 2: ").append(nota2)
//                .append("\nNota 3: ").append(nota3)
//                .append("\nPromedio: ").append(promedio)
//                .append("\n\n");
//        }
//
//        JOptionPane.showMessageDialog(null, informacion.toString());
//    }
//}
