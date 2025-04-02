/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject2;

/**
 *
 * @author nikhilnarwade
 */
public class Birds extends Lb {
    boolean fly;
    Birds(String name,int age,String gender,boolean fly){
        super(name,age,gender);
        this.fly=fly;
    
    }
    
    public String toString(){
    
    return "\nname: "+this.name + "\nage: "+this.age+"\ngender: "+this.gender+"\nfly: "+this.fly ;
}
    
}
