/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 *  This class represents a person. its an abstract class, which gives the template for other classes such
as teacher, staff and dean. */
public abstract class Person {

   
    private String firstName;
    private String lastName;
    private int age;
    private String id;
    private String gender;

    /*We will create a constructor of the Person class with the fillowing parameters.
    */
    
    public Person(String id, String firstName, String lastName, int age, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
    //It's a specific abstract method asked in the project.
    public abstract String getCategory();
    
    
    //It's an override of methods toString and equals for the Person class.
    @Override
    public String toString() {
        return String.format("%s %s (ID: %s, Age: %d, Gender: %s)", 
            firstName, lastName, id, age, gender);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        return id.equals(person.id);
    }
    // The following are the getters and setters for the Person Object parameters.
     public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }


}



    
    
    

