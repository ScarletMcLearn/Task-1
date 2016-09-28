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
public class MoreCalc {
    
    public int Sum(int a, int b, int c)
    {
        return a + b + c;
    }
    
    
    
    public int Product(int a, int b, int c)
    {
        return a * b * c;
    }
    
    
    
    public int Min(int a, int b, int c)
    {
        //double min;
        
        if (a < b && a < c)
        {
            return a;
        }
        
        else if ( b < c && b < a)
        {
            return b;
        }
        
        else if (c < b && c < a)
        {
            return c;
        }
        
        else 
            return 0;
    } //eikhane missing return statement dicche keno? return to korsi onek, if not giv else


    
    public int Max(int a, int b, int c)
    {
        //double min;
        
        if (a > b && a > c)
        {
            return a;
        }
        
        else if ( b > c && b > a)
        {
            return b;
        }
        
        else if (c > b && c > a)
        {
            return c;
        }
        
        else 
            return 0;
    }

    
    
    public double Average(int a, int b, int c)
    {
        return (double)(a+b+c)/3;
    }




}


