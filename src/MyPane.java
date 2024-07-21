import javax.swing.*;
import java.awt.*;

public class MyPane extends JPanel {
    @Override
    public void paintComponent(Graphics g){
    g.setColor(Color.BLACK);
    g.fillRect(0,0,getWidth(),getHeight());
    }

}
