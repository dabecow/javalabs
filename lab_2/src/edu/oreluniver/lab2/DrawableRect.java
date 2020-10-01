package edu.oreluniver.lab2;

import java.awt.Color;
import java.awt.Graphics;

public class DrawableRect extends Rectangle {

  private Color outColor;

  public DrawableRect(int width, int height, Color outColor){
    super(width, height);
    this.outColor = outColor;
  }


  public void draw(Graphics g) {
    g.setColor(outColor);
    g.drawRect(getX1(), getY1(), getX2() - getX1(), getY2() - getY1());
  }

  public void setOutColor(Color color) {
    this.outColor = color;
  }
}
