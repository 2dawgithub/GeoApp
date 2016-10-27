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
public class Rectangle {
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    
    private double lado1;
    private double lado2 = 1.0;
    
    public static final double LADO1_VALUE=1.0;
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Mètodes">
    

        //<editor-fold defaultstate="collapsed" desc="constructores">

        //constructores
        public Rectangle(double lado1, double lado2){
            this.setLado1(lado1);
            this.setLado2(lado2);
        }
        public Rectangle(double lado1){
            this.setLado1(lado1);

        }
        
        public Rectangle(){
            this(LADO1_VALUE);
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
