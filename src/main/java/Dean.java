/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ahmad
 */
//We will create a Dean class which extends the Teacher class/
public class Dean extends Teacher{

    //We create a Dean constructor with the following parameters.
    public Dean(String id, String firstName, String lastName, int age, String gender, String specialty, String degree, boolean isFullTime, double salary, String status) {
        super(id, firstName, lastName, age, gender, specialty, degree, isFullTime, salary, status);
    }


    String isFullTime() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
