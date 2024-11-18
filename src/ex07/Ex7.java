package ex07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class Ex7 {

  private JFrame frame;
  private DiskPanel diskPanel;
  private CurrentColor crrntBckColor = new CurrentColor();
  private CurrentColor crrntForColor = new CurrentColor();

  final int LARGE_RADIUS = 250;
  final int MEDIUM_RADIUS = 100;
  final int SMALL_RADIUS = 25;
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
        diskPanel.setBackground(c);
      }
    });
    btnPanel.add(btnRed);
    
    JButton btnGreen = new JButton("Green");
    btnGreen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntBckColor.changeGreen();
        diskPanel.setBackground(c);
      }
    });
    btnPanel.add(btnGreen);
    
    JButton btnBlue = new JButton("Blue");
    btnBlue.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntBckColor.changeBlue();
        diskPanel.setBackground(c);
      }
    });
    btnPanel.add(btnBlue);
    
    diskPanel = new DiskPanel();
    diskPanel.setBackground(Color.BLACK);
    frame.getContentPane().add(diskPanel, BorderLayout.CENTER);
    diskPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
    
    
    JPanel btnPanel2 = new JPanel();
    frame.getContentPane().add(btnPanel2, BorderLayout.SOUTH);
    btnPanel2.setLayout(new GridLayout(0, 1, 0, 0));
    
    
    JPanel bckButtonPanel = new JPanel();
    btnPanel2.add(bckButtonPanel);
    
    JButton btnFRed = new JButton("fRed");
    btnFRed.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntForColor.changeRed();
        diskPanel.setForeground(c);
      }
    });
    bckButtonPanel.add(btnFRed);
    
    JButton btnFGreen = new JButton("fGreen");
    btnFGreen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntForColor.changeGreen();
        diskPanel.setForeground(c);
      }
    });
    bckButtonPanel.add(btnFGreen);
    
    JButton btnFBlue = new JButton("fBlue");
    btnFBlue.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntForColor.changeBlue();
        diskPanel.setForeground(c);
      }
    });
    bckButtonPanel.add(btnFBlue);
    
    
    JPanel radButtonPanel = new JPanel();
    btnPanel2.add(radButtonPanel);
    
    JButton btnLarge = new JButton("Large");
    btnLarge.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        diskPanel.setRadius(LARGE_RADIUS);
        diskPanel.repaint();
      }
    });
    radButtonPanel.add(btnLarge);
    
    JButton btnMedium = new JButton("Medium");
    btnMedium.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        diskPanel.setRadius(MEDIUM_RADIUS);
        diskPanel.repaint();
      }
    });
    radButtonPanel.add(btnMedium);
    
    JButton btnSmall = new JButton("Small");
    btnSmall.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        diskPanel.setRadius(SMALL_RADIUS);
        diskPanel.repaint();
      }
    });
    radButtonPanel.add(btnSmall);
  }

}
