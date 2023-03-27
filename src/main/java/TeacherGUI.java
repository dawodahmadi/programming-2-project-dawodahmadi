//We will import the following libraries so that our TeacherGUI object functions as expected.
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TeacherGUI {

    private ArrayList<Teacher> teachers;
    private JFrame frame;
    private JLabel idLabel, firstNameLabel, lastNameLabel, ageLabel, genderLabel, specialtyLabel, degreeLabel, salaryLabel, statusLabel;
    private JTextField idTextField, firstNameTextField, lastNameTextField, ageTextField, genderTextField, specialtyTextField, degreeTextField, salaryTextField, statusTextField;
    private JCheckBox isFullTimeCheckBox;
    
    //We will create a TeacherGUI constructor with the above mentioned parameters.
    public TeacherGUI() {
        // We will initialize teacherList and the GUI variables and methods
        teachers = new ArrayList<>();
        frame = new JFrame("Teacher HRMS");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(123, 50, 250));

        idLabel = new JLabel("ID:");
        idLabel.setBounds(20, 20, 100, 20);
        frame.add(idLabel);

        idTextField = new JTextField();
        idTextField.setBounds(120, 20, 200, 20);
        frame.add(idTextField);

        firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setBounds(20, 60, 100, 20);
        frame.add(firstNameLabel);

        firstNameTextField = new JTextField();
        firstNameTextField.setBounds(120, 60, 200, 20);
        frame.add(firstNameTextField);

        lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setBounds(20, 340, 100, 20);
        frame.add(lastNameLabel);

        lastNameTextField = new JTextField();
        lastNameTextField.setBounds(120, 340, 200, 20);
        frame.add(lastNameTextField);

        // Create the age label and text field
        ageLabel = new JLabel("Age:");
        ageLabel.setBounds(20, 100, 100, 20);
        frame.add(ageLabel);

        ageTextField = new JTextField();
        ageTextField.setBounds(120, 100, 200, 20);
        frame.add(ageTextField);


        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20, 140, 100, 20);
        frame.add(genderLabel);

        genderTextField = new JTextField();
        genderTextField.setBounds(120, 140, 200, 20);
        frame.add(genderTextField);


        specialtyLabel = new JLabel("Specialty:");
        specialtyLabel.setBounds(20, 180, 100, 20);
        frame.add(specialtyLabel);

        specialtyTextField = new JTextField();
        specialtyTextField.setBounds(120, 180, 200, 20);
        frame.add(specialtyTextField);


        degreeLabel = new JLabel("Degree:");
        degreeLabel.setBounds(20, 220, 100, 20);
        frame.add(degreeLabel);

        degreeTextField = new JTextField();
        degreeTextField.setBounds(120, 220, 200, 20);
        frame.add(degreeTextField);


        salaryLabel = new JLabel("Salary:");
        salaryLabel.setBounds(20, 260, 100, 20);
        frame.add(salaryLabel);

        salaryTextField = new JTextField();
        salaryTextField.setBounds(120, 260, 200, 20);
        frame.add(salaryTextField);


        statusLabel = new JLabel("Status:");
        statusLabel.setBounds(20, 300, 100, 20);
        frame.add(statusLabel);

        statusTextField = new JTextField();
        statusTextField.setBounds(120, 300, 200, 20);
        frame.add(statusTextField);

        // We need to create a checkbox so that it becomes more user friendly
        JCheckBox fullTimeCheckBox = new JCheckBox("Full-Time");
        fullTimeCheckBox.setBounds(120, 500, 100, 20);
        frame.add(fullTimeCheckBox);

        // similarly, we will also create JButton object so that it may add teacher object and shows
        // the confirmation with the JPaneOption feature.
        JButton addTeacherButton = new JButton("Add Teacher");
        addTeacherButton.setBounds(120, 380, 120, 30);
        addTeacherButton.addActionListener(new ActionListener() {
           
            //We need to override the actionPerformed method with the ActionEvent object as parameter
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String id = idTextField.getText();
                String firstName = firstNameTextField.getText();
                String lastName = lastNameTextField.getText();
                int age = Integer.parseInt(ageTextField.getText());
                String gender = genderTextField.getText();
                String specialty = specialtyTextField.getText();
                String degree = degreeTextField.getText();
                boolean isFullTime = false; // get full-time status from GUI input field
                if (fullTimeCheckBox.isSelected()) {
                    isFullTime = true;
                }
                double salary = Double.parseDouble(salaryTextField.getText());
                String status = statusTextField.getText();
                Teacher teacher = new Teacher(id, firstName, lastName, age, gender,
                        specialty, degree, isFullTime, salary, status);
                teachers.add(teacher);
                JOptionPane.showMessageDialog(null, "Teacher added successfully!");
            }
        });
        
        // We will need to add both the button in the frame
        
        frame.add(addTeacherButton);

        frame.setVisible(true);
    }

    
    public static void main(String[] args) {
        TeacherGUI teacherGUI = new TeacherGUI();
    }
}
