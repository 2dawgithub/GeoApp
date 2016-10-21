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
public class Square {
//<editor-fold defaultstate="collapsed" desc="Atributs">
    //fcom + tabulacion para ^
    
    private double side;
    
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Comportament: Mètodes">
   
    //<editor-fold defaultstate="collapsed" desc="Constructores">
        public Square(double side){
            this.setSide(side);
        }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getters/setters">
        /**
         * @return the side
         */
        public double getSide() {
            return side;
        }

        /**
         * @param side the side to set
         */
        public void setSide(double side) {
            if(side <=0.0){
                throw new IllegalArgumentException(
                    String.format("Valor %f no valid.", side));
            }
            this.side = side;
        }
    //</editor-fold>

//</editor-fold> 
    
//<editor-fold defaultstate="collapsed" desc="Operacions d'objecte">
    public double getArea(){
        return Math.pow(getSide(), 2);
    }
    public double getPerimeter(){
        return getSide() *4;
    }
//</editor-fold>

}