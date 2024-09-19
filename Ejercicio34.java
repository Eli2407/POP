//
//package Matrices;
//
//import javax.swing.JOptionPane;
//
//public class Ejercicio34 {
//    public static void main(String[] args) {
// 
//        String[][] libros = {
//            {"Cien años de soledad", "Gabriel García Márquez", "978-3-16-148410-0", "30.50", "12"},
//            {"Don Quijote", "Miguel de Cervantes", "978-0-14-243723-0", "25.75", "8"},
//            {"El Principito", "Antoine de Saint-Exupéry", "978-0-15-601219-5", "15.90", "20"}
//        };
//
//        mostrarInventario(libros);
//
//        String[] nuevoLibro = {
//            JOptionPane.showInputDialog("Ingrese el título del nuevo libro"),
//            JOptionPane.showInputDialog("Ingrese el autor del nuevo libro"),
//            JOptionPane.showInputDialog("Ingrese el ISBN del nuevo libro"),
//            JOptionPane.showInputDialog("Ingrese el precio del nuevo libro"),
//            JOptionPane.showInputDialog("Ingrese la cantidad en stock del nuevo libro")
//        };
//        agregarLibro(libros, nuevoLibro);
//
//        String isbnEliminar = JOptionPane.showInputDialog("Ingrese el ISBN del libro que desea eliminar");
//        eliminarLibro(libros, isbnEliminar);
//
//        double valorTotal = calcularValorTotal(libros);
//        JOptionPane.showMessageDialog(null, "El valor total del inventario es: $" + valorTotal);
//
//      
//        mostrarInventarioDetallado(libros);
//    }
//
//    public static void mostrarInventario(String[][] libros) {
//        StringBuilder inventario = new StringBuilder("Inventario de Libros: \n");
//        for (int i = 0; i < libros.length; i++) {
//            inventario.append("Título: ").append(libros[i][0])
//                    .append("\nAutor: ").append(libros[i][1])
//                    .append("\nISBN: ").append(libros[i][2])
//                    .append("\nPrecio: ").append(libros[i][3])
//                    .append("\nCantidad en Stock: ").append(libros[i][4])
//                    .append("\n");
//        }
//        JOptionPane.showMessageDialog(null, inventario.toString());
//    }
//
//    public static void agregarLibro(String[][] libros, String[] nuevoLibro) {
//        String[][] nuevosLibros = new String[libros.length + 1][5];
//        for (int i = 0; i < libros.length; i++) {
//            nuevosLibros[i] = libros[i];
//        }
//        nuevosLibros[libros.length] = nuevoLibro;
//        libros = nuevosLibros;
//
//        JOptionPane.showMessageDialog(null, "Libro agregado exitosamente.");
//    }
//
//    public static void eliminarLibro(String[][] libros, String isbn) {
//        int index = -1;
//        for (int i = 0; i < libros.length; i++) {
//            if (libros[i][2].equals(isbn)) {
//                index = i;
//                break;
//            }
//        }
//
//        if (index != -1) {
//            String[][] nuevosLibros = new String[libros.length - 1][5];
//            for (int i = 0, j = 0; i < libros.length; i++) {
//                if (i != index) {
//                    nuevosLibros[j++] = libros[i];
//                }
//            }
//            libros = nuevosLibros;
//            JOptionPane.showMessageDialog(null, "Libro eliminado exitosamente.");
//        } else {
//            JOptionPane.showMessageDialog(null, "Libro no encontrado.");
//        }
//    }
//
//    public static double calcularValorTotal(String[][] libros) {
//        double valorTotal = 0;
//        for (String[] libro : libros) {
//            double precio = Double.parseDouble(libro[3]);
//            int cantidad = Integer.parseInt(libro[4]);
//            valorTotal += precio * cantidad;
//        }
//        return valorTotal;
//    }
//
//    public static void mostrarInventarioDetallado(String[][] libros) {
//        StringBuilder inventarioDetallado = new StringBuilder("Información Detallada de los Libros: \n");
//        for(int i = 0; i < libros.length; i++) {
//            double precio = Double.parseDouble(libros[i][3]);
//            int cantidad = Integer.parseInt(libros[i][4]);
//            double valorTotalLibro = precio * cantidad;
//            inventarioDetallado.append("Título: ").append(libros[i][0])
//                    .append("\nAutor: ").append(libros[i][1])
//                    .append("\nISBN: ").append(libros[i][2])
//                    .append("\nPrecio: ").append(libros[i][3])
//                    .append("\nCantidad en Stock: ").append(libros[i][4])
//                    .append("\nValor Total del Libro: ").append(valorTotalLibro)
//                    .append("\n\n");
//        }
//        JOptionPane.showMessageDialog(null, inventarioDetallado.toString());
//    }
//}
