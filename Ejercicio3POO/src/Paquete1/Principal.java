/*
Ejercicio 4: Construir un programa para una competencia de atletismo,
el programa debe gestionar una serie de atletas caracterizados por su número de atleta, nombre y tiempo de carrera,
al final el programa debe mostrar los datos del atleta ganador de la carrera.
*/
package Paquete1;

import java.util.Scanner;


public class Principal {
    //metodo para verificar el coche más barato
   public static int indiceMbarato(Vehiculo coches[]){
       float precio;
       int indice = 0;
       
       precio = coches [0].getPrecio();
       
       for(int i = 1;i<coches.length;i++){
           if(coches[i].getPrecio()<precio){
               precio=coches[i].getPrecio();
               indice = i;
           }
       }
     
     return indice;
      
   }
    
    
   public static void main(String[]args){
       
       Scanner entrada = new Scanner(System.in);
       String marca,modelo;
       float precio;
       int numVehiculos,indiceBarato;
       
       System.out.print("Digite la cantidad de Vehiculos: ");
       numVehiculos = entrada.nextInt();
       
       
       //Los objetos para los coches
       Vehiculo coches[] =new Vehiculo[numVehiculos];
       
       for(int i =0;i<coches.length;i++){
           entrada.nextLine();
           System.out.println("Digite las caracteristicas del coche "+(i+1)+":");
           System.out.print("Introduzca la Marca: ");
           marca= entrada.nextLine();
           System.out.print("Introduzca el Modelo: ");
           modelo=entrada.nextLine();
           System.out.print("Introduzca el precio del coche: ");
           precio=entrada.nextFloat();
           
           coches[i]=new Vehiculo(marca,modelo,precio);
       }
       indiceBarato = indiceMbarato(coches);
       System.out.println("\nEl coche más barato es: "+coches[indiceBarato].mostrarDatos());
   }
}
