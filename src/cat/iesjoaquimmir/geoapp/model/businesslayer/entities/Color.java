/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;


import java.util.Random;


/**
 *
 * @author alumne
 */
public class Color {
    //<editor-fold defaultstate="collapsed" desc="Estat: Atributs">
        private int red;
        private int green;
        private int blue;
        
        //atributs estàtics(constants)
        public static final int MAX_VALUE=255;
        public static final int MIN_VALUE=0;
        private static int counter=0;
    //</editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="Mètodes">
        
        
        //<editor-fold defaultstate="collapsed" desc="getters/setters">

            /**
             * @return the red
             */
            public int getRed() {
                return red;
            }

            /**
             * @param red the red to set
             */
            public void setRed(int red) {
                if(red < MIN_VALUE || red > MAX_VALUE){
                    throw new IllegalArgumentException(
                    String.format("Valor %d no vàlido para la coordenada R", red));
                }
                this.red = red;
            }

            /**
             * @return the green
             */
            public int getGreen() {
                return green;
            }

            /**
             * @param green the green to set
             */
            public void setGreen(int green) {
                if(green < MIN_VALUE || green > MAX_VALUE){
                    throw new IllegalArgumentException(
                    String.format("Valor %d no vàlido para la coordenada G", green));
                }
                this.green = green;
            }

            /**
             * @return the blue
             */
            public int getBlue() {
                return blue;
            }

            /**
             * @param blue the blue to set
             */
            public void setBlue(int blue) {
                if(blue < MIN_VALUE || blue > MAX_VALUE){
                    throw new IllegalArgumentException(
                    String.format("Valor %d no vàlido para la coordenada B", blue));
                }
                this.blue = blue;
            }
            //</editor-fold>    
        
        //<editor-fold defaultstate="collapsed" desc="Constructors">
        
        public Color(int red, int green, int blue){
            counter++;
            this.setRed(red);
            this.setGreen(green);
            this.setBlue(blue);
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Mètodes estàtics">
        
        public static Color fromHexString(String color){
            if(color == null){
                throw new NullPointerException("Es obligatori indicar una " + "cadena de text");
            }
            if (!color.matches("^#[0-9A-Fa-f]{6}$")){
                throw new IllegalArgumentException(String.format("El text %s no te format hexadecimal", color));
            }
            return new Color(Integer.parseInt(color.substring(1, 3), 16), Integer.parseInt(color.substring(3, 5), 16), Integer.parseInt(color.substring(5, 7), 16));
        }
        
        public static Color getRandom(){
            Random numrandom = new Random();
            
            return new Color( numrandom.nextInt(MAX_VALUE+1), numrandom.nextInt(MAX_VALUE+1), numrandom.nextInt(MAX_VALUE+1) );
            
        }
        
        public String toHexString(boolean upper){
            return String.format(upper ? "#%02X%02X%02X" : "#%02x%02x%02x", getRed(), getGreen(), getBlue());
        }
        
        public String toHexString(){
            return toHexString(true);
        }
        
        public String toRGBString(boolean upper){
            return String.format(upper ? "RGB(%d,%d,%d)" : "rgb(%d,%d,%d)", getRed(), getGreen(), getBlue());
        }
        
        public String toRGBString(){
            return toRGBString(false);
        }
        
        public static int getCounter(){
            return counter;
        }
        
        //</editor-fold>
            
    //</editor-fold>
    
}
