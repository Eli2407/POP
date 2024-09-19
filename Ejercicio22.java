//
//package Arrays;
//
//import javax.swing.JOptionPane;
//
//public class Ejercicio22 {
//        public static void main(String[]args){
//     
//       String[] modelo= {"rapide","Thema","Quanto","Elise"};
//       String[] matricula = {"w123u","t6654n","g276j","y875m"};
//       double[] precioDia = {22422,3565,2452,545741};
//       String[] disponibilidad ={"Disponible","no Disponible","Disponible","Disponible"};
//       
//       mostrarVehiculos(modelo,matricula,precioDia,disponibilidad);
//       
//       String buscarVehiculo = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo que desea buscar");
//       buscandoVehiculo(modelo,matricula,precioDia,disponibilidad,buscarVehiculo);
//       ordenarLista(modelo,matricula,precioDia,disponibilidad);
//       
//    }
//    
//     public static void mostrarVehiculos(String[]modelo,String[]matricula,double[]precioDia,String[]disponibilidad){
//           StringBuilder listaVehiculo = new StringBuilder("Lista Vehiculos:\n");
//           for(int i=0;i < modelo.length;i++){
//           listaVehiculo.append("Modelo Auto: ").append(modelo[i]).append("\nMatricula: ").append(matricula[i]).append("\nPrecio:  ").append(precioDia[i]).append("\nDisponibilidad: ").append(disponibilidad[i]).append("\n");
//           
//       }
//       JOptionPane.showMessageDialog(null,listaVehiculo.toString());
//           
//       }
//    
//    public static void buscandoVehiculo(String[]modelo,String[]matricula,double[]precioDia,String[]disponibilidad, String BuscandoModelo){
//        for(int i =0; i< modelo.length;i++){
//           if(modelo[i].equalsIgnoreCase(BuscandoModelo)){
//               JOptionPane.showMessageDialog(null, "Modelo Auto: " + modelo[i] + 
//                       "\nMatricula: " + matricula[i] + 
//                       "\n precio: " + precioDia[i]+
//                       "\nDisponibilidad"+disponibilidad[i]);
//                return;
//           }
//       }
//       JOptionPane.showMessageDialog(null,"Modelo no encontrado.");
//    }
//    
//    public static void ordenarLista(String[]modelo,String[]matricula,double[]precioDia,String[]disponibilidad){
//        for(int i =0; i < modelo.length -1;i++){
//           for(int j=i + 1;j<modelo.length;j++){
//           if(modelo[i].compareToIgnoreCase(modelo[j])>0){
//               String temModelo = modelo[i];
//               modelo[i]= modelo[j];
//               modelo[j]= temModelo;
//               
//               String temMatricula= matricula[i];
//               matricula[i]= matricula[j];
//               matricula[j]= temMatricula;
//               
//               double temPrecio = precioDia[i];
//               precioDia[i]= precioDia[j];
//               precioDia[j]= temPrecio;
//               
//               String temDisponibilidad = disponibilidad[i];
//               disponibilidad[i]=disponibilidad[j];
//               disponibilidad[j] = temDisponibilidad;
//               
//           }
//       }
//           
//       }
//        mostrarVehiculos(modelo,matricula,precioDia,disponibilidad);
//    }
//    
//
//}
