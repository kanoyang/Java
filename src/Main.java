
    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.KeyEvent;
    import java.awt.event.KeyListener;
    import java.text.DecimalFormat;
    import java.util.*;


    public class Main extends JPanel implements KeyListener{
        public Main(){
            addKeyListener(this);
        }

        @Override
        public void paintComponent(Graphics g){
            requestFocusInWindow();

        }

        public static void main(String[] args) {

        JFrame windows = new JFrame();
        windows.setSize(500,500);
        windows.setContentPane(new Main());
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windows.setVisible(true);


        }

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println(e.getKeyCode());

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
