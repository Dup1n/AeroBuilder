/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aerobuilder;

/**
 *
 * @author elian
 */
public class IngenieroAeronautico {
    
    private AeroBuilder aeronaveBuilder;
    
    public void setAeronaveBuilder(AeroBuilder aeronave){
        aeronaveBuilder = aeronave;
    }
    
    public Aeronave getAeronave(){
        return aeronaveBuilder.getAeronave();
    }
    
    public void construirAeronave(){
        aeronaveBuilder.crearNuevoAeronave();
        aeronaveBuilder.construirAlas();
        aeronaveBuilder.construirMotores();
        aeronaveBuilder.construirAvionica();
        aeronaveBuilder.construirAsientos();
    }
}
