/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject2;

/**
 *
 * @author nikhilnarwade
 */
public class Dog extends Animal {
    String sound;
    
    Dog(String name,int age,String gender,float weight,String sound){
        super(name,age,gender,weight);
        this.sound=sound;
        
        
    }
    
    public String toString(){
    
    return "\nname: "+this.name + "\nage: "+this.age+"\ngender: "+this.gender+"\nweight: "+this.weight+"\nsound: "+sound ;
}
    
}
