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
public abstract class Shape {
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    private Color backgroundColor;
    private Color foregroundColor;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="metodes">
    
        //<editor-fold defaultstate="collapsed" desc="getters/setters">
        /**
        * @return the backgroundColor
        */
        public Color getBackgroundColor() {
            return backgroundColor;
        }

        /**
         * @param backgroundColor the backgroundColor to set
         */
        public void setBackgroundColor(Color backgroundColor) {
            if(backgroundColor==null){
                throw new NullPointerException("Es obligatori indicar un color");
            }
            this.backgroundColor = backgroundColor;
        }

        /**
         * @return the foregroundColor
         */
        public Color getForegroundColor() {
            return foregroundColor;
        }

        /**
         * @param foregroundColor the foregroundColor to set
         */
        public void setForegroundColor(Color foregroundColor) {
            if(foregroundColor==null){
                throw new NullPointerException("Es obligatori indicar un color");
            }
            this.foregroundColor = foregroundColor;
        }
        //</editor-fold>
    
    //</editor-fold>
}