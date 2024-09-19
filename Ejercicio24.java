//
//package Arrays;
//
//import javax.swing.JOptionPane;
//
//public class Ejercicio24 {
//    public static void main(String[]args){
//        String Prenda[]={"Blusa","Busos","Jeans","Caquetas"};
//        int cantidadStock[]={1,3,7,4};
//        double precio[] = {25000,60000,85000,70000};
//        
//        mostrandoInventario(Prenda,cantidadStock,precio);
//        
//        String prendaAgregar = JOptionPane.showInputDialog("Ingrese el tipo de prenda que desea agregar");
//        int unidades= Integer.parseInt(JOptionPane.showInputDialog("Ingrese las unidades que desea ingresar"));
//        IngresarPrenda(Prenda,cantidadStock,prendaAgregar,unidades);
//        
//        String prendaVender = JOptionPane.showInputDialog("Ingrese la prenda que desea vender:");
//        int unidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de prendas a vender"));
//        vendiendoProductos(Prenda,cantidadStock,prendaVender,unidad);
//        String tipoBuscar = JOptionPane.showInputDialog("Ingrese el tipo de producto que desea buscar");
//        buscarProducto(Prenda, cantidadStock, precio, tipoBuscar);
//        ordenarPorPrecio(Prenda,cantidadStock,precio);
//    }
//    
//    public static void mostrandoInventario(String[]Prenda,int[]cantidadStock,double[]precio){
//        StringBuilder inventario = new StringBuilder("Inventario Prendas: \n");
//        for(int i = 0; i< cantidadStock.length;i++){
//            inventario.append("Prenda: ").append(Prenda[i])
//                    .append("\nCantidad: ").append(cantidadStock[i])
//                    .append("\nprecio: ").append(precio[i])
//                    .append("\n");
//        }
//        JOptionPane.showMessageDialog(null,inventario.toString());
//    }
//    public static void IngresarPrenda(String[]Prenda,int[]cantidad,String prendaAgregar,int unidades ){
//        for(int i=0;i<Prenda.length;i++){
//            if(Prenda[i].equalsIgnoreCase(prendaAgregar)){
//                cantidad[i] += unidades;
//                JOptionPane.showMessageDialog(null,"Se han agregado"+unidades+"unidades de"+prendaAgregar);
//                return;
//            }
//        }
//    }
//    public static void vendiendoProductos(String[] Prenda, int[] cantidad, String prendaVender, int unidades){
//        for(int  i= 0; i < Prenda.length;i++){
//            if(Prenda[i].equalsIgnoreCase(prendaVender)){
//                if(cantidad[i]>= unidades){
//                    cantidad[i]-=unidades;
//                    JOptionPane.showMessageDialog(null,"Venta Exitosa");
//                }else{
//                    JOptionPane.showMessageDialog(null,"no hay suficiente cantidad de "+prendaVender);
//                }
//            }
//        }
//    }
//    
//     public static void ordenarPorPrecio(String[] Prenda, int[] cantidad, double[] precio) {
//        for (int i = 0; i < precio.length - 1; i++) {
//            for (int j = i + 1; j < precio.length; j++) {
//                if (precio[i] > precio[j]) {
//                    double tempPrecio = precio[i];
//                    precio[i] = precio[j];
//                    precio[j] = tempPrecio;
//                    
//                    String tempTipo = Prenda[i];
//                    Prenda[i] = Prenda[j];
//                    Prenda[j] = tempTipo;
//                    
//                    int tempCantidad = cantidad[i];
//                    cantidad[i] = cantidad[j];
//                    cantidad[j] = tempCantidad;
//                }
//            }
//        }
//        mostrandoInventario(Prenda, cantidad, precio);
//    }
//     
//      public static void buscarProducto(String[] Prenda, int[] cantidad, double[] precio, String tipoBuscar) {
//        for (int i = 0; i < Prenda.length; i++) {
//            if (Prenda[i].equalsIgnoreCase(tipoBuscar)) {
//                JOptionPane.showMessageDialog(null, "Tipo: " + Prenda[i]
//                        + " \nCantidad: " + cantidad[i]
//                        + " \nPrecio: " + precio[i]);
//                return;
//            }
//        }
//        JOptionPane.showMessageDialog(null, "Producto no encontrado.");
//    }
//}
