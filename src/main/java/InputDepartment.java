
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * We created a seperate InputDepartment class which serves as the IO class. the methods below
 * will let us read and write to a csv file.
 * 
 */
public class InputDepartment {
    
    //This method will enable us to readTeacherData from a csv file. The method consists of creating
    //a path for the file and it will return an ArrayList of Teacher objects as return type.
    public static ArrayList<Teacher> readTeacherData(String path) {
    File file = new File(path);
    ArrayList<Teacher> teachers = new ArrayList<>();
    
    // We will create a try-catch block so that any problem while opening the file or any other exception
    //migh be caught and dont interrupt our class.
    try (Scanner input = new Scanner(file)){
        input.nextLine();

        while (input.hasNext()) {
            String row = input.nextLine();
            String[] data = row.split(",");

            if (data.length == 10) {
                String id = data[0];
                String firstName = data[1];
                String lastName = data[2];
                int age = Integer.parseInt(data[3]);
                String gender = data[4];
                String specialty = data[5];
                String degree = data[6];
                boolean isFullTime = Boolean.parseBoolean(data[7]);
                double salary = Double.parseDouble(data[8]);
                String status = data[9];

                Teacher teacher = new Teacher(id, firstName, lastName, age, gender,
                        specialty, degree, isFullTime, salary, status);
                teachers.add(teacher);
            }
        }
    } catch (FileNotFoundException e) {
        System.out.println("File not found: " + path);
    } catch (NumberFormatException e) {
        System.out.println("Number format exception");
    } catch (Exception e) {
        System.out.println("All other exceptions");
    }

    return teachers;
}

  // this method does the same thing as reading the teachers data.  
    public static ArrayList<Staff> readStaffData(String path) {
    File file = new File(path);
    ArrayList<Staff> staffs = new ArrayList<>();

    try (Scanner input = new Scanner(file)) {
        input.nextLine();

        while (input.hasNext()) {
            String row = input.nextLine();
            String[] data = row.split(",");

            String id = data[0];
            String firstName = data[1];
            String lastName = data[2];
            int age = Integer.parseInt(data[3]);
            String gender = data[4];
            String duty = data[5];
            double workload = Double.parseDouble(data[6]);
            
            double salary = Double.parseDouble(data[8]);

            Staff staff = new Staff(id, firstName, lastName, age, gender, duty, workload, salary);
            staffs.add(staff);
        }
    } catch (FileNotFoundException e) {
        System.out.println("Error: " + e.getMessage());
    }

    return staffs;
}

    // This method also serves the same purpose as reading the teachers data.
    public static ArrayList<Dean> readDeanData(String path) {
    File file = new File(path);
    ArrayList<Dean> deans = new ArrayList<>();

    try (Scanner input = new Scanner(file)) {
        input.nextLine();

        while (input.hasNext()) {
            String row = input.nextLine();
            String[] data = row.split(",");

            String id = data[0];
            String firstName = data[1];
            String lastName = data[2];
            int age = Integer.parseInt(data[3]);
            String gender = data[4];
            String specialty = data[5];
            String degree = data[6];
            boolean isFullTime = Boolean.parseBoolean(data[7]);
            double salary = Double.parseDouble(data[8]);
            String status = data[9];

            Dean dean = new Dean(id, firstName, lastName, age, gender, specialty, degree, isFullTime, salary, status);
            deans.add(dean);
        }

    } catch (FileNotFoundException e) {
        System.out.println("File not found!");
    }

    return deans;
}

    // This method will let us write the arraylist of Dean objects. The method consists of using
    // the PrintWriter class and we will pass an object of FileWriter class inside which the path will be
    //given as parameter.
    public static void writeDeanData(String path,ArrayList< ArrayList<Dean>> allDeans) {
    try (PrintWriter writer = new PrintWriter(new FileWriter(path))) {
        
        writer.println("ID,First Name,Last Name,Age,Gender,Specialty,Degree,Full Time,Salary,Status");
        writer.close();
       
     //We will create an enhanced loop which passes through all Dean objects.   
    for(ArrayList<Dean> deans : allDeans){   
        for (Dean dean : deans) {
            writer.print(dean.getId() + ",");
            writer.print(dean.getFirstName() + ",");
            writer.print(dean.getLastName() + ",");
            writer.print(dean.getAge() + ",");
            writer.print(dean.getGender() + ",");
            writer.print(dean.getSpecialty() + ",");
            writer.print(dean.getDegree() + ",");
            writer.print(dean.isFullTime() + ",");
            writer.print(dean.getSalary() + ",");
            writer.println(dean.getStatus());
        }
    }
    // seperate exception are given which specifies what kind of error we will catch so that
    // we might catch the error .
    } catch (IOException e) {
        System.out.println("Error writing to file!");
    } catch (NullPointerException e) {
        System.out.println("Null pointer exceptions!");
    } catch (IndexOutOfBoundsException e) {
        System.out.println("Null pointer exceptions!");
    } catch (Exception e) {
        System.out.println("All other exceptions");
    }
    
    
}

    
    
    
}

