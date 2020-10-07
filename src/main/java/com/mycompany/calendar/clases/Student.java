/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calendar.clases;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author marl8n
 */
public class Student extends Person{
    
    String carnet;
    String carrera;
    ArrayList<Course> courses = new ArrayList<Course>();
    Integer c = 0;
    
    public Student (){
        
    }
    
    public Student(String dpi, String name, Date birthDate){
        super(dpi, name, birthDate);
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public void addCourse(String courseName){
        //courses.add(e);
    }
    
}
