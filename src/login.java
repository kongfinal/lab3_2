import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
    private JTextField textUserLogin;
    private JPasswordField pwdUserPassword;
    private JButton submitButton;
    private JButton clearButton;
    private JPanel mainPanel;
    private JPasswordField pwdUesrpassword;


    public login() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,textUserLogin.getText()+" "
                        +new String(pwdUesrpassword.getPassword()));
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textUserLogin.setText("");
                pwdUesrpassword.setText("");
            }
        });
    }
    public JPanel getmainPanel(){
        return  mainPanel;
    }



}
