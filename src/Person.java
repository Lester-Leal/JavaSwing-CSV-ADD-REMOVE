
import java.time.LocalDate;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC MERCHANDISE
 */
public class Person {
    private String inputName;
    private int Age;
    private LocalDate BirthDate;
    
    public Person(String names, LocalDate bdate){
        this.inputName = names;
        this.BirthDate = bdate;
    }
    
    public String getName()
    {
        return inputName;
    }
    public LocalDate getBirthDate()
    {
        return BirthDate;
    }
    
    public void setName(String Value){
        this.inputName = Value;
    }
}
