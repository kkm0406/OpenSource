import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ex2 extends JFrame{
    JPanel contentPane = new JPanel();
    ex2(){
        setTitle("드래깅동안 YELLO");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(contentPane);
        contentPane.setBackground(Color.GREEN);
        contentPane.addMouseMotionListener(new MyMouseMotionAdapter());

        contentPane.addMouseListener(new MyMouseAdapter2());
        setSize(400,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new ex2();
    }
    class MyMouseMotionAdapter extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e) {
            contentPane.setBackground(Color.YELLOW);
        }
    }
    class MyMouseAdapter2 extends MouseAdapter{
        public void mouseReleased(MouseEvent e) {
            // 눌러진 마우스 버튼이 떼어질 때
            contentPane.setBackground(Color.GREEN);
        }
    }
}
