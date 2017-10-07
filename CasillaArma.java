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
public class CasillaArma extends Casilla {

    public CasillaArma(char t) {
       this.setValue(t);
       }
   public CasillaArma(int T) {
    if (T==1){
           this.setValue('*');
       }
       else
       {
           this.setValue('°');
       }
    }
    @Override
    public void setValue(char t) {
        super.valorImpresion=t;
    }

    @Override
    public char getValue() {
        return  super.valorImpresion;
    }
    

}
   
