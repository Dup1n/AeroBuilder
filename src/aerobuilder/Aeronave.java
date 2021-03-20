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
public class Aeronave {
    
    private String nombre;
    private float alas;
    private String motores;
    private int asientosPrincipal;
    private int asientosPasajeros;
    private String avionica;
    private String comprador;
    
    Aeronave (String comprador, String nombre){
        this.comprador = comprador;
        this.nombre = nombre;
    }
    
    public void setAlas(float alas){
        this.alas = alas;
    }
    
    public void setMotores(String motores){
        this.motores = motores;
    }
    
    public void setAvionica(String avionica){
        this.avionica = avionica;
    }
    
    public void setNumeroAsientos(int asientosPrincipal, int asientosPasajeros){
        this.asientosPrincipal = asientosPrincipal;
        this.asientosPasajeros = asientosPasajeros;
    }
    
    public String getComprador(){
        if (comprador.isEmpty()){
            return "Anonimo";
        }
        return comprador;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getAlas(){
        return alas + " metros";
    }
    
    public String getMotores(){
        if(motores == null){
            return "no es requerido";
        }
        return motores;
    }
    
    public String getAvionica(){
        if(avionica == null){
            return "no requiere avionica";
        }
        return avionica;
    }
    
    public String getPasajeros(){
        if(asientosPrincipal == 0 && asientosPasajeros == 0){
            return "no requiere asientos";
        }
        else if(asientosPasajeros == 0){
            return asientosPrincipal + " Principales";
        }
        else{
            return asientosPrincipal + " Principal(es) y " + asientosPasajeros + " Pasajero(s)";            
        }
    }
    
    @Override
    public String toString() {
        return nombre + " esta completado y listo para " + getComprador() + "\n \n" +
               "Especificaciones \n" + 
               "Alas: " + getAlas() + "\n" +
               "Motores: " + getMotores() + "\n" + 
               "Avionica: " + getAvionica() + "\n" + 
               "Asientos: " + getPasajeros();
    }
    
}
