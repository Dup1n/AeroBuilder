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
public class Aerolinea implements AeroBuilder {

    Aeronave aeronave;
    String nombre;
    String comprador;
    
    Aerolinea(String comprador){
        this.comprador = comprador;
        this.nombre = "Boeing 737";
    }
    
    @Override
    public void construirAlas() {
        aeronave.setAlas(21.5f);
    }

    @Override
    public void construirMotores() {
        aeronave.setMotores("turbinas dobles");
    }

    @Override
    public void construirAvionica() {
        aeronave.setAvionica("comercial");
    }

    @Override
    public void construirAsientos() {
        aeronave.setNumeroAsientos(8, 289);
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
