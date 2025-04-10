/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TA;

/**
 *
 * @author nikhilnarwade
 */
public class TA {
    
    public static void main(String args[])
    {
    
        int count=0 , p= 0,o=0;
        
        String s = "abcd@ ,    .hello";
        String z= s;
        String y= s;
        String x= s;
        
        
       int aa=  s.length();
        System.out.println(aa);
        
        //for lines
        for(int i = 0;i<s.length();i++)
        {
            s.replaceFirst(".",",");
            count++;
            
        
      }
        
                System.out.println(count);

        
        
        //for tabs
            for(int i = 0;i<z.length();i++)
        {
            z.replaceFirst("    ","T");
            p++;
            
        
      }
                    System.out.println(p);

            //for spaces
               for(int i = 0;i<y.length();i++)
        {
            y.replaceFirst(" ","S");
            o++;
            
        
      }
            
                System.out.println(o);

        
    
    
    
    
    }
    
    
}
