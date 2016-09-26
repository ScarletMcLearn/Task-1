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
public class Greater_Lesser {
    
    private int a = 0, b = 0;
    
    //global getter setter / universal getter and setter, 2 ta parameter nibe, akta holo value ar arekta kon var, eta dile kaj kome na ba kora jay na?
    
    
    public void set_a(int n)
    {
        a = n;
    }
    
    public void set_b(int n)
    {
        b = n;
    }
    
    
    public int get_a()
    {
        return a;
    }
    
    public int get_b()
    {
        return b;
    }
    
    
    public void Compare(int m, int n)
    {
        if (m > n)
        {
            System.out.println(m+" Is Greater Than "+ n +".\n\n");
        }
        
        else if (m == n)
                {
                    System.out.println("The 2 Numbers Are Equal.\n\n");
                }
           
        else
            System.out.println(n+" Is Greater Than "+ m + ". \n\n");
        
    }
    
    
    
   
}
