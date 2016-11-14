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
public class AlphaColor extends Color {
    
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    private double alpha;
    
    public static final double MIN_VALUE_ALPHA = 0.0;
    public static final double MAX_VALUE_ALPHA = 1.0;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Mètodes">
    
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public AlphaColor(int red, int green, int blue, double alpha){
            super(red, green, blue);
            this.setAlpha(alpha);
    }
    
    public AlphaColor(int red, int green, int blue){
            this(red, green, blue, MIN_VALUE_ALPHA);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
    /**
     * @return the alpha
     */
    public double getAlpha() {
        return alpha;
    }

    /**
     * @param alpha the alpha to set
     */
    public void setAlpha(double alpha) {
        if (alpha < MIN_VALUE_ALPHA || alpha > MAX_VALUE_ALPHA ){
            throw new IllegalArgumentException(
                    String.format("Valor %f no vàlido.", alpha));
        }
        this.alpha = alpha;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Sobreescritura">
    
    @Override
    public String toHexString(boolean upper){
        if(getAlpha() != 0.0){
            return String.format(upper ? "#%02X%02X%02X ALPHA: %.2f" : "#%02x%02x%02x Alpha: %.2f", getRed(), getGreen(), getBlue(), getAlpha());
        }else{
            return String.format(upper ? "#%02X%02X%02X" : "#%02x%02x%02x", getRed(), getGreen(), getBlue());
        }
    }
    
    @Override
    public String toRGBString(boolean upper){
        if(getAlpha() != 0.0){
            return String.format(upper ? "RGBA(%d, %d, %d, %.2f)" : "rgba(%d, %d, %d, %.2f)", getRed(), getGreen(), getBlue(), getAlpha());
        }else{
            return String.format(upper ? "RGB(%d,%d,%d)" : "rgb(%d,%d,%d)", getRed(), getGreen(), getBlue());
        }
    }
    //</editor-fold>
    
    //</editor-fold>

    
    
    
}
