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
    protected CelularBuilder modeloEmpresa;

    public LojaDirector(CelularBuilder modeloEmpresa) {
        this.modeloEmpresa = modeloEmpresa;
    }
    
    public void construirCelular(){
        modeloEmpresa.buildModeloEmpresa();
        modeloEmpresa.buildCapacidadeBateria();
        modeloEmpresa.buildPreco();
        modeloEmpresa.buildResistenciaAgua();
    }

   public CelularProduct getProduct(){
       return modeloEmpresa.getCelular();
   }
    
    
}
