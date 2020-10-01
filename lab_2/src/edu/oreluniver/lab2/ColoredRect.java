package edu.oreluniver.lab2;

import java.awt.Color;
import java.awt.Graphics;

public class ColoredRect extends DrawableRect{
  private Color inColor;

  public ColoredRect(int width, int height, Color inColor, Color outColor) {
    super(width, height, outColor);
    this.inColor = inColor;
  }

  public void setInColor(Color inColor) {
    this.inColor = inColor;
  }

  @Override
  public void draw(Graphics g){
    g.setColor(inColor);
    g.fillRect(getX1(), getY1(), getX2() - getX1(), getY2() - getY1());
    super.draw(g);
  }
}
