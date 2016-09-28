/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_set_1;

/**
 *
 * @author mac
 */
import java.util.Scanner;
import problem_set_1.newpackage.BMI;
import problem_set_1.newpackage.Greater_Lesser;
import problem_set_1.newpackage.MoreCalc;
import problem_set_1.newpackage.SPDQ_Calculators;

public class Problem_Set_1_Tester {

    /**
     * @param args the command line arguments
     */
    
    
    //public void body_mass_index_tester();
    
    public static void main(String[] args) {
     //   // TODO code application logic here
        
       body_mass_index_tester();
        
    
    
    //eta keno colse na
   // three_int_tester();
    


 // System.err.println("sdd");
//        
       
three_int_tester();

bigger();

Calc();
    }     
    
    
    
    public static void body_mass_index_tester()
    {
         System.out.print("Please Enter Your Weight(in kg): ");
        
        Scanner input = new Scanner(System.in);
        
        float weight = input.nextFloat();
        
        //System.out.println("Your weight is "+ (weight+1));
        
        System.out.print("Please Enter Your Height(in m): ");
        
       
        
        float height = input.nextFloat();
        
        BMI logic = new BMI() ;
                
        double bmi = logic.BMI(weight, height);
        
        System.out.printf("Your BMI Is %f.\n\n", bmi);
        
        if (bmi <18.5)
            System.out.println("Underweight.");
        else if (bmi <24.9)
            System.out.println("Normal");
        else if (bmi <29.9)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
    
    /**
     *
     */
    
    
    public static void three_int_tester()
        {
       // System.err.println("sdd");
        
        MoreCalc prob_3 = new MoreCalc();
        
        
        System.out.print("Please Enter Your First Integer: ");
        
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        
        //System.out.println("Your weight is "+ (weight+1));
        
        System.out.print("Please Enter Your Second Integer: ");
        
       
        
        int b = input.nextInt();
        
         System.out.print("Please Enter Your Third Integer: ");
        
       
        
        int c = input.nextInt();
        
        
        int sum = prob_3.Sum(a, b, c);
        
        
        System.out.println("The Sum Is : " + sum +".\n\n");
        
        System.out.printf("The Product Is : %d\n\n", prob_3.Product(a, b, c));
        
            System.out.printf("The Minimum Number Is : %d\n\n", prob_3.Min(a, b, c));
            
            System.out.printf("The Minimum Number Is : %d\n\n", prob_3.Max(a, b, c));
            
            System.out.printf("The Average Is : %f\n\n", prob_3.Average(a, b, c));
            
            
        
        
    }
    
    
    public static void bigger()
    {   
        
        Greater_Lesser big = new Greater_Lesser();
        
         System.out.print("Please Enter Your First Integer: ");
        
        Scanner input = new Scanner(System.in);
        
        int a;
        a = input.nextInt();
        
        //System.out.println("Your weight is "+ (weight+1));
        
        System.out.print("Please Enter Your Second Integer: ");
        
       
        
        int b = input.nextInt();
    
        
        big.Compare(a, b);
    }
    
    
    
    public static void Calc()
    {
        SPDQ_Calculators calgi = new SPDQ_Calculators();
        
         System.out.print("Please Enter Your First Integer: ");
        
        Scanner input = new Scanner(System.in);
        
        int a;
        a = input.nextInt();
        
        //System.out.println("Your weight is "+ (weight+1));
        
        System.out.print("Please Enter Your Second Integer: ");
        int b;
        b = input.nextInt();
        
        System.out.println("The Sum Is "+  calgi.SumGetter(a, b));
        
        System.out.println("The Product Is " +    calgi.ProductGetter(a, b));
        
        System.out.println("The Difference Is " +calgi.SubtractGetter(a, b));
        
        System.out.println("The Quotient Is "+ calgi.QuotientGetter(a, b));
    }
}
