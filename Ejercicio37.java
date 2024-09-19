//
//package Matrices;
//
//import java.util.ArrayList;
//import java.util.List;
//import javax.swing.JOptionPane;
//
//public class Ejercicio37 {
//    public static void main(String[] args) {
//        List<String[]> pedidos = new ArrayList<>();
//
//        while (true) {
//            String opcion = JOptionPane.showInputDialog(
//                "Seleccione una opción:\n" +
//                "1. Registrar nuevo pedido\n" +
//                "2. Actualizar o eliminar pedido\n" +
//                "3. Mostrar información de pedidos\n" +
//                "4. Salir"
//            );
//
//            switch (opcion) {
//                case "1":
//                    registrarPedido(pedidos);
//                    break;
//                case "2":
//                    actualizarOEliminarPedido(pedidos);
//                    break;
//                case "3":
//                    mostrarInformacionPedidos(pedidos);
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
//    public static void registrarPedido(List<String[]> pedidos) {
//        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
//        String numeroMesa = JOptionPane.showInputDialog("Ingrese el número de mesa");
//
//        List<String> platos = new ArrayList<>();
//        List<Double> precios = new ArrayList<>();
//        while (true) {
//            String plato = JOptionPane.showInputDialog("Ingrese el nombre del plato (o 'fin' para terminar)");
//            if (plato.equalsIgnoreCase("fin")) break;
//            platos.add(plato);
//            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del plato"));
//            precios.add(precio);
//        }
//
//        String[] platosArray = platos.toArray(new String[0]);
//        String[] preciosArray = precios.stream().map(String::valueOf).toArray(String[]::new);
//
//        pedidos.add(new String[] { nombreCliente, numeroMesa, String.join(",", platosArray), String.join(",", preciosArray) });
//
//        JOptionPane.showMessageDialog(null, "Pedido registrado exitosamente.");
//    }
//
//    public static void actualizarOEliminarPedido(List<String[]> pedidos) {
//        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente del pedido a actualizar/eliminar");
//
//        for (int i = 0; i < pedidos.size(); i++) {
//            if (pedidos.get(i)[0].equalsIgnoreCase(nombreCliente)) {
//                String opcion = JOptionPane.showInputDialog(
//                    "Seleccione una opción:\n" +
//                    "1. Actualizar pedido\n" +
//                    "2. Eliminar pedido"
//                );
//
//                if (opcion.equals("1")) {
//                    String nuevoNumeroMesa = JOptionPane.showInputDialog("Ingrese el nuevo número de mesa");
//                    pedidos.get(i)[1] = nuevoNumeroMesa;
//    
//                    List<String> platos = new ArrayList<>();
//                    List<Double> precios = new ArrayList<>();
//                    while (true) {
//                        String plato = JOptionPane.showInputDialog("Ingrese el nombre del plato (o 'fin' para terminar)");
//                        if (plato.equalsIgnoreCase("fin")) break;
//                        platos.add(plato);
//                        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del plato"));
//                        precios.add(precio);
//                    }
//
//                    String[] platosArray = platos.toArray(new String[0]);
//                    String[] preciosArray = precios.stream().map(String::valueOf).toArray(String[]::new);
//
//                    pedidos.get(i)[2] = String.join(",", platosArray);
//                    pedidos.get(i)[3] = String.join(",", preciosArray);
//
//                    JOptionPane.showMessageDialog(null, "Pedido actualizado exitosamente.");
//                } else if (opcion.equals("2")) {
//                    pedidos.remove(i);
//                    JOptionPane.showMessageDialog(null, "Pedido eliminado exitosamente.");
//                }
//                return;
//            }
//        }
//        JOptionPane.showMessageDialog(null, "Pedido no encontrado.");
//    }
//
//    public static void mostrarInformacionPedidos(List<String[]> pedidos) {
//        StringBuilder informacion = new StringBuilder("Información de Pedidos:\n");
//
//        for (String[] pedido : pedidos) {
//            String nombreCliente = pedido[0];
//            String numeroMesa = pedido[1];
//            String[] platos = pedido[2].split(",");
//            String[] precios = pedido[3].split(",");
//
//            double total = 0;
//            StringBuilder detallesPlatos = new StringBuilder();
//            for (int i = 0; i < platos.length; i++) {
//                detallesPlatos.append(platos[i]).append(" - $").append(precios[i]).append("\n");
//                total += Double.parseDouble(precios[i]);
//            }
//
//            informacion.append("Nombre del Cliente: ").append(nombreCliente)
//                .append("\nNúmero de Mesa: ").append(numeroMesa)
//                .append("\nPlatos Solicitados:\n").append(detallesPlatos)
//                .append("Total a Pagar: $").append(total)
//                .append("\n\n");
//        }
//
//        JOptionPane.showMessageDialog(null, informacion.toString());
//    }
//}
