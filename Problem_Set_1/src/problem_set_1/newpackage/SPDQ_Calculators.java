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
public class SPDQ_Calculators {
    
    private int a = 0, b = 0;
    
    
    public void Set_A(int n)
    {
        a = n;
    }
    
    public void Set_B(int n)
    {
        b = n;
    }
    
    
    public int Get_A()
    {
        return a;
    }
    
    public int Get_B()
    {
        return b;
    }
    
    //eikhane get/set a b lagbe ^ uprer line gula ? - directly nicher func. e dilei hoy na?
    
    public int SumGetter(int a, int b)
    {
       return a + b;
    }
    
    public int SubtractGetter(int a, int b)
    {
       return a - b;
    }
    
    public int ProductGetter(int a, int b)
    {
       return a * b;
    }
    
    public int QuotientGetter(int a, int b)
    {
       return a / b;
    }
    
    
    
    
    
     
}
