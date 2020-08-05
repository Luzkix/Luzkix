import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 3 parameters:
    // The square size, the fill color, graphics
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

    squareBow(100, Color.RED, graphics); //v tomto řešení nevyužívám zadanou barvu - nevím jak je dostat do řešení, použil jsem tak 7 náhodných barev
  }

  public static void  squareBow (int size, Color fillColor, Graphics graphics) {

    int numberOfColors = 7;
    int sizeEnlargeCoeficient = (WIDTH-size/2)/numberOfColors/2;

    for (int i=0; i < numberOfColors; i++) {
      graphics.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
      graphics.fillRect(i*sizeEnlargeCoeficient,i*sizeEnlargeCoeficient, WIDTH - i*2*sizeEnlargeCoeficient,HEIGHT - i*2*sizeEnlargeCoeficient);
    }





  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}