package ex07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex7 {

  private JFrame frame;
  private JPanel colorPanel;
  private CurrentColor crrntBckColor = new CurrentColor();

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ex7 window = new Ex7();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public Ex7() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel btnPanel = new JPanel();
    frame.getContentPane().add(btnPanel, BorderLayout.NORTH);
    
    JButton btnRed = new JButton("Red");
    btnRed.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntBckColor.changeRed();
        colorPanel.setBackground(c);
      }
    });
    btnPanel.add(btnRed);
    
    JButton btnGreen = new JButton("Green");
    btnGreen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntBckColor.changeGreen();
        colorPanel.setBackground(c);
      }
    });
    btnPanel.add(btnGreen);
    
    JButton btnBlue = new JButton("Blue");
    btnBlue.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntBckColor.changeBlue();
        colorPanel.setBackground(c);
      }
    });
    btnPanel.add(btnBlue);
    
    colorPanel = new JPanel();
    colorPanel.setBackground(Color.BLACK);
    frame.getContentPane().add(colorPanel, BorderLayout.CENTER);
  }

}
