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
public class AppleBuilder extends CelularBuilder {

    @Override
    public void buildResistenciaAgua() {
        celular.resistenciaAgua = true;
    }

    @Override
    public void buildPreco() {
        celular.preco = 2969.00;
    }

    @Override
    public void buildCapacidadeBateria() {
        celular.capacidadeBateria = 2942;
    }

    @Override
    public void buildModeloEmpresa() {
        celular.modeloEmpresa = "Apple Iphone XR";
    }
    
}
