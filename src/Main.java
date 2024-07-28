
    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.KeyEvent;
    import java.awt.event.KeyListener;
    import java.awt.event.MouseEvent;
    import java.awt.event.MouseListener;
    import java.text.DecimalFormat;
    import java.util.*;


public class Main extends JPanel implements KeyListener{

    Sheep s;

    public Main(){

        s =new Sheep(40,40);
        addKeyListener(this);
    }
    @Override
    public void paintComponent(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillRect(0,0,getWidth(),getHeight());
        s.drawSheep(g);
        requestFocusInWindow();

    }

    public static void main(String[] args) {
        JFrame windows = new JFrame();
        windows.setContentPane(new Main());
        windows.setSize(500, 500);
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windows.setVisible(true);//?
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {
        int k = e.getKeyCode();
        switch (k){
            case KeyEvent.VK_UP :
                s.walk(0,-5);
                System.out.println(s.toString());
                break;
            case KeyEvent.VK_DOWN:
                s.walk(0,5);
                System.out.println(s.toString());
                break;
            case KeyEvent.VK_RIGHT:
                s.walk(5,0);
                System.out.println(s.toString());
                break;
            case KeyEvent.VK_LEFT:
                s.walk(-5,0);
                System.out.println(s.toString());
                break;
            default:
                JOptionPane.showMessageDialog(this,"Please use an error key");
        }
        repaint();
        //System.out.println(s);
        //System.out.println(k);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}





