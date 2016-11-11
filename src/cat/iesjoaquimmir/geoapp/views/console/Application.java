package cat.iesjoaquimmir.geoapp.views.console;


import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Cercle;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Color;
import static cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Color.fromHexString;
import static cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Color.getRandom;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Esfera;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Rectangle;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Square;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author alumne
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               
        double n;
        Scanner teclat = new Scanner(System.in);
        int tipusColor;
        
        do {
            System.out.printf("Introdueix una figura(0: Sortir, 1: Rectangle, 2: Quadrat, 3: Cercle, 4: Sphere, 5: Rectangle 1 costat, 6: Color, 7: Totes les figures): ");
            n = teclat.nextInt();
                        
            if(n==1){
                //Rectangle
                rectangle();
                
            }else if(n==2){
                //Square
                square();
                
            }else if(n==3){
                //Cercle
                cercle();

            }else if(n==4){
                //Sphere
                sphere();
        
            }else if(n==5){
                rectangle1lado();
            }else if(n==6){
                
                System.out.printf("Introduir color: 1, Introduir color hexadecimal: 2, Color aleatori: 3 | Opció: ");
                
                tipusColor = teclat.nextInt();
                
                if(tipusColor==1){
                    color();
                }else if(tipusColor==2){
                    colorHex();
                }else if(tipusColor==3){
                    colorAleatori();
                }
                
                System.out.printf("\nColors creats: %d \n", Color.getCounter());
                
                
            }else if(n==7){
                figures();
            }
        }while(n>0 && n<8);
        
        
    }
    
    public static void rectangle(){
        
        double lado1, lado2;
        String colorBG, colorFG;
        
        Scanner teclat = new Scanner(System.in);
        
        System.out.printf("Introdueix el costat 1: ");
        lado1 = teclat.nextDouble();
        System.out.printf("Introdueix el costat 2: ");
        lado2 = teclat.nextDouble();
        
        Rectangle r1 = new Rectangle(lado1, lado2);
        
        
        System.out.printf("El costat 1 de r1: %.2f %n", r1.getLado1());
        System.out.printf("El costat 2 de r1: %.2f %n", r1.getLado2());
        System.out.printf("L'Area de r1: %.2f %n", r1.getArea());
        System.out.printf("El perimetre de r1: %.2f %n", r1.getPerimeter());
        System.out.printf("El color de fons en hexadecimal de r1: %s %n", r1.getBackgroundColor().toHexString() );
        System.out.printf("El color de línia en hexadecimal de r1: %s %n", r1.getForegroundColor().toHexString() );
        
        
        System.out.printf("Introdueix el costat 1: ");
        lado1 = teclat.nextDouble();
        System.out.printf("Introdueix el costat 2: ");
        lado2 = teclat.nextDouble();
        
        System.out.printf("Introdueix un color de fons en hexadecimal: ");
        colorBG = teclat.next();
        
        System.out.printf("Introdueix un color de línia en hexadecimal: ");
        colorFG = teclat.next();
        
        
        Color backgroundColor = fromHexString(colorBG);
        Color foregroundColor = fromHexString(colorFG);
        
        
        Rectangle r2 = new Rectangle(lado1, lado2, backgroundColor, foregroundColor);
        
        System.out.printf("El costat 1 de r1: %.2f %n", r2.getLado1());
        System.out.printf("El costat 2 de r1: %.2f %n", r2.getLado2());
        System.out.printf("L'Area de r1: %.2f %n", r2.getArea());
        System.out.printf("El perimetre de r1: %.2f %n", r2.getPerimeter());
        System.out.printf("El color de fons en hexadecimal de r2: %s %n", r2.getBackgroundColor().toHexString() );
        System.out.printf("El color de línia en hexadecimal de r2: %s %n", r2.getForegroundColor().toHexString() );
        
    }
    
    public static void square(){
        
        double lado;
        String colorBG;
        String colorFG;
        
        Scanner teclat = new Scanner(System.in);

        System.out.printf("\nIntrodueix un costat: ");
        lado = teclat.nextDouble();
        
        Square c1 = new Square(lado);
        
        System.out.printf("El costat de c1: %.2f %n", c1.getSide());
        System.out.printf("L'Area de c1: %.2f %n", c1.getArea());
        System.out.printf("El perimetre de c1: %.2f %n", c1.getPerimeter());
        System.out.printf("El color de fons en hexadecimal de c1: %s %n", c1.getBackgroundColor().toHexString() );
        System.out.printf("El color de línia en hexadecimal de c1: %s %n", c1.getForegroundColor().toHexString() );
        
        
        System.out.printf("\nIntrodueix un costat: ");
        lado = teclat.nextDouble();
        
        System.out.printf("Introdueix un color de fons en hexadecimal: ");
        colorBG = teclat.next();
        
        System.out.printf("Introdueix un color de línia en hexadecimal: ");
        colorFG = teclat.next();
        
        
        Color backgroundColor = fromHexString(colorBG);
        Color foregroundColor = fromHexString(colorFG);
        
        
        Square c2 = new Square(lado, backgroundColor, foregroundColor);
        
        System.out.printf("El costat de c2: %.2f %n", c2.getSide());
        System.out.printf("L'Area de c2: %.2f %n", c2.getArea());
        System.out.printf("El perimetre de c2: %.2f %n", c2.getPerimeter());
        System.out.printf("El color de fons en hexadecimal de c1: %s %n", c2.getBackgroundColor().toHexString() );
        System.out.printf("El color de línia en hexadecimal de c1: %s %n", c2.getForegroundColor().toHexString() );
        
    }
    public static void cercle(){
        
        double radio;
        String colorBG;
        String colorFG;
        
        Scanner teclat = new Scanner(System.in);

        System.out.printf("\n\nIntrodueix el radi: ");
        radio = teclat.nextDouble();

        Cercle cercle1 = new Cercle(radio);
        
        System.out.printf("\nEl costat 1 de cercle1: %.2f %n", cercle1.getRadio());
        System.out.printf("L'Area de cercle1: %.2f %n", cercle1.getArea());
        System.out.printf("El perimetre de cercle1: %.2f %n", cercle1.getPerimeter());
        System.out.printf("El color de fons en hexadecimal de cercle1: %s %n", cercle1.getBackgroundColor().toHexString() );
        System.out.printf("El color de línia en hexadecimal de cercle1: %s %n", cercle1.getForegroundColor().toHexString() );
        
        
        
        System.out.printf("\n\nIntrodueix el radi: ");
        radio = teclat.nextDouble();
        
        System.out.printf("Introdueix un color de fons en hexadecimal: ");
        colorBG = teclat.next();
        
        System.out.printf("Introdueix un color de línia en hexadecimal: ");
        colorFG = teclat.next();
        
        
        Color backgroundColor = fromHexString(colorBG);
        Color foregroundColor = fromHexString(colorFG);
        
        Cercle cercle2 = new Cercle(radio, backgroundColor, foregroundColor);
        
        System.out.printf("\nEl costat 1 de cercle2: %.2f %n", cercle2.getRadio());
        System.out.printf("L'Area de cercle2: %.2f %n", cercle2.getArea());
        System.out.printf("El perimetre de cercle2: %.2f %n", cercle2.getPerimeter());
        System.out.printf("El color de fons en hexadecimal de cercle2: %s %n", cercle2.getBackgroundColor().toHexString() );
        System.out.printf("El color de línia en hexadecimal de cercle2: %s %n", cercle2.getForegroundColor().toHexString() );
        
        
    }
    public static void sphere(){
        
        double radio;
        String colorBG;
        String colorFG;
        
        Scanner teclat = new Scanner(System.in);

        System.out.printf("\n\nIntrodueix el radi: ");
        radio = teclat.nextDouble();
        Esfera esfera1 = new Esfera(radio);
        
        System.out.printf("\nEl costat 1 de esfera1: %.2f %n", esfera1.getRadio());
        System.out.printf("L'Area de esfera1: %.2f %n", esfera1.getArea());
        System.out.printf("El perimetre de esfera1: %.2f %n", esfera1.getPerimeter());
        System.out.printf("El color de fons en hexadecimal de esfera1: %s %n", esfera1.getBackgroundColor().toHexString() );
        System.out.printf("El color de línia en hexadecimal de esfera1: %s %n", esfera1.getForegroundColor().toHexString() );
        
        
        System.out.printf("\n\nIntrodueix el radi: ");
        radio = teclat.nextDouble();
        
        System.out.printf("Introdueix un color de fons en hexadecimal: ");
        colorBG = teclat.next();
        
        System.out.printf("Introdueix un color de línia en hexadecimal: ");
        colorFG = teclat.next();
        
        
        Color backgroundColor = fromHexString(colorBG);
        Color foregroundColor = fromHexString(colorFG);
        
        Esfera esfera2 = new Esfera(radio, backgroundColor, foregroundColor);
        
        System.out.printf("\nEl costat 1 de esfera2: %.2f %n", esfera2.getRadio());
        System.out.printf("L'Area de esfera2: %.2f %n", esfera2.getArea());
        System.out.printf("El perimetre de esfera2: %.2f %n", esfera2.getPerimeter());
        System.out.printf("El color de fons en hexadecimal de esfera2: %s %n", esfera2.getBackgroundColor().toHexString() );
        System.out.printf("El color de línia en hexadecimal de esfera2: %s %n", esfera2.getForegroundColor().toHexString() );
        
        
    }
    
    public static void rectangle1lado(){
        
        double lado1;
        String colorBG;
        String colorFG;
        
        Scanner teclat = new Scanner(System.in);
        
        System.out.printf("Introdueix el costat 1: ");
        lado1 = teclat.nextDouble();
        
        Rectangle r1 = new Rectangle(lado1);
        
        System.out.printf("El costat 1 de r1: %.2f %n", r1.getLado1());
        System.out.printf("El costat 2 de r1: %.2f %n", r1.getLado2());
        System.out.printf("L'Area de r1: %.2f %n", r1.getArea());
        System.out.printf("El perimetre de r1: %.2f %n", r1.getPerimeter());
        System.out.printf("El color de fons en hexadecimal de esfera2: %s %n", r1.getBackgroundColor().toHexString() );
        System.out.printf("El color de línia en hexadecimal de esfera2: %s %n", r1.getForegroundColor().toHexString() );
        
        
        System.out.printf("Introdueix el costat 1: ");
        lado1 = teclat.nextDouble();
        
        System.out.printf("Introdueix un color de fons en hexadecimal: ");
        colorBG = teclat.next();
        
        System.out.printf("Introdueix un color de línia en hexadecimal: ");
        colorFG = teclat.next();
        
        
        Color backgroundColor = fromHexString(colorBG);
        Color foregroundColor = fromHexString(colorFG);
        
        //acabar
        Rectangle r2 = new Rectangle(lado1);
        
        System.out.printf("El costat 1 de r1: %.2f %n", r2.getLado1());
        System.out.printf("El costat 2 de r1: %.2f %n", r2.getLado2());
        System.out.printf("L'Area de r1: %.2f %n", r2.getArea());
        System.out.printf("El perimetre de r1: %.2f %n", r2.getPerimeter());
        System.out.printf("El color de fons en hexadecimal de esfera2: %s %n", r2.getBackgroundColor().toHexString() );
        System.out.printf("El color de línia en hexadecimal de esfera2: %s %n", r2.getForegroundColor().toHexString() );
        
    }
    
    public static void color(){
        int red, green, blue;
        
        Scanner teclat = new Scanner(System.in);
        
        System.out.printf("Introdueix el red: ");
        red = teclat.nextInt();
        
        System.out.printf("Introdueix el green: ");
        green = teclat.nextInt();
        
        System.out.printf("Introdueix el blue: ");
        blue = teclat.nextInt();
        
        Color color1 = new Color(red, green, blue);
        
        System.out.printf("\nEl Red: %d, el Green: %d, el Blue: %d \n", color1.getRed(), color1.getGreen(), color1.getBlue() );
        
        
    }
    
    public static void colorHex(){
        String colorHexadecimal;

        Scanner teclat = new Scanner(System.in);
        
        System.out.printf("Introdueix el color en hexadecimal: ");
        colorHexadecimal = teclat.nextLine();
        
        Color color1 = fromHexString(colorHexadecimal);
        
        System.out.printf("\nEl Red: %d, el Green: %d, el Blue: %d \n", color1.getRed(), color1.getGreen(), color1.getBlue() );
        
        System.out.printf("\nColor en hexadecimal: %s\n", color1.toRGBString(true));
        System.out.printf("\nColor en hexadecimal: %s\n", color1.toRGBString());
        
    }
    
    public static void colorAleatori(){
        Color color1 = getRandom();
        
        System.out.printf("\nRed: %d, Green: %d, Blue: %d \n", color1.getRed(), color1.getGreen(), color1.getBlue() );
        
        System.out.printf("\nColor aleatori en hexadecimal: %s\n", color1.toHexString(false));
        System.out.printf("\nColor aleatori en hexadecimal: %s\n", color1.toHexString());
    }
    
    public static void figures(){
        Cercle figuraCercle = new Cercle();
        Esfera figuraEsfera = new Esfera();
        Rectangle figuraRectangle = new Rectangle();
        Square figuraSquare = new Square();
        
        System.out.printf("\nEl costat 1 de la figura cercle: %.2f %n", figuraCercle.getRadio());
        System.out.printf("L'Area de la figura cercle: %.2f %n", figuraCercle.getArea());
        System.out.printf("El perimetre de la figura cercle: %.2f %n \n", figuraCercle.getPerimeter());
        
        System.out.printf("El costat 1 de la figura esfera: %.2f %n", figuraEsfera.getRadio());
        System.out.printf("L'Area de la figura esfera: %.2f %n", figuraEsfera.getArea());
        System.out.printf("El perimetre de la figura esfera: %.2f %n \n", figuraEsfera.getPerimeter());
        
        System.out.printf("El costat 1 de la figura rectangle: %.2f %n", figuraRectangle.getLado1());
        System.out.printf("El costat 2 de la figura rectangle: %.2f %n", figuraRectangle.getLado2());
        System.out.printf("L'Area de la figura rectangle: %.2f %n", figuraRectangle.getArea());
        System.out.printf("El perimetre de la figura rectangle: %.2f %n \n", figuraRectangle.getPerimeter());
        
        System.out.printf("El costat de la figura square: %.2f %n", figuraSquare.getSide());
        System.out.printf("L'Area de la figura square: %.2f %n", figuraSquare.getArea());
        System.out.printf("El perimetre de la figura square: %.2f %n \n", figuraSquare.getPerimeter());
        
    }
}
