/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *It's a Staff class which inherits from from its parent class Person. It aslso implements the Payroll interface
 * to compute the salary.
 * @author ahmad
 */
public class Staff extends Person implements Payroll {
    //The following are the instance variables.
    private String duty;
    private double workload;
    private double salary;
    
    //It's a constructor with the following parameters for the Staff Object.
    public Staff(String id, String firstName, String lastName, int age, String gender,
            String duty, double workload, double salary) {
        super(id, firstName, lastName, age, gender);
        this.duty = duty;
        this.workload = workload;
        this.salary = salary;
    }

    // The following are the getters and setters for the Staff instance variables.
    public void setDuty(String duty) {
        this.duty = duty;
    }

    public void setWorkload(double workload) {
        this.workload = workload;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDuty() {
        return duty;
    }

    public double getWorkload() {
        return workload;
    }

   
    //Here is another overriden method from Person class.
    @Override
    public String getCategory() {
        return "Staff";
    }

    //Here is an overrriden method from the Payroll interface to compute the salary for the Staff object.
    @Override
    public double ComputePayRoll() {
        double weeklyWorkingHours = Math.min(workload, 40);
        double salary = (weeklyWorkingHours * 32 * 2) * 0.75;
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %s %d", super.toString(), duty, workload, salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Staff)) {
            return false;
        }
        Staff s = (Staff) obj;
        return this.getId().equals(s.getId());
    }

    Object getDepartment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setDepartment(Department aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
