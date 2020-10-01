package edu.oreluniver.lab2;

import java.awt.Color;
import java.awt.Graphics;

public class ColoredRect extends DrawableRect{
  private Color inColor;

  public ColoredRect(int width, int height) {
    super(width, height);
  }

  public void setInColor(Color inColor) {
    this.inColor = inColor;
  }

  public void fillRect(Graphics g){
    g.fillRect(getX1(), getY1(), getX2() - getX1(), getY2() - getY1());
  }
}
