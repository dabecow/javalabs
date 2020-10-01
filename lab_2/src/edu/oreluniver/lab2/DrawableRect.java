package edu.oreluniver.lab2;

import java.awt.Color;
import java.awt.Graphics;

public class DrawableRect extends Rectangle {

  public DrawableRect(int width, int height){
    super.setX1(0);
    super.setX2(width);
    super.setY1(0);
    super.setY2(height);
  }

  private Color outColor;

  public void draw(Graphics g) {
    g.drawRect(getX1(), getY1(), getX2() - getX1(), getY2() - getY1());
  }

  public void setOutColor(Color color) {
    this.outColor = color;
  }
}
