//
//package Arrays;
//
//import javax.swing.JOptionPane;
//
//public class Ejercicio25 {
//    public static void main (String[] args){
//        String[] nombreProyecto = {"Innovaccion","ArteVivo","ComuniDar"};
//        int []duracion = {20,30,15};
//        String[] estado = {"completado","En Progreso","Terminado"};
//        
//        MostrarProyectos(nombreProyecto,duracion,estado);
//        String nuevoProyecto = JOptionPane.showInputDialog("Ingrese el nombre del nuevo proyecto:");
//        int nuevaDuracion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duración del proyecto en días:"));
//        String nuevoEstado = JOptionPane.showInputDialog("Ingrese el estado (Completado, En Progreso, Terminado):");
//        nombreProyecto = AgregarProyecto(nombreProyecto, duracion, estado, nuevoProyecto, nuevaDuracion, nuevoEstado);
//
//      
//        String proyectoActualizar = JOptionPane.showInputDialog("Ingrese el nombre del proyecto que desea actualizar su estado:");
//        String nuevoEstadoProyecto = JOptionPane.showInputDialog("Ingrese el nuevo estado (Completado, En Progreso, Terminado):");
//        ActualizarEstadoProyecto(nombreProyecto, estado, proyectoActualizar, nuevoEstadoProyecto);
//
//
//        String proyectoBuscar = JOptionPane.showInputDialog("Ingrese el nombre del proyecto que desea buscar:");
//        BuscarProyecto(nombreProyecto, duracion, estado, proyectoBuscar);
//
//
//        MostrarProyectos(nombreProyecto, duracion, estado);
//    }
//    
//    public static void MostrarProyectos(String[] nombreProyecto, int[] duracion,String[]estado){
//        StringBuilder proyect = new StringBuilder("Proyectos: \n");
//        for(int i = 0;i< nombreProyecto.length;i++){
//            proyect.append("\nnombreProyecto: ").append(nombreProyecto[i])
//                    .append("\nduracion: ").append(duracion[i])
//                    .append("\nestado: ").append(estado[i]);
//        }
//        JOptionPane.showMessageDialog(null,proyect.toString());
//    }
//    
//    public static String[] AgregarProyecto(String[] nombreProyecto, int[] duracion, String[] estado, String proyectoAgregar, int tiempo, String estadoAgregar) {
//      
//        int nuevaLongitud = nombreProyecto.length + 1;
//        String[] nuevosNombres = new String[nuevaLongitud];
//        int[] nuevasDuraciones = new int[nuevaLongitud];
//        String[] nuevosEstados = new String[nuevaLongitud];
//
//        System.arraycopy(nombreProyecto, 0, nuevosNombres, 0, nombreProyecto.length);
//        System.arraycopy(duracion, 0, nuevasDuraciones, 0, duracion.length);
//        System.arraycopy(estado, 0, nuevosEstados, 0, estado.length);
//
//        nuevosNombres[nombreProyecto.length] = proyectoAgregar;
//        nuevasDuraciones[nombreProyecto.length] = tiempo;
//        nuevosEstados[nombreProyecto.length] = estadoAgregar;
//
//        JOptionPane.showMessageDialog(null, "Ingreso del proyecto " + proyectoAgregar + " Exitoso");
//        return nuevosNombres;
//    }
//
//    public static void ActualizarEstadoProyecto(String[] nombreProyecto, String[] estado, String proyectoActualizar, String nuevoEstado) {
//        for (int i = 0; i < nombreProyecto.length; i++) {
//            if (nombreProyecto[i].equalsIgnoreCase(proyectoActualizar)) {
//                estado[i] = nuevoEstado;
//                JOptionPane.showMessageDialog(null, "Estado del proyecto actualizado.");
//                return;
//            }
//        }
//        
//    }
//
//    public static void BuscarProyecto(String[] nombreProyecto, int[] duracion, String[] estado, String proyectoBuscar) {
//        for (int i = 0; i < nombreProyecto.length; i++) {
//            if (nombreProyecto[i].equalsIgnoreCase(proyectoBuscar)) {
//                JOptionPane.showMessageDialog(null, "Nombre del Proyecto: " + nombreProyecto[i]
//                        + "\nDuración: " + duracion[i]
//                        + "\nEstado: " + estado[i]);
//                return;
//            }
//        }
//       
//    }
//     public static void ordenarProyectosPorDuracion(String[] nombres, int[] duraciones, String[] estados) {
//        for (int i = 0; i < duraciones.length - 1; i++) {
//            for (int j = i + 1; j < duraciones.length; j++) {
//                if (duraciones[i] > duraciones[j]) {
//                    int tempDuracion = duraciones[i];
//                    duraciones[i] = duraciones[j];
//                    duraciones[j] = tempDuracion;
//
//                    String tempNombre = nombres[i];
//                    nombres[i] = nombres[j];
//                    nombres[j] = tempNombre;
//
//                    String tempEstado = estados[i];
//                    estados[i] = estados[j];
//                    estados[j] = tempEstado;
//                }
//            }
//        }
//        MostrarProyectos(nombres, duraciones, estados);
//    }
//    
//    
//}
