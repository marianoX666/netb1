/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio). 
*/
package circunferencia;

/**
 *
 * @author MARIANO
 */
import java.util.Scanner;
public class Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner sc = new Scanner(System.in);
      /*System.out.println("ingrese el radio");
      double Radio = sc.nextDouble();*/
      
      Circulo c1 = new Circulo();  
      
        System.out.println(c1.getRadio());
        double Radio;
        System.out.println("ingrese el radio"); 
      c1.setRadio(Radio = sc.nextDouble());
      c1.getRadio();
        System.out.println(c1.getRadio());
    
        System.out.println("el area es: "+Circulo.crearArea(Radio));
        System.out.println("el perimetro es: "+ Circulo.crearPerimetro(Radio));   
        }
    }
    

