
import java.util.HashMap;
import javax.swing.JOptionPane;


public class funciones {
 // Ejercicio7:
//      public static void generarInforme(String[] nombres, int[] HorasExtras) {
//        StringBuilder informe = new StringBuilder("Informe de Horas Extras:\n");
//        for (int i = 0; i < nombres.length; i++) {
//            informe.append(nombres[i]).append(": ").append(HorasExtras[i]).append(" horas extras\n");
//        }
//        JOptionPane.showMessageDialog(null, informe.toString());
//    }
//
//
//     public static void main(String[] args) {
//         Ejercicio1:
//        double salarioMensual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario mensual del empleado: "));
//        double PorcentajeRetencion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje de retencion en la fuente(%):"));
//        
//        double salarioAnual = salarioMensual * 12;
//        
//        double retencionFuente = salarioAnual *(PorcentajeRetencion/100);
//        
//         JOptionPane.showMessageDialog(null,"Salario Anual: $"+salarioAnual);
//         JOptionPane.showMessageDialog(null,"Retencion en la fuente: $"+retencionFuente);
//         
//         Ejercicio2:
//         String [] productos = {"FRESAS", "LECHE", "SUAVITEL", "HELADOS"};
//    
//        for (int i = 0; i < productos.length; i++) {
//            
//          int cantidadActual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad actual de " + productos[i])); 
//          int cantidadMinima = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad minima requerida de stock de " + productos[i])); 
//          
//          if(cantidadActual < cantidadMinima ){
//             JOptionPane.showMessageDialog(null, "Debe realizar pedido de " + productos[i] + " tiene "+ cantidadActual+ " y debe tener MINIMO " + cantidadMinima);
//          }
//          
//        }
//         Ejercicio3:
//        
//        double costoMaterial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese costo material:"));
//        double costoManoObra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo de la mano de obra:"));
//        double gastoGeneral = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo de los gastos Generales:"));
//         double costoTotal = costoMaterial + costoManoObra + gastoGeneral;
//       
//        JOptionPane.showMessageDialog(null,"El costo total de produccion es: $"+costoTotal);
//        Ejercicio4:
//               HashMap<String,Double> gananciasTrimestrales = new HashMap<>();
//        
//        boolean ingresar = true;
//        while(ingresar){
//            String departamento = JOptionPane.showInputDialog("Ingrese nombre del departamento(o 'fin'para terminar):");
//            
//            if(departamento== null|| departamento.equalsIgnoreCase("fin")){
//                ingresar = false;
//            }else{
//                String ganancias = JOptionPane.showInputDialog("Ingrese ganancias trimestrales del departamento "+departamento);
//                if(ganancias!= null){
//                  try{
//                    double ganancia= Double.parseDouble(ganancias.trim());
//                     gananciasTrimestrales.put(departamento,ganancia);
//                  } catch (NumberFormatException e){
//                      JOptionPane.showMessageDialog(null,"Ingrese un numero valido para la ganancia.");
//                      
//                  }
//              }
//            }
//        }
//        String mejorDepartamento = null;
//        Double mejorRendimiento = Double.MIN_VALUE;
//        for(String departamento: gananciasTrimestrales.keySet()){
//            double ganancia = gananciasTrimestrales.get(departamento);
//            if(ganancia > mejorRendimiento){
//                mejorRendimiento = ganancia;
//               mejorDepartamento = departamento;
//            }
//            
//        }
//        
//         JOptionPane.showMessageDialog(null, "El departamento con mejor rendimiento es: " + mejorDepartamento);
//          ejercicio5:
//          double valorInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor inicial del activo: "));
//          double valorResidual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor residual del activo: "));
//          int vidaUtil = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la vida util del activo (en años): "));
//          
//          double depreciacionAnual = (valorInicial - valorResidual)/ vidaUtil;
//          JOptionPane.showMessageDialog(null, "La depreciacion anual es de: $"+depreciacionAnual);
//          
//          Ejercicio6:
//          double capitalInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de su capital Iniclal: "));
//          double tasaInteresAnual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tasa de interes anual (%): "));
//          int anios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de años: "));
//          
//          double valorFuturo =capitalInicial * Math.pow(1 + tasaInteresAnual / 100, anios);
//          JOptionPane.showMessageDialog(null,"El valor futuro de la  inversion va a ser de: "+ valorFuturo);
//          
//          Ejercicio7:
//          int numeroEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empleados:"));
//          String[] nombres = new String[numeroEmpleados];
//          int[] HorasExtras = new int[numeroEmpleados];
//          for (int i = 0; i < numeroEmpleados; i++) {
//            nombres[i] = JOptionPane.showInputDialog("Ingrese el nombre del empleado " + (i + 1) + ":");
//            HorasExtras[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas extras trabajadas por " + nombres[i] + ":"));
//        }
//         generarInforme(nombres, HorasExtras);
//        
//     
//         Ejercicio8:
//         double costoMaterial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo de los materiales: "));
//         double costoManoObra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la mano de obra: "));
//         double costoEquipos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo de los Equipos a utlizar"));
//         
//         double costoTotal = costoMaterial + costoManoObra+costoEquipos;
//         JOptionPane.showMessageDialog(null,"El costo Total a cobrar es de: $"+costoTotal);
//         
//         Ejercicio9:
//         
//         int numEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Empleados"));
//
//         double total = 0.0;
//    
//        for (int i = 1; i <= numEmpleados; i++) {
//          
//         int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas por el empleado esta semana "+ i)); 
//         double salarioHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario por hora del empleado "+ i)); 
//         double nomina = horasTrabajadas*salarioHora;
//         total+= nomina;
//         JOptionPane.showMessageDialog(null,"la nomina total de la semana del empleado " +i+ " es de $" +nomina);
//        }
//        
//        JOptionPane.showMessageDialog(null,"El total de nomina que debe pagar es de $"+total);
//    
//        
//        //Ejercicio10:
//        double distancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la distancia (Kilometros)"));
//        double velocidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad promedio en (km/h)"));
//        
//        double tiempoEstimado = distancia / velocidad;
//        JOptionPane.showMessageDialog(null,"el tiempo estimado de entrega es de: "+tiempoEstimado);
//        
//        //Ejercicio11:
//         int numVehiculos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de vehiculos"));
//    
//          double distancias = 0.0;
//          double combustibles = 0.0;
//          double promedio = distancias/combustibles;
//        for (int i = 1; i <= numVehiculos; i++) {
//            
//           double distancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la distancia del vehiculo "+ i)); 
//           double combustible = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el combustible consumido"));  
//           distancias+=distancia;
//           combustibles+=combustible;
//        }
//        
//        JOptionPane.showMessageDialog(null,"El consumo promedio de combustible de la flota es de "+ promedio);
//        
//        //Ejercicio12:
//        String [] equipo ={"Los Guardianes", "Pixel", "Cazadores"};
//        int [] puntos = new int[equipo.length];
//        
//        for (int i = 0; i < equipo.length; i++) {
//            
//          puntos[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los puntos del equipo  " + equipo[i])); 
//    }
//    int mayorGanancias = puntos[0];
//    String equipoL = equipo[0];
//    
//    for (int i = 1; i < puntos.length; i++) {
//            
//       if (puntos[i] > mayorGanancias){
//           
//           mayorGanancias = puntos[i];
//           equipoL = equipo[i]; 
//       }else if (puntos[i] == mayorGanancias){
//           
//          JOptionPane.showMessageDialog(null, "El departamento de "+ equipoL +"Tiene las mismas ganancias que el departamento de "+ equipo[i]);
//          
//       }
//    }
//       JOptionPane.showMessageDialog(null, "El equipo con mayor cantidad de puntos es el de: " + equipoL );
//      
//       
//       //Ejercicio13:
//       int numAsignaturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de asignaturas: "));
//       
//       
//       double sumaCalificacion = 0.0;
//       double promedio1 = 0.0;
//       
//       for(int i=1; i <= numAsignaturas;i++){
//           double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificacion de la asignatura "+i+":"));
//           sumaCalificacion += calificacion;
//       }
//       
//       if(numAsignaturas > 0){
//           promedio1 = sumaCalificacion / numAsignaturas;
//       }
//       JOptionPane.showMessageDialog(null,"El promedio de calificaciones es de: "+promedio1);
//       
//       //Ejercicio14:
//       int numProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de productos: "));
//       String[] nombreProducto = new String[numProducto];
//       double[] calificacions = new double[numProducto];
//       double mejorCalificacion =0.0;
//       String mejorProducto = "";
//       
//       for (int i = 1;i<= numProducto;i++){
//           nombreProducto[i-1]=JOptionPane.showInputDialog("Ingrese el nombre del producto "+ i+":");
//           calificacions[i-1]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificacion del producto "+nombreProducto[i-1]+ ":"));
//           
//           if(calificacions[i-1]>mejorCalificacion){
//               mejorCalificacion = calificacions[i-1];
//               mejorProducto = nombreProducto[i-1];
//           }
//       }
//       JOptionPane.showMessageDialog(null,"El mejor producto guiado por las calificaciones es: "+mejorProducto);
//       
//       
//       //Ejercicio15:
//       int numElectrodomestico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de electrodomesticos"));
//       
//       double[] consumoEnergia = new double[numElectrodomestico];
//       double[] rendimiento = new double[numElectrodomestico];
//       double[] eficiencias = new double[numElectrodomestico];
//       
//       for(int i =1; i <= numElectrodomestico; i++){
//           consumoEnergia[i-1]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el consumo de energia del electrodomestico "+i));
//           rendimiento[i-1] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el rendimiento de electrodomestico "+i));
//           eficiencias[i-1] = rendimiento[i-1] / consumoEnergia[i-1];
//       }
//       
//       for(int i = 1; i<=numElectrodomestico; i++){
//           JOptionPane.showMessageDialog(null,"La eficiencia energetica del electrodomestico es: "+eficiencias[i-1]);
//       }
//       
//       
//       //Ejercicio16:
//       double costoAlquiler = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del alquiler"));
//       double costoCatering = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo  de catering"));
//       double costoEntretenimiento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del entretenimiento"));
//       double GastosAdicionales = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de los costos adicionales"));
//       
//       double Total = costoAlquiler + costoCatering +costoEntretenimiento +GastosAdicionales;
//       JOptionPane.showMessageDialog(null,"El costo total del evento es de: $"+Total);
//       
//       
//       //Ejercicio17:
//       int numCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de clientes"));
//       double sumaSatisfaccion = 0.0;
//       
//       for(int i=1; i <=numCliente; i++){
//           double puntaje =Double.parseDouble(JOptionPane.showInputDialog("Ingrese el puntaje de satisfaccion dado por el cliente:"+i));
//           sumaSatisfaccion += puntaje;
//       }
//       
//       double promedioSatis= sumaSatisfaccion /numCliente;
//       JOptionPane.showMessageDialog(null,"El promedio de satisfaccion es de: "+promedioSatis);
//       
//       
//       //Ejercicio18:
//        int nuMetasE = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de metas establecidas"));
//        int nuMetasC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de metas CUMPLIDAS"));
//    
//        int porcentaje = (nuMetasC/nuMetasE)*100;
//    
//        JOptionPane.showMessageDialog(null, "El porcentaje de cumplimiento es de " +porcentaje+ "%" );
//     
//        
//        //Ejercicio19:
//         int capacidadTotal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad total del almacen"));
//         int espaciOcupado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de espacio ocupado"));
//    
//         JOptionPane.showMessageDialog(null,"La capacidad de almacenamiento restante es de "+ (capacidadTotal-espaciOcupado));
//    
//         
//         //Ejercicio20:
//            int distanciaRecorrida = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad recorrida"));
//            int tarifaTotal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la tarifa total"));
//    
//            JOptionPane.showMessageDialog(null,"El costo por kilometro del viaje es de $"+ (tarifaTotal/distanciaRecorrida));
////    
//    }
//     
}
