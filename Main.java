import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("JAVA Paradise");
        f.setSize(600, 200);
        f.setLayout(new GridLayout(0, 2, 20, 20));
        //start
        JLabel usernameLabel = new JLabel("Username");
        f.add(usernameLabel);
        JTextField username = new JTextField();
        f.add(username);
        JLabel passwordLabel = new JLabel("Password");
        f.add(passwordLabel);
        JTextField password = new JTextField();
        f.add(password);
        f.add(new JLabel(""));
        JButton loginBtn = new JButton("LOGIN");
        f.add(loginBtn);
        //end
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        loginBtn.addActionListener(v->{
            JOptionPane j = new JOptionPane();
            String num1 = username.getText();
            String num2 = password.getText();
            try{
                int number1 = Integer.parseInt(num1);
                int number2 = Integer.parseInt(num2);
                int sum = number1 + number2;
                j.showMessageDialog(f, "Sum is: " + sum);
            }
            catch (Exception e){
                j.showMessageDialog(f, "Please enter number! " + e.getMessage());
            }
        });
    }
}