import java.awt.*;
import javax.swing.JFrame;

public class Main extends Canvas{

    public void paint(Graphics g) {

        g.fillRect(130, 30,100, 80);
        g.drawOval(30,130,50, 60);
        setForeground(Color.RED);
        g.fillOval(130,130,50, 60);

    }

    public static void main(String[] args) {

        Main m = new Main();
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(m);
        f.setSize(400,400);
        f.setVisible(true);

    }
}
