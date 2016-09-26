/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_set_1.newpackage;

/**
 *
 * @author mac
 */
public class BMI {
    
    public double BMI(double a, double b, double c)
    {
        return ( a / (b * c));
    }
    
    
    public void Results(double n)
    {
        if (n < 18.5)
            System.out.println("Underweight!\n\n");
    
        else if (n < 24.9)
            System.out.println("Normal. B)\n\n");
        
        else if (n < 29.9)
            System.out.println("Overweight!\n\n");
        
        else
            System.out.println("Obese!!!!\n\n");
    }
    
}
