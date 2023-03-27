import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * We created a Driver class to test all our methods here.
 */
public class Driver {
    
    public static void main(String[] args) {
       
        System.out.println("Hello World");
        
        String path = "C:/Users/ahmad/Desktop/test.csv";
        
//        ArrayList<Dean> ComputerScienceDeans = new ArrayList<>();
//        Dean dean1 = new Dean("1", "ali", "moosavi", 35,"male" , "ComputerScience", "Masters", true, 3500.0, "high");
//        Dean dean2 = new Dean("1", "ali", "moosavi", 35,"male" , "ComputerScience", "Masters", true, 3500.0, "high");
//        ComputerScienceDeans.add(dean1);
//        ComputerScienceDeans.add(dean2);
//        
//        ArrayList<Dean> EngineeringDeans = new ArrayList<>();
//        Dean dean3 = new Dean("1", "ali", "moosavi", 35,"male" , "ComputerScience", "Masters", true, 3500.0, "high");
//        EngineeringDeans.add(dean3);
//        
//        ArrayList<ArrayList<Dean>> allDeans = new ArrayList<>();
//        allDeans.add(EngineeringDeans);
//        allDeans.add(ComputerScienceDeans);
        
        System.out.println(InputDepartment.readTeacherData(path));
    }
    
}
