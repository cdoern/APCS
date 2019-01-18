import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
public class Game {//implements MouseListener{

    static int clicks = 0;
    static int x = 0;
    static int y = 0;
    static JTextField text = new JTextField();
    static JTextField textpos = new JTextField();
    static String string = clicks+" Clicks";
    static String string2 = x +" "+y;
    public static void main(String[] args){
        frame();
    }
    public static void frame() {
        JPanel mainPanel = new JPanel();

        mainPanel.setFocusable(true);
        mainPanel.requestFocusInWindow();
        mainPanel.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed " + e.getKeyChar());
                x++;
                y++;
                text.setText(x+" "+y);

            }
        });
       mainPanel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                clicks++;
                text.setText(clicks + " Clicks");
                System.out.println("click");
            }
        });
        JFrame frame = new JFrame("Game");
        frame.getContentPane().add(mainPanel);
       /* frame.setFocusable(true);
        frame.setSize(500,500);
        Font f = new Font("Engravers MT", Font.BOLD, 23);
        text.setEditable(false);
        text.setBackground(Color.BLUE);
        text.setFont(f);
        text.setForeground(Color.GREEN);
        text.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        text.setText(string);
        Font g = new Font("Engravers MT", Font.BOLD, 12);
        textpos.setEditable(true);
        textpos.setBackground(Color.BLUE);
        textpos.setFont(g);
        textpos.setForeground(Color.GREEN);
        // text.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        textpos.setText(string2);

        frame.add(text, BorderLayout.SOUTH);

        frame.add(textpos, BorderLayout.NORTH);
        frame.setResizable(false);

        frame.getContentPane().setBackground(Color.BLUE);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        */
        text.setEditable(false);
        text.setBackground(Color.BLUE);
        text.setForeground(Color.GREEN);
        text.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        Font f = new Font("Engravers MT", Font.BOLD, 23);
        text.setFont(f);
        text.setText(string2);
        frame.add(text, BorderLayout.SOUTH);
        frame.getContentPane().setBackground(Color.BLUE);
        frame.setSize(600, 600);
        frame.setVisible(true);

       // frame.add(mainPanel, BorderLayout.CENTER);

    }

    // public void mousePressed(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

}