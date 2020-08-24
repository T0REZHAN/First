package PROJECTT;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ListFrameStudents extends Container {
    public JTextArea area;

    public ListFrameStudents() {
        try {

            JLabel label = new JLabel("List students");
            label.setLocation(250, 100);
            label.setSize(300, 30);

            setLayout(null);

            setSize(500, 500);

            area = new JTextArea();
            area.setSize(300, 30);
            area.setLocation(100, 160);
            add(label);

        } catch (Exception e) {
            e.printStackTrace();
        }


        JButton btn = new JButton("Back");
        btn.setLocation(250, 450);
        btn.setSize(150, 30);
        btn.addActionListener(actionEvent -> {
            MainFrame.listFrame.setVisible(false);
            MainFrame.menu.setVisible(true);
            Main.frame.repaint();
        });

        add(btn);
    }

    public void updateList() {
        //он ниодин и тот же студент который в main
        for (Student student : Main.students) {
            area.append(student.toString());
        }
        add(area);
    }
}
