package qr;

public class DataSet {
    
    double [] x = {-3, -2, -1, 0, 1, 2, 3};
    //double [] x = {50, 50, 50, 70, 70, 70, 80, 80, 80, 90, 90, 90, 100, 100, 100};
    //double [] x = {0, 20, 40, 60, 80, 100};
    
    double [] y = {7.5, 3, 0.5, 1, 3, 6, 14};
    //double [] y = {3.3, 2.8, 2.9, 2.3, 2.6, 2.1, 2.5, 2.9, 2.4, 3.0, 3.1, 2.8, 3.3, 3.5, 3.0};
    //double [] y = {0.002, 0.0012, 0.0060, 0.0300, 0.0900, 0.2700};
    
    int Iteracion = x.length;
    
    public int getIteracion(){
        
        return Iteracion;
        
    }//Fin public int getIteracion
    
}//Fin public class DataSet