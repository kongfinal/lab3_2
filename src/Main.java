import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        login loginPanel = new login();
        frame.setContentPane(loginPanel.getmainPanel());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//**//
        frame.setVisible(true);

    }
}
