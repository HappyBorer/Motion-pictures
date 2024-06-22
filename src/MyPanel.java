import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    private int x = 0;
    private int y = 0;
    private Timer timer = new Timer(50, this);
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        Image image = new ImageIcon("D:\\java developer\\Motion pictures\\src\\grandpa.png").getImage();
        g2d.drawImage(image, x, y, null);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        if(x != 550 && y != 550){
            x++;
            y++;
        }else{
            x = -50;
            y = x;
        }

    }
}
