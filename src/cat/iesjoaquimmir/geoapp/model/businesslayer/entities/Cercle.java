/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;

/**
 *
 * @author alumne
 */
public class Cercle {
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    
    //Atributs
    private double radio;
    
    public static final double RADIO_VALUE=1.0;
    
    //</editor-fold>    
    
    //<editor-fold defaultstate="collapsed" desc="Metodes">
    
   
        //<editor-fold defaultstate="collapsed" desc="constructores">
    

        //constructores
        public Cercle(double radio){
            this.setRadio(radio);

        }
        
        public Cercle(){
            this(RADIO_VALUE);
        }
        //</editor-fold>    
    
        //<editor-fold defaultstate="collapsed" desc="getters/setters">
    

        //getters
        public double getRadio(){
            return radio;
        }

        //setters
        public void setRadio(double radio){
            if(radio <=0.0){
                throw new IllegalArgumentException(
                    String.format("Valor %f no valid.", radio));
            }
            this.radio = radio;
        }

        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="operacions d'objecte">
    
        //operacions d'objecte
        public double getArea(){
            return Math.PI * (Math.pow(getRadio(), 2));
        }
        public double getPerimeter(){
            return 2 * Math.PI * getRadio();

        }

        //</editor-fold>
    
    //</editor-fold>
}