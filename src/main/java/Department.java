/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Here is the the Department class which lets us create an arraylist of teacher and staff with the following 
 * //constuctor. Each department is unique and is identified by its id in the department constructor.
 * @author ahmad
 */
import java.util.ArrayList;
import java.util.List;

public class Department {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    private String id;
    private List<Teacher> teachers;
    private List<Staff> staffs;
    private Teacher dean;
    private String name;

    public Department(String id) {
        this.id = id;
        this.teachers = new ArrayList<>();
        this.staffs = new ArrayList<>();
    }

    //We will create an addTeacher method which consists of try-resource block and it will show the error if ther is one
    public void addTeacher(Teacher teacher) throws Exception {
        if (teachers.contains(teacher) || teacher.getDepartment() != null) {
            throw new Exception("Teacher already exists or teacher has been assigned in another department.");
        }
        teachers.add(teacher);
        teacher.setDepartment(this);
    }
    // it serves the same purpose as addTeacher method
    public void addStaff(Staff staff) throws Exception {
        if (this.staffs.contains(staff) || staff.getDepartment() != null) {
            throw new Exception("Staff member already exists or is assigned to another department.");
        }
        this.staffs.add(staff);
        staff.setDepartment(this);
    }
    
    // We will create a setDean method which will set the Dean in the specific department with try-resource block. 
    public void setDean(Teacher dean) throws Exception {
        if (!teachers.contains(dean)) {
            throw new Exception("Dean must be a teacher in the specific Department.");
        }
        this.dean = dean;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(List<Staff> staffMembers) {
        this.staffs = staffMembers;
    }

    public Teacher getDean() {
        return dean;
    }

}
