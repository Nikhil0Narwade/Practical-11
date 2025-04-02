/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject2;

/**
 *
 * @author nikhilnarwade
 */
public class Animal extends Lb {
    float weight;
    Animal(String name,int age,String gender,float weight){
    super(name,age,gender);
    this.weight = weight;
    
    }
    
    public String toString(){
    
    return "\nname: "+this.name + "\nage: "+this.age+"\ngender: "+this.gender+"\nweight: "+this.weight;
}
}
