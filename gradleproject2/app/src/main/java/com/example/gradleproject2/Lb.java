/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject2;

/**
 *
 * @author nikhilnarwade
 */
public class Lb {
    String name;
    int age;
    String gender;
    
    Lb(String name, int age,String gender ){
        this.name = name;
        this.age=age;
        this.gender=gender;
    
    
    }
    public String toString(){
    
    return "\nname: "+this.name + "\nage: "+this.age+"\ngender: "+this.gender;
}
    
}
