package Segundo_Parcial;

    import java.util.Scanner;
public class Tarea1_Class1_Ceron {
 static double leerConsumo(Scanner sc){
   double consumo;
   
   
   do{
     System.out.print("Ingresee los metros cubicos de agua: ");
     consumo = sc.nextDouble();  if(consumo < 0){
       System.out.println("El consumo no deberia ser negativo, intente de nuevo.");
     }
   }while(consumo < 0);
  return consumo;
 }
 
 static double calcularValor(double m3){
 double valor;
   if(m3 <= 15){
    valor =( m3 * 0.40) + 2.50;
   }else{
     valor = 15 * 0.40 + ((m3 - 15) * 0.75) + 2.50;
 }
   return valor;
 }
 
 static void mostrarPlanilla(double m3, double total){
System.out.println("PLANILLA DE CONSUMO DE AGUA: ");
 System.out.println("Consumo: " + m3 + " m3");
 System.out.println("Total a pagar:"+total);
 }
 
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
double consumo = leerConsumo(sc);
double total = calcularValor(consumo);
 mostrarPlanilla(consumo,total);
sc.close();
 }
}

    

