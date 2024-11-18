package ex07;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DiskPanel extends JPanel {
  private int radius = 100; //半径
  
  public int getRadius() {
    return radius;
  }
  
  public void setRadius(int r) {
    radius = r;
    return;
  }
  
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    //矩形を塗りつぶす
    g.fillOval(this.getWidth()/2 - radius, this.getHeight()/2 - radius,
                radius*2, radius*2);
    
  }
}
