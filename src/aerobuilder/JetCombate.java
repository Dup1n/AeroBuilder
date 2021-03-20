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
public class JetCombate implements AeroBuilder {

    Aeronave aeronave;
    String nombre;
    String comprador;
    
    JetCombate (String comprador){
        this.comprador = comprador;
        this.nombre = "F-35 lightning II";
    }
    
    @Override
    public void construirAlas() {
        aeronave.setAlas(10.3f);
    }

    @Override
    public void construirMotores() {
        aeronave.setMotores("vectorización de doble empuje");
    }

    @Override
    public void construirAvionica() {
        aeronave.setAvionica("Militar");
    }
    
    @Override
    public void construirAsientos() {
        aeronave.setNumeroAsientos(1, 0);
    }

    @Override
    public Aeronave getAeronave() {
        return aeronave;
    }

    @Override
    public void crearNuevoAeronave() {
        aeronave = new Aeronave(comprador, nombre);
    }
}
