/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03.comparing.ex1;

/**
 *
 * @author barcvilla
 */
public class ComparingTwoInt implements Comparable<Integer>
{
    private Integer first;
    
    
    public ComparingTwoInt(Integer first)
    {
        this.first = first;
    }
    
    @Override
    public int compareTo(Integer second)
    {
        if(this.first < second)
        {
            return -1;
        }
        if(this.first > second)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args) 
    {
        Integer f = Integer.parseInt(args[0]);
        Integer s = Integer.parseInt(args[1]);
        
        ComparingTwoInt c = new ComparingTwoInt(f);
        int r = c.compareTo(s);
        System.out.println("Los dos numeros son iguales: " + r);
    }
}
