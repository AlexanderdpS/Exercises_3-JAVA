/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercises_03;
import java.util.Scanner;
/**
 *
 * @author Instructor
 */
public class Exercises_03 {

    public static void main(String[] args) {
        //Algoritmo para ingresar datos
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingresa el numero a mostrar: ");
        int n = dato.nextInt();
        //Parte II
        int sum=0;
        int i;       
        for(i=0;i<=n;i+=2){
            sum = sum + i;
            System.out.println("Numeros pares:"+i);    
            
        }
        System.out.println("La suma es:"+sum); 
        }
        
    }
