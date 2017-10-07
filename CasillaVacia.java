/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercenarywars;


public class CasillaVacia extends Casilla {

    public CasillaVacia() {
        super.valorImpresion=' ';
    }

    @Override
    public void setValue(char v) {
        super.valorImpresion=v;
    }

    @Override
    public char getValue() {
        return super.valorImpresion;
    }
  
}
