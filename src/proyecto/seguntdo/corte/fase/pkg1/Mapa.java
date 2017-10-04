/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.seguntdo.corte.fase.pkg1;

import java.util.Random;

/**
 *
 * @author LabingXEON
 */
public class Mapa {

   int alto=0;
   int ancho=0;
   int jugador=0;
   int armas=0;
   int vidas=0;
   
   Random r=new Random();
   

    Mapa(int alto, int ancho, int jugador, int armas, int vidas) {
      Casilla casillas[][];
      this.alto=alto+2;
      this.ancho=ancho+2;
      casillas= new Casilla[this.alto][this.ancho];
      for (int i=0;i<this.alto;i++)
        {
            for (int j=0;j<this.ancho;j++)
            {
                if(i==0||j==0||j==this.ancho-1||i==this.alto-1){
                    casillas[i][j]= new EspacioBorde() {
                        @Override
                        public void setCasilla(String a) {
                            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        }

                        @Override
                        public String getCasilla() {
                            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        }
                    };
                }
                 else
                {
                    casillas[i][j]= new EspacioVacio();
                }
            }
        
        }
    }
    
}
