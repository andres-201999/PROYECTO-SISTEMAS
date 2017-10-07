/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercenarywars;

/**
 *
 * @author Labin
 */
public class CasillaCura extends Casilla {

    public CasillaCura(char g) {
       this.setValue(g);
   }

    public CasillaCura() {
       this.setValue('+');
    }

    @Override
    public void setValue(char g) {
        super.valorImpresion=g;
    }

    @Override
    public char getValue() {
        return  super.valorImpresion;
    }
    

}

