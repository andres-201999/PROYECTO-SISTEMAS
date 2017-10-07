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
public class CasillaRefugio extends Casilla {

    public CasillaRefugio(char o) {
       this.setValue(o);
   }

    public CasillaRefugio() {
       this.setValue('^');
    }

    @Override
    public void setValue(char o) {
        super.valorImpresion=o;
    }

    @Override
    public char getValue() {
        return  super.valorImpresion;
    }
    

}