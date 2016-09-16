package kata1;

import java.util.Date;


public class Person {
    private final String name;
    private final String apellido;
    private final Date birthdate;

    public Person(String name, String apellido, Date birthdate) {
        this.name = name;
        this.apellido = apellido;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }
    
    public int getAge(){
        return (int) ((new Date().getTime() - birthdate.getTime())/31536000000L);
    }
    
    

}
