
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
//import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class StaffGUI {

    private ArrayList<Staff> staffs;
    private final JFrame frame;
    private final JLabel idLabel;
    private JLabel firstNameLabel, lastNameLabel, ageLabel, genderLabel, dutyLabel, workloadLabel, salaryLabel;
    private JTextField idTextField, firstNameTextField, lastNameTextField, ageTextField, genderTextField, dutyTextField, workloadTextField, salaryTextField;
    
    // We will create a StaffGUI() constructor so that we may call it in the main method with the above
    //mentioned parameters.
    public StaffGUI() {
        //  We will initialize staffList and the GUI components
        staffs = new ArrayList<>();
        frame = new JFrame("Staff Management System");
        frame.setSize(600, 600);
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
        lastNameLabel.setBounds(20, 100, 100, 20);
        frame.add(lastNameLabel);

        lastNameTextField = new JTextField();
        lastNameTextField.setBounds(120, 100, 200, 20);
        frame.add(lastNameTextField);

        ageLabel = new JLabel("Age:");
        ageLabel.setBounds(20, 140, 100, 20);
        frame.add(ageLabel);

        ageTextField = new JTextField();
        ageTextField.setBounds(120, 140, 200, 20);
        frame.add(ageTextField);

        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20, 180, 100, 20);
        frame.add(genderLabel);

        genderTextField = new JTextField();
        genderTextField.setBounds(120, 180, 200, 20);
        frame.add(genderTextField);

        dutyLabel = new JLabel("Duty:");
        dutyLabel.setBounds(20, 220, 100, 20);
        frame.add(dutyLabel);

        dutyTextField = new JTextField();
        dutyTextField.setBounds(120, 220, 200, 20);
        frame.add(dutyTextField);

        workloadLabel = new JLabel("Workload:");
        workloadLabel.setBounds(20, 260, 100, 20);
        frame.add(workloadLabel);

        workloadTextField = new JTextField();
        workloadTextField.setBounds(120, 260, 200, 20);
        frame.add(workloadTextField);

        salaryLabel = new JLabel("Salary:");
        salaryLabel.setBounds(20, 300, 100, 20);
        frame.add(salaryLabel);

        salaryTextField = new JTextField();
        salaryTextField.setBounds(120, 300, 200, 20);
        frame.add(salaryTextField);

        // We will create a JButton object so that we may be able to add staffs after creating the 
        //JButton object
        
        JButton addStaffButton = new JButton("Add Staff");
        addStaffButton.setBounds(120, 500, 120, 30);
        addStaffButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // handle adding new teacher
                String id = idTextField.getText();
                String firstName = firstNameTextField.getText();
                String lastName = lastNameTextField.getText();
                int age = Integer.parseInt(ageTextField.getText());
                String gender = genderTextField.getText();
                String duty = dutyTextField.getText();
                double workload = Double.parseDouble(workloadTextField.getText());
                double salary = Double.parseDouble(salaryTextField.getText());

                Staff staff = new Staff(id, firstName, lastName, age, gender,
                        duty, workload, salary);
                staffs.add(staff);
                JOptionPane.showMessageDialog(null, "Teacher added successfully!");
            }
        });
        //addStaffButton = null;
        frame.add(addStaffButton);

//        

    
        // We need to setVisible to true so that our frame might be visible.
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        StaffGUI staffGUI = new StaffGUI();
    }
}

// other methods for displaying, updating, and removing teachers

