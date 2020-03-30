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
public class XiaomiBuilder extends CelularBuilder {

    @Override
    public void buildResistenciaAgua() {
        celular.resistenciaAgua = false;
    }

    @Override
    public void buildPreco() {
        celular.preco = 2499.00;
    }

    @Override
    public void buildCapacidadeBateria() {
        celular.capacidadeBateria = 3070;
    }

    @Override
    public void buildModeloEmpresa() {
        celular.modeloEmpresa = "Xiaomi Mi 9";
    }
    
}
