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
public class Rectangle extends Shape  {
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    
    private double lado1;
    private double lado2;

    public static final double LADO2_VALUE=1.0;
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Mètodes">
    

        //<editor-fold defaultstate="collapsed" desc="constructores">

        //constructores
        public Rectangle(double lado1, double lado2, Color backgroundColor, Color foregroundColor){
            this.setLado1(lado1);
            this.setLado2(lado2);
            this.setBackgroundColor(backgroundColor);
            this.setForegroundColor(foregroundColor);
        }
        public Rectangle(double lado1, double lado2){
            this(lado1, 
                lado2,
                new Color(Color.MAX_VALUE, Color.MAX_VALUE, Color.MAX_VALUE), 
                new Color(Color.MIN_VALUE, Color.MIN_VALUE, Color.MIN_VALUE) );
        }
        public Rectangle(double lado1){
            this(lado1, LADO2_VALUE);
        }
        
        public Rectangle(){
            this(LADO2_VALUE);
        }

        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="getters/setters">


        //getters/setters

        //getters
        public double getLado1(){
            return lado1;
        }
        public double getLado2(){
            return lado2;
        }

        //setters
        public void setLado1(double ladouno){
            if(ladouno <=0.0){
                throw new IllegalArgumentException(
                    String.format("Valor %f no valid.", ladouno));
            }
            this.lado1 = ladouno;
        }
        public void setLado2(double ladodos){
            if(ladodos <=0.0){
                throw new IllegalArgumentException(
                    String.format("Valor %f no valid.", ladodos));
            }
            this.lado2 = ladodos;
        }
        
        
        
        
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="operacions d'objecte">

        //operacions d'objecte
        public double getArea(){
            return getLado1() * getLado2();
        }
        public double getPerimeter(){
            return (getLado1() * 2) + (getLado2() * 2);

        }
        //</editor-fold>
    //</editor-fold>
}
