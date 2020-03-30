/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadebuilder;

/**
 *
 * @author whaty
 */
public class LojaDirector {
    protected CelularBuilder montarCelular;

    public LojaDirector(CelularBuilder montarCelular) {
        this.montarCelular = montarCelular;
    }
    
    public void construirCelular(){
        montarCelular.buildModeloEmpresa();
        montarCelular.buildCapacidadeBateria();
        montarCelular.buildPreco();
        montarCelular.buildResistenciaAgua();
    }

   public CelularProduct getProduct(){
       return montarCelular.getCelular();
   }
    
    
}
