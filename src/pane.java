import javax.swing.*;
import java.awt.*;

public class pane extends JPanel {
    @Override
    public void paintComponent(Graphics g){
        System.out.println("print");
        g.setColor(Color.green);
        g.fillRect(0,0,getHeight(),getWidth());

    }

}
