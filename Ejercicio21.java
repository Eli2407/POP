//package Arrays;
//import javax.swing.JOptionPane;
//public class Ejercicio21 {
//   public static void main (String[] args){
//       String[] titulo = {"El Código da Vinci","El señor de los anillos"," El diario de Ana Frank"};
//       String[] autor = {"Dan Brown","J. R. R. Tolkien","Ana Frank"};
//       int[] cantidad = {21,12,5};
//       
//       
//       mostrarInventario(titulo,autor,cantidad);
//       
//       int indiceLibro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice del libro para agregar copias (0 a "+(titulo.length -1)+"):"));
//       int cantidadCopias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de copias: "));
//       cantidad[indiceLibro]+=cantidadCopias;
//       
//       indiceLibro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice del libro para prestar (0 a"+(titulo.length - 1)+"):"));
//       if (cantidad[indiceLibro] > 0) {
//            cantidad[indiceLibro]--;
//            JOptionPane.showMessageDialog(null, "Libro prestado con éxito.");
//        } else {
//            JOptionPane.showMessageDialog(null, "No hay stock disponible.");
//        }
//       
//       String buscarLibro = JOptionPane.showInputDialog("Ingrese el nombre del libro que desea buscar");
//       buscandoLibro(titulo,autor,cantidad,buscarLibro);
//       
//       ordenarInventario(titulo,autor,cantidad);
//       mostrarInventario(titulo,autor,cantidad);
//  
//   }
//    
//   public static void mostrarInventario(String[]titulo,String[]autor,int[]cantidad){
//       //stringBuilder:Utilizado para construir cadenas de caracteres modificables de forma eficiente
//       StringBuilder inventarioBiblioteca = new StringBuilder("Inventario Biblioteca:\n");
//       for(int i=0;i < titulo.length;i++){
//           inventarioBiblioteca.append("Titulo: ").append(titulo[i]).append("\nAutor: ").append(autor[i]).append("\nCantidad: ").append(cantidad[i]).append("\n");
//           
//       }
//       JOptionPane.showMessageDialog(null,inventarioBiblioteca.toString());
//   }
//   
//   public static void buscandoLibro(String[] titulos, String[] autores, int[] stock, String titulo){
//       for(int i =0; i< titulos.length;i++){
//           if(titulos[i].equals(titulo)){
//               JOptionPane.showMessageDialog(null, "Título: " + titulos[i] + "\nAutor: " + autores[i] + "\nStock: " + stock[i]);
//                return;
//           }
//       }
//       JOptionPane.showMessageDialog(null,"Libro no encontrado.");
//   }
//   
//   public static void ordenarInventario(String[]titulo,String[]autor,int[]cantidad){
//       for(int i =0; i < titulo.length -1;i++){
//           for(int j=i + 1;j<titulo.length;j++){
//           if(titulo[i].compareToIgnoreCase(titulo[j])>0){
//               String temTitulo = titulo[i];
//               titulo[i]= titulo[j];
//               titulo[j]= temTitulo;
//               
//               String temAutor= autor[i];
//               autor[i]= autor[j];
//               autor[j]= temAutor;
//               
//               int temCantidad = cantidad[i];
//               cantidad[i]= cantidad[j];
//               cantidad[j]= temCantidad;
//           }
//         }
//           
//       }
//       mostrarInventario(titulo,autor,cantidad);
//       
//
//   }
   
   

