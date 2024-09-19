//
//package Arrays;
//
//import javax.swing.JOptionPane;
//
//public class Ejercicio26 {
//    private static final int MAX_MIEMBROS = 100;
//    private static Miembro[] miembros = new Miembro[MAX_MIEMBROS];
//    private static int numMiembros = 0;
//
//    public static void main(String[] args) {
//        inicializarMiembros();
//
//        while (true) {
//            String opcion = JOptionPane.showInputDialog(
//                "Seleccione una opción:\n" +
//                "1. Mostrar lista completa de miembros\n" +
//                "2. Agregar nuevo miembro\n" +
//                "3. Actualizar cuota mensual de un miembro\n" +
//                "4. Buscar miembro por nombre\n" +
//                "5. Calcular y mostrar promedio de edad de los miembros\n" +
//                "6. Salir"
//            );
//
//            switch (opcion) {
//                case "1":
//                    mostrarListaMiembros();
//                    break;
//                case "2":
//                    agregarMiembro();
//                    break;
//                case "3":
//                    actualizarCuota();
//                    break;
//                case "4":
//                    buscarMiembro();
//                    break;
//                case "5":
//                    calcularPromedioEdad();
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
//    public static void inicializarMiembros() {
//        miembros[0] = new Miembro("Daniela Pérez", 25, "Fútbol", 50);
//        miembros[1] = new Miembro("Ana Gómez", 30, "Natación", 40);
//        miembros[2] = new Miembro("Luis Martínez", 22, "Baloncesto", 45);
//        numMiembros = 3; 
//    }
//
//    public static void mostrarListaMiembros() {
//        if (numMiembros == 0) {
//            JOptionPane.showMessageDialog(null, "No hay miembros en el club.");
//            return;
//        }
//
//        StringBuilder lista = new StringBuilder("Lista de Miembros:\n");
//        for (int i = 0; i < numMiembros; i++) {
//            Miembro m = miembros[i];
//            lista.append("Nombre: ").append(m.getNombre())
//                 .append("\nEdad: ").append(m.getEdad())
//                 .append("\nDeporte: ").append(m.getDeporte())
//                 .append("\nCuota Mensual: $").append(m.getCuotaMensual())
//                 .append("\n");
//        }
//        JOptionPane.showMessageDialog(null, lista.toString());
//    }
//
//    public static void agregarMiembro() {
//        if (numMiembros >= MAX_MIEMBROS) {
//            JOptionPane.showMessageDialog(null, "No se pueden agregar más miembros.");
//            return;
//        }
//
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del miembro");
//        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del miembro"));
//        String deporte = JOptionPane.showInputDialog("Ingrese el deporte del miembro");
//        double cuotaMensual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cuota mensual"));
//
//        miembros[numMiembros] = new Miembro(nombre, edad, deporte, cuotaMensual);
//        numMiembros++;
//        JOptionPane.showMessageDialog(null, "Miembro agregado exitosamente.");
//    }
//
//    public static void actualizarCuota() {
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del miembro para actualizar la cuota");
//        Miembro miembro = buscarMiembroPorNombre(nombre);
//
//        if (miembro != null) {
//            double nuevaCuota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nueva cuota mensual"));
//            miembro.setCuotaMensual(nuevaCuota);
//            JOptionPane.showMessageDialog(null, "Cuota mensual actualizada.");
//        } else {
//            JOptionPane.showMessageDialog(null, "Miembro no encontrado.");
//        }
//    }
//
//    public static void buscarMiembro() {
//        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del miembro a buscar");
//        Miembro miembro = buscarMiembroPorNombre(nombre);
//
//        if (miembro != null) {
//            JOptionPane.showMessageDialog(null,
//                "Nombre: " + miembro.getNombre() +
//                "\nEdad: " + miembro.getEdad() +
//                "\nDeporte: " + miembro.getDeporte() +
//                "\nCuota Mensual: $" + miembro.getCuotaMensual());
//        } else {
//            JOptionPane.showMessageDialog(null, "Miembro no encontrado.");
//        }
//    }
//
//    public static void calcularPromedioEdad() {
//        if (numMiembros == 0) {
//            JOptionPane.showMessageDialog(null, "No hay miembros en el club.");
//            return;
//        }
//
//        int sumaEdad = 0;
//        for (int i = 0; i < numMiembros; i++) {
//            sumaEdad += miembros[i].getEdad();
//        }
//        double promedioEdad = (double) sumaEdad / numMiembros;
//        JOptionPane.showMessageDialog(null, "Promedio de edad de los miembros: " + promedioEdad);
//    }
//
//    private static Miembro buscarMiembroPorNombre(String nombre) {
//        for (int i = 0; i < numMiembros; i++) {
//            if (miembros[i].getNombre().equalsIgnoreCase(nombre)) {
//                return miembros[i];
//            }
//        }
//        return null;
//    }
//}
//
//class Miembro {
//    private String nombre;
//    private int edad;
//    private String deporte;
//    private double cuotaMensual;
//
//    public Miembro(String nombre, int edad, String deporte, double cuotaMensual) {
//        this.nombre = nombre;
//        this.edad = edad;
//        this.deporte = deporte;
//        this.cuotaMensual = cuotaMensual;
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
//    public String getDeporte() {
//        return deporte;
//    }
//
//    public double getCuotaMensual() {
//        return cuotaMensual;
//    }
//
//    public void setCuotaMensual(double cuotaMensual) {
//        this.cuotaMensual = cuotaMensual;
//    }
//}
