package Lecture;

import java.awt.event.*;
import javax.swing.*;

public class swing {

    public static void main(String[] args) {
        JFrame jf = new JFrame("Demo swing application!");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jl = new JLabel("Click me to see magic!");
        JButton jb = new JButton("Click me!");

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setText("Look I changed!");
            }
        });

        JPanel jp = new JPanel();

        jp.add(jl);
        jp.add(jb);

        jf.add(jp);

        jf.setSize(300, 300);
        jf.setVisible(true);
    }
}
