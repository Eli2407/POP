//
//package Arrays;
//
//import javax.swing.JOptionPane;
//
//public class Ejercicio23 {
//    
//    public static void main(String[]args){
//        int[] numero = {1, 2, 3, 4};
//        boolean[] disponible = {true, false, true, true};
//        int[] capacidad = {4, 2, 6, 4};
//        
//        mostrarMesa(numero, disponible, capacidad);
//        
//        int mesaReservar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la mesa que desea reservar"));
//        realizarReserva(numero, disponible, mesaReservar);
//        
//        int mesaCancelada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la mesa que desea cancelar"));
//        CancelarReserva(numero, disponible, mesaCancelada);
//        
//        int capacidadBuscada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad mínima que busca"));
//        BuscandoMesa(numero, capacidad, capacidadBuscada);
//        
//        OrdenandoMesas(numero, disponible, capacidad);
//    }
//    public static void mostrarMesa(int[] numero, boolean[] disponible,int[]capacidad){
//        StringBuilder listaMesa = new StringBuilder("Lista de Mesas:\n");
//        for(int i =0;i<numero.length;i++){
//            listaMesa.append("Mesa ").append(numero[i])
//                    .append("\nDisponible: ").append(disponible[i]?"Si":"No")
//                    .append("\nCapacidad: ").append(capacidad[i])
//                    .append("\n");
//        }
//        JOptionPane.showMessageDialog(null,listaMesa.toString());
//    }
//    
//    public static void realizarReserva(int[] numero, boolean[] disponible,int mesaReserva){
//        for(int i =0;i< numero.length;i++){
//            if(numero[i]== mesaReserva){
//                if(disponible[i]){
//                    disponible[i]=false;
//                    JOptionPane.showMessageDialog(null,"Su reserva a sido Exitosa");
//                    
//                }else {
//                    JOptionPane.showMessageDialog(null,"La mesa"+mesaReserva+"No se encuentra disponible");
//                    
//                }
//                return;
//            }
//        }
//    }
//    
//    public static void CancelarReserva(int[] numero, boolean[] disponible,int mesaCancelada){
//      for(int i=0;i<numero.length;i++){
//          if(numero[i]== mesaCancelada){
//              if(!disponible[i]){
//                  disponible[i]= true;
//                  JOptionPane.showMessageDialog(null,"Su reserva a sido cancelada Exitosamente");
//                  
//              }
//              return;
//          }
//      }
//    }
//    public static void BuscandoMesa(int[] numero,int[]capacidad,int capacidadBuscada){
//        StringBuilder resultado = new StringBuilder("Mesas Encontradas:\n");
//        for(int i=0;i<numero.length;i++){
//            if(capacidad[i]==capacidadBuscada){
//                resultado.append("Mesa").append(numero[i])
//                        .append("\nCapacidad").append(capacidad[i])
//                        .append("\n");
//                
//            }
//        }
//        JOptionPane.showMessageDialog(null, resultado.length() > 0 ? resultado.toString() : "No se encontraron mesas.");
//    }
//    
//    public static void OrdenandoMesas(int[] numero, boolean[] disponible,int[]capacidad){
//         for (int i = 0; i < capacidad.length - 1; i++) {
//            for (int j = i + 1; j < capacidad.length; j++) {
//                if (capacidad[i] > capacidad[j]) {
//                    int tempNum = numero[i];
//                    numero[i] = numero[j];
//                    numero[j] = tempNum;
//                    
//                    boolean tempDisp = disponible[i];
//                    disponible[i] = disponible[j];
//                    disponible[j] = tempDisp;
//                    
//                    int tempCap = capacidad[i];
//                    capacidad[i] = capacidad[j];
//                    capacidad[j] = tempCap;
//                }
//            }
//        }
//        mostrarMesa(numero, disponible, capacidad);
//    }
//}

