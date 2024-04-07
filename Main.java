import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("JAVA Paradise");
        f.setSize(600, 200);
        f.setLayout(new GridLayout(0, 3, 20, 20));
        //start
        JLabel usernameLabel = new JLabel("Username");
        f.add(usernameLabel);
        JTextField username = new JTextField();
        f.add(username);
        f.add(new JLabel(""));
        JLabel passwordLabel = new JLabel("Password");
        f.add(passwordLabel);
        JPasswordField password = new JPasswordField();
        f.add(password);
        JButton showBtn = new JButton("Show");
        f.add(showBtn);
        f.add(new JLabel(""));
        JButton loginBtn = new JButton("LOGIN");
        f.add(loginBtn);
        //end
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        final boolean[] isHidden = {true};
        password.setEchoChar('\u25cf');

        showBtn.addActionListener(v-> {
            if(isHidden[0])
            {
                password.setEchoChar((char)0);
                showBtn.setText("Hide");
            }
            else
            {
                password.setEchoChar('\u25cf');
                showBtn.setText("Show");
            }
            isHidden[0] = !isHidden[0];
        });

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