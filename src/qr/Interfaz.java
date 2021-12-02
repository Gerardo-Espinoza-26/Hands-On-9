package qr;

public class Interfaz extends QR{

    public void QR(){
        
        System.out.println("B0: " + String.format("%.2f", CR.getB0()));
        System.out.println("B1: " + String.format("%.2f", CR.getB1()));
        System.out.println("B2: " + String.format("%.2f", CR.getB2()));

        System.out.println("");
        
        System.out.println("Y = " + String.format("%.2f", CR.getB0()) + "x² + " + String.format("%.2f", CR.getB1()) + "x + " + String.format("%.2f", CR.getB2()));
        
        System.out.println("");
        
        System.out.println("R²: " + String.format("%.2f", getR2()));
        
    }//Fin public void QR
    
}//Fin public class Interfaz
