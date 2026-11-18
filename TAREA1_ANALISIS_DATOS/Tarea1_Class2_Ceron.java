package Segundo_Parcial;

import java.util.Scanner;
public class Tarea1_Class2_Ceron {
 static double promedio(double a,double b,double c){
    return (a+b+c)/3;
 }
 static String estado(double nota){
  if(nota >= 14){
      return "Aprobado, felicidades";
   }else if(nota >= 9){
      return "Supletorio, tienes otra oportunidad";
   }else{
      return "Reprobado, esfuerzate mas a la proximaa";
   }
 }
 static double necesitaEnSupletorio(double nota){
   return 28 - nota;
 }
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Ingrese  su nota 1: ");
  double n1 = sc.nextDouble();
  System.out.print("Ingrese su nota 2: ");
  double n2 = sc.nextDouble();
  System.out.print("Ingrese su nota 3: ");
  double n3 = sc.nextDouble();
  double prom = promedio(n1,n2,n3);
  System.out.println("Promedio: "+ prom);
  System.out.println("Estado: " + estado(prom));
if(prom >= 9 && prom < 14){
    double minimo = necesitaEnSupletorio(prom);
if(minimo <= 20){
      System.out.println("Necesita en supletorio una nota minima de:" + minimo);
}else{
      System.out.println("No alcanza con nota maxima de 20");
}
}
  sc.close();
 }
}

    
