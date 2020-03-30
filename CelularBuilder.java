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
public abstract class CelularBuilder {
    protected CelularProduct celular = new CelularProduct();
    public abstract void buildResistenciaAgua();
    public abstract void buildPreco();
    public abstract void buildCapacidadeBateria();
    public abstract void buildModeloEmpresa();
    public CelularProduct getCelular(){
        return celular;
    }
}
