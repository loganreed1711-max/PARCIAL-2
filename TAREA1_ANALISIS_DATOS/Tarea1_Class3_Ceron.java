package Segundo_Parcial;
import java.util.Scanner;

public class Tarea1_Class3_Ceron {
    //METODOS

 static double volumen(double lado){
    return lado * lado * lado;
 }
 
 static double volumen(double radio,double altura){
    return 3.1416 * radio * radio * altura;
 }

 static double volumen(double largo,double ancho,double altura){
    return largo * ancho * altura;
 }

 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

 System.out.println("CALCULADORA DE VOLUMEN");
 System.out.println("1. Cubo");
   System.out.println("2. Cilindro");
 System.out.println("3. Prisma rectangular");
   System.out.print("Elija una opcion: ");
int opcion = sc.nextInt();

   double resultado = 0;
boolean valido = true;

   switch(opcion){
     case 1:
   System.out.print("ingrese el lado: ");
       double lado = sc.nextDouble();
     if(lado <= 0){
         valido = false;
     }else{
         resultado = volumen(lado);
   }
       break;
     case 2:
     System.out.print("ingrese el radio: ");
       double radio = sc.nextDouble();
   System.out.print("ingrese la altura: ");
       double altura = sc.nextDouble();
       if(radio <= 0 || altura <= 0){
     valido = false;
       }else{
         resultado = volumen(radio,altura);
       }
     break;
     case 3:
       System.out.print("Ingrese largo: ");
      double largo = sc.nextDouble();
      System.out.print("Ingrese ancho: ");
       double ancho = sc.nextDouble();
    System.out.print("Ingrese altura: ");
       double alt = sc.nextDouble();
       if(largo <= 0 || ancho <= 0 || alt <= 0){
       valido = false;
       }else{
         resultado = volumen(largo,ancho,alt);
       }
       break;
  default:
       System.out.println("opcion incorrecta");
       valido = false;
       break;
   }

   if(valido){
     System.out.println("el volumen es: "+resultado);
   }else if(opcion >= 1 && opcion <= 3){
     System.out.println("las medidas tienen que ser mayores a cero");
   }

   sc.close();
 }
}
