/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.seguntdo.corte.fase.pkg1;

import java.util.Scanner;

/**
 *
 * @author Labin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner scan= new Scanner(System.in);
       
        char x = 0;
        System.out.println("HOLA AMIGO!!!  BIENVENIDO A ESTA AVENTURA"); 
        char[][] mapa;
        System.out.println("Ingrese valor para A");
        int A= scan.nextInt();
        System.out.println("Ingrese valor para B");
        int B= scan.nextInt();
        mapa= new char [A][B];
        for (int i=0;i<A;i++)
        {
            for (int j=0;j<B;j++)
            {
                if(i==0||j==0||j==B-1||i==A-1)
                    mapa[i][j]='x'; //llenando el mapa
                else
                    mapa[i][j]=' ';
                
            }
        }
  
        for (int i=0;i<A;i++)
        {
            for (int j=0;j<B;j++)
            {
               
                System.out.print(mapa[i][j]);
                
            }
             System.out.println("");
               
        }  
        
        
        
    } 

  
    }

