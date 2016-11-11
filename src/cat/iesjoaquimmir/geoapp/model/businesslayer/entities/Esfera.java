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
public class Esfera extends Shape  {
    //<editor-fold defaultstate="collapsed" desc="Atributs">
   
    //Atributs
    private double radio;
    
    
    public static final double RADIO_VALUE=1.0;
    
    //</editor-fold>   
    
    //<editor-fold defaultstate="collapsed" desc="Mètodes">
    

        //<editor-fold defaultstate="collapsed" desc="constructores">


        //constructores
        public Esfera(double radio, Color backgroundColor, Color foregroundColor){
            this.setRadio(radio);
            this.setBackgroundColor(backgroundColor);
            this.setForegroundColor(foregroundColor);
        }
    
        public Esfera(double radio){
            this(radio, 
                    new Color(Color.MAX_VALUE, Color.MAX_VALUE, Color.MAX_VALUE), 
                    new Color(Color.MIN_VALUE, Color.MIN_VALUE, Color.MIN_VALUE));

        }
        public Esfera(){
            this(RADIO_VALUE, 
                    new Color(Color.MAX_VALUE, Color.MAX_VALUE, Color.MAX_VALUE), 
                    new Color(Color.MIN_VALUE, Color.MIN_VALUE, Color.MIN_VALUE));
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
            return 4 * Math.PI * (Math.pow(getRadio(), 2));
        }
        public double getPerimeter(){
            return 2 * Math.PI * getRadio();

        }
        //</editor-fold>
    //</editor-fold>  
}
