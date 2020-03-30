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
public class Cliente {
	public static void main(String[] args) {
            LojaDirector loja = new LojaDirector(new UlefoneBuilder());
	 
	    loja.construirCelular();
	    CelularProduct celular = loja.getProduct();
	    System.out.println("Smartphone: " + celular.modeloEmpresa + "\nValor: " + celular.preco + "\nCapacidade da Bateria: "
	            + celular.capacidadeBateria + "\nResistência a Água: " + celular.resistenciaAgua);
	 
	    System.out.println();
	 
            LojaDirector loja2 = new LojaDirector(new XiaomiBuilder());
	 
	    loja2.construirCelular();
	    CelularProduct celular2 = loja2.getProduct();
	    System.out.println("Smartphone: " + celular2.modeloEmpresa + "\nValor: " + celular2.preco + "\nCapacidade da Bateria: "
	            + celular2.capacidadeBateria + "\nResistência a Água: " + celular2.resistenciaAgua);
	
            System.out.println();
	 
            LojaDirector loja3 = new LojaDirector(new AppleBuilder());
	 
	    loja3.construirCelular();
	    CelularProduct celular3 = loja3.getProduct();
	    System.out.println("Smartphone: " + celular3.modeloEmpresa + "\nValor: " + celular3.preco + "\nCapacidade da Bateria: "
	            + celular3.capacidadeBateria + "\nResistência a Água: " + celular3.resistenciaAgua);
        
        
        }
}
