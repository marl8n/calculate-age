/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calendar.clases.AgeUtils;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

/**
 *
 * @author marl8n
 */
public class AgeUtils {
    public static Function<Integer, String> addZeros = x -> x < 10 ? "0" + x : String.valueOf(x);
    
    public static TriFunction<Integer, Integer, Integer, LocalDate> parseDate =
            (day, month, year) -> LocalDate.parse(
                    year + "-" + addZeros.apply(month) + "-" + addZeros.apply(day)
            );
    
    public static TriFunction<Integer, Integer, Integer, Integer> calculateAge =
            (day, month, year) -> Period.between(
                    parseDate.apply(day, month, year), LocalDate.now()  
            ).getYears();
    
    //inferencia de datos
@FunctionalInterface
public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
}

