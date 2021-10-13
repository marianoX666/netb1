/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia;

/**
 *
 * @author MARIANO
 */
class Circulo {

    private double radio ; 
    
public Circulo() { radio = 10;
        
    }
    
    public Circulo(double radio) {
        this.radio = radio;
    }  
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
 
public static double crearArea(double radio){
    double area = radio * Math.PI;
    return area;
    
}

 public static double crearPerimetro(double radio){
     double perimetro = 2 * Math.PI * radio;
     return perimetro;
 }
       
    
    
    }  
    
    

