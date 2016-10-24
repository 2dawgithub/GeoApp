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
            System.out.printf("Introdueix una figura(0: Sortir, 1: Rectangle, 2: Square, 3: Cercle, 4: Sphere, 5: Rectangle 1 costat, 6: Color): ");
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
                
                
            }
        }while(n>0 && n<7);
        
        
    }
    
    public static void rectangle(){
        
        double lado1, lado2;
        
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
    }
    
    public static void square(){
        
        double lado;
        
        Scanner teclat = new Scanner(System.in);

        System.out.printf("Introdueix un costat: ");
        lado = teclat.nextDouble();
        
        Square c1 = new Square(lado);
        
        System.out.printf("El costat de c1: %.2f %n", c1.getSide());
        System.out.printf("L'Area de c1: %.2f %n", c1.getArea());
        System.out.printf("El perimetre de c1: %.2f %n", c1.getPerimeter());
    }
    public static void cercle(){
        
        double radio;
        
        Scanner teclat = new Scanner(System.in);

        System.out.printf("Introdueix el radi: ");
        radio = teclat.nextDouble();
        
        Cercle cercle1 = new Cercle(radio);
        
        System.out.printf("El costat 1 de cercle1: %.2f %n", cercle1.getRadio());
        System.out.printf("L'Area de cercle1: %.2f %n", cercle1.getArea());
        System.out.printf("El perimetre de cercle1: %.2f %n", cercle1.getPerimeter());
    }
    public static void sphere(){
        
        double radio;
        
        Scanner teclat = new Scanner(System.in);

        System.out.printf("Introdueix el radi: ");
        radio = teclat.nextDouble();
        Esfera esfera1 = new Esfera(radio);
        
        System.out.printf("El costat 1 de esfera1: %.2f %n", esfera1.getRadio());
        System.out.printf("L'Area de esfera1: %.2f %n", esfera1.getArea());
        System.out.printf("El perimetre de esfera1: %.2f %n", esfera1.getPerimeter());
    }
    
    public static void rectangle1lado(){
        
        double lado1;
        
        Scanner teclat = new Scanner(System.in);
        
        System.out.printf("Introdueix el costat 1: ");
        lado1 = teclat.nextDouble();
        
        Rectangle r1 = new Rectangle(lado1);
        
        System.out.printf("El costat 1 de r1: %.2f %n", r1.getLado1());
        System.out.printf("El costat 2 de r1: %.2f %n", r1.getLado2());
        System.out.printf("L'Area de r1: %.2f %n", r1.getArea());
        System.out.printf("El perimetre de r1: %.2f %n", r1.getPerimeter());
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
    }
    
    public static void colorAleatori(){
        Color color1 = getRandom();
        
        System.out.printf("\nRed: %d, Green: %d, Blue: %d \n", color1.getRed(), color1.getGreen(), color1.getBlue() );
    }
    
}
