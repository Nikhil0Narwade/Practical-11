/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject2;

/**
 *
 * @author nikhilnarwade
 */
public class Humans extends Lb {
    float height;
    Humans(String name,int age,String gender,float height ){
        super(name,age,gender);
        this.height=height;
    
    
    }
    public String toString(){
    
    return "\nname: "+this.name + "\nage: "+this.age+"\ngender: "+this.gender+"\nheight: "+height;
}
    
    
}
