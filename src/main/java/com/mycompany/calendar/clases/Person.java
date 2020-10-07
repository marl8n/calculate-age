/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calendar.clases;

import com.mycompany.calendar.clases.AgeUtils.AgeUtils;
import com.mycompany.calendar.clases.AgeUtils.AgeUtils.TriFunction;
import static com.mycompany.calendar.clases.AgeUtils.AgeUtils.calculateAge;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author marl8n
 */
public abstract class Person implements TriFunction{
    
    private String dpi;
    private String name;
    private Date birthDate;
    private Integer age;
    
    public Person (){
        
    }
    
    public Person (String dpi, String name, Date birthDate)
    {
        this.dpi = dpi;
        this.name = name;
        this.birthDate = birthDate;
        this.calcAge();
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        return age;
    }    
    
    
    private void calcAge(){
        Calendar c = Calendar.getInstance();
        c.setTime(birthDate);
        Integer year = c.get(Calendar.YEAR);
        Integer month = c.get(Calendar.MONTH);
        Integer day = c.get(Calendar.DAY_OF_MONTH);
        
        this.age = calculateAge.apply(day, month, year);
        
    }
    
    
    public String getInfo(){
        return "Hola, soy " + this.name + ", mi edad es: " + this.age + "Este es mi DPI: " + this.dpi;
    }

    @Override
    public Object apply(Object t, Object u, Object v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
