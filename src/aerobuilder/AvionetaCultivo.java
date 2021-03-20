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
public class AvionetaCultivo implements AeroBuilder {
    
    Aeronave aeronave;
    String nombre;
    String comprador;
    
    AvionetaCultivo (String comprador){
        this.comprador = comprador;
        this.nombre = "Avioneta de Cultivo v3.4";
    }

    @Override
    public void construirAlas() {
        aeronave.setAlas(15f);
    }

    @Override
    public void construirMotores() {
        aeronave.setMotores("piston simple");
    }

    @Override
    public void construirAvionica() {
    }

    @Override
    public void construirAsientos() {
        aeronave.setNumeroAsientos(1, 1);
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
