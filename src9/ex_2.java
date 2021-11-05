
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame{
    public MyFrame() {
        setTitle("BorderLayout Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=getContentPane();
        c.setLayout(new BorderLayout(5,7));
        c.add(new JButton("North"),BorderLayout.NORTH);
        c.add(new JButton("West"),BorderLayout.WEST);
        c.add(new JButton("Center"),BorderLayout.CENTER);
        c.add(new JButton("East"),BorderLayout.EAST);
        c.add(new JButton("South"),BorderLayout.SOUTH);

        setSize(300,200);
        setVisible(true);
    }
}

public class ex_2 {

    public static void main(String[] args) {
        new MyFrame();
    }

}
