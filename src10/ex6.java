import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ex6 extends JFrame{
    JLabel label;
    ex6(){
        setTitle("클릭 연습용 응용프로그램"); // 제목 지정
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label= new JLabel("C");
        label.setSize(100,50);
        label.setLocation(100,100);
        label.addMouseListener(new MyMouseAdapter());

        add(label);
        setSize(500,500);
        setVisible(true);
        label.requestFocus();

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new ex6();
    }

    class MyMouseAdapter extends MouseAdapter{
        int x,y;
        public void mousePressed(MouseEvent e) {
            x = (int)(Math.random()*400);
            y = (int)(Math.random()*400);
            label.setLocation(x,y);
        }
    }
}