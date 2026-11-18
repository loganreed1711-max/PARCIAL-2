package Segundo_Parcial;
import java.util.Scanner;

public class Tarea3_Class4_Ceron {

 // cuenta los digitos del numero
 static int contarDigitos(int n){
   if(n == 0){return 1;}
   int cantidad = 0;
   while(n > 0){
      cantidad++;
      n = n / 10;
   }
   return cantidad;
 }

 // saca la potencia
 static int potencia(int b,int e){
    int r =1;
    for(int i=0;i<e;i++){
     r = r * b;
    }
    return r;
 }

 // revisa si es numero armstrong
 static boolean esArmstrong(int n){
  if(n <0){return false;}
   int cantidad = contarDigitos(n);
 int copia = n;
   int suma = 0;

   do{
     int digito= copia % 10;
    suma = suma + potencia(digito,cantidad);
     copia =copia / 10;
   }while(copia > 0);

   return suma == n;
 }

 public static void main(String[] args){
   Scanner sc =new Scanner(System.in);
 System.out.print("ingrese un numero: ");
   int n = sc.nextInt();

   if(esArmstrong(n)){
    System.out.println("si es numero Armstrong");
   }else{
     System.out.println("no es numero Armstrong");
   }

   sc.close();
 }
}