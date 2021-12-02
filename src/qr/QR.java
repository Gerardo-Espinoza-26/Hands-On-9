package qr;

import static java.lang.Math.pow;

public class QR extends Cramer{

    Cramer CR = new Cramer();
    
    double sse, Media, sst, r2 = 0;
    
    double b0 = CR.getB0();
    double b1 = CR.getB1();
    double b2 = CR.getB2();
    
    public double SSE(){
        
        for(int i = 0; i < Iteracion; i++){
            
            sse = pow((y[i] - b0 * pow(x[i], 2) - b1 * x[i] - b2),2) + sse;
            
        }//Fin for i
        
        return sse;
        
    }//Fin public dobule SSE
    
    public double SST(){
        
        for(int i = 0; i < Iteracion; i++){
            
            Media = Media + y[i];
            
        }//Fin for
        
        Media = Media / Iteracion;
        
        for(int i = 0; i < Iteracion; i++){
            
            sst = pow((y[i] - Media ),2) + sst;
            
        }//Fin for i
        
        return sst;
        
    }//Fin public dobule SST
    
    public double getR2(){
        
        r2 = 1 - (SSE()/SST());
        
        return r2;
        
    }//Fin public double getR2
    
}//Fin public class QR
