
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Person {
    private String inputName;
    private int Age;
    private LocalDate BirthDate;

    public Person() {
        //Prevent Default Constructor
    }

    public Person(String name, LocalDate birthDate){
        this.inputName = name;
        this.BirthDate = birthDate;
    }

    public String getName()
    {
        return this.inputName;
    }
    public LocalDate getBirthDate()
    {
        return BirthDate;
    }

    public int getAge(){
        return Age;
    }
    
    public void setName(String Value){
        inputName = Value;
    }

    public void setBirthDate(LocalDate Value){
        BirthDate = Value;
    }

    public void setAge(int Value){
        Age = Value;
    }

    public long calculateAge(LocalDate start, LocalDate end){
        long year = ChronoUnit.YEARS.between(start, end);
        System.out.println(year);

        return year;
    }
}
