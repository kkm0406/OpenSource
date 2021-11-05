import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame1 extends JFrame{
    public MyFrame1() {
        Color color[]= {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.CYAN,Color.BLUE,Color.magenta,Color.GRAY,Color.PINK,Color.LIGHT_GRAY};
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=getContentPane();
        c.setLayout(new GridLayout(1,10));

        JButton btn[]=new JButton[10];

        for(int i=0;i<10;i++) {
            btn[i]=new JButton(Integer.toString(i));
            btn[i].setBackground(color[i]);
            c.add(btn[i]);
        }

        setSize(500,200);
        setVisible(true);
    }
}


public class ex_4 {

    public static void main(String[] args) {
        new MyFrame1();
    }

}
