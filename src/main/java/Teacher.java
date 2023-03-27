/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * It's a Teacher class which inherits the Person class and we will also implement the Payroll interface here.
 */
public class Teacher extends Person implements Payroll {

    private String specialty;
    private String degree;
    private String status;
    private double salary;
    private boolean isFullTime;
    

    /*It's a Teacher constructor with the following parameters.*/
    public Teacher(String id, String firstName, String lastName, int age, String gender,
            String specialty, String degree, boolean isFullTime, double salary, String status) {
        super(id, firstName, lastName, age, gender);
        this.specialty = specialty;
        this.degree = degree;
        this.isFullTime = isFullTime;
        this.status = status;
        this.salary = salary;
        
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setIsFullTime(boolean isFullTime) {
        this.isFullTime = isFullTime;
    }

    

    public String getSpecialty() {
        return specialty;
    }

    public String getDegree() {
        return degree;
    }

    public String getStatus() {
        return status;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isIsFullTime() {
        return isFullTime;
    }

    
    double degreeRate;
    public double degreeRate(String degree) {
        
        if (degree.equalsIgnoreCase("PhD")) {
            degreeRate = 112;
        } else if (degree.equalsIgnoreCase("Master")) {
            degreeRate = 82;
        } else if (degree.equalsIgnoreCase("Bachelor")) {
            degreeRate = 42;
        }
        return degreeRate;
    }

    /* It's an overriden version of getcategory method mentioned in Person class.*/
    @Override
    public String getCategory() {
        return "Teacher";
    }

    // Its an overriden method from the Payroll interface.
    
    public double ComputePayRoll(int hoursWorked) {
        //int hoursWorked = 0;

        if (isFullTime) {
            salary = (32 * degreeRate * 2) * 0.85;
        } else {
            salary = (2 * degreeRate * hoursWorked) * 0.76;
        }
        return salary;
    }

    @Override
    public String toString() {
        return "Teacher [id=" + getId() + ", firstName=" + getFirstName() + ", lastName=" + getLastName() + ", age=" + getAge()
                + ", gender=" + getGender() + ", specialty=" + specialty + ", degree=" + degree + ", status=" + status
                + ", salary=" + salary + ", isFullTime=" + isFullTime + ", degreeRate=" + degreeRate + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Teacher)) {
            return false;
        }
        Teacher t = (Teacher) obj;
        return this.getId().equals(t.getId());
    }

    Object getDepartment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setDepartment(Department aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double ComputePayRoll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
