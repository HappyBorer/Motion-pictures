import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(){
        super("Motion pictures");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setBounds(500, 200, 600, 600);
        MyPanel panel = new MyPanel();
        Container container = getContentPane();
        container.add(panel);
        setVisible(true);

    }
}
