/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercenarywars;

import java.util.Random;

/**
 *
 * @author Labin
 */
public class Mapa {


    private Casilla [][] mapa;
    private int A;
    private int B;
    private Random r;
    private int maxJugadores;
    private int armas;
    private int curas;

    
    public Casilla[][]getMapa()
    {
        return mapa;
    }
    

    public Mapa(int a,int b){
        this.A=a+2;
        this.B=b+2;
        r=new Random();
        mapa=new Casilla[A][B];
        for(int i=0;i<A;i++)
        {
            for(int j=0;j<B;j++)
            {
                if(i==0 || i==A-1 || j==0 || j==B-1)
                {
                    mapa[i][j]=new CasillaBorde();
                }
                else
                {
                    mapa[i][j]=new CasillaVacia();
                }
            }
        }
    }

    void setJugadores(int jug) {
       this.maxJugadores=jug;
    }

    void addJugador(int jug) {
        char cj=(""+jug).charAt(0);
        CasillaJugador casjug= new CasillaJugador(cj);
        addSpace(casjug);
    }
    
    
    private boolean isAnyFreeSpace()
    {
        for(int i=1;i<A-1;i++)
        {
            for(int j=1;j<B-1;j++)
            {
               if(mapa[i][j] instanceof CasillaVacia)
                   return true;
            }
        }
        return false;
    }

    void setArmas(int armas) {
       this.armas=armas;
    }

    void addSpace(Casilla c) {
       int i=0;
       int j=0;
       do
       {
           i=r.nextInt(A-1);
           j=r.nextInt(B-1);
           if(mapa[i][j] instanceof CasillaVacia)
               mapa[i][j]=c;
       }while(mapa[i][j]!=c&&isAnyFreeSpace());
    }
    void setCuras(int curas) {
        this.curas=curas;
    }

    void addArma() {
        int t=r.nextInt(100);
        addSpace(new CasillaArma(t%2));
    }

    void addCura() {
        addSpace(new CasillaCura());
    }

    void addRefugio() {
        addSpace(new CasillaRefugio());
    }
}
