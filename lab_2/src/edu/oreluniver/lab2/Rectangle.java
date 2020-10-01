package edu.oreluniver.lab2;

public class Rectangle {

  private int x1, y1,
              x2, y2;

  public Rectangle(int x1, int y1, int x2, int y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  public Rectangle(int width, int height){
    this.x1 = 0;
    this.y1 = 0;
    this.x2 = width;
    this.y2 = height;
  }

  public Rectangle(){
    this.x1 = 0;
    this.y1 = 0;
    this.x2 = 0;
    this.y2 = 0;
  }

  public void rect_print() {
    System.out.println("Rectangle{" +
        "x1=" + x1 +
        ", y1=" + y1 +
        ", x2=" + x2 +
        ", y2=" + y2 +
        '}');
  }

  public void move(int dx, int dy) {
    this.x1 += dx;
    this.x2 += dx;
    this.y1 += dy;
    this.y2 += dy;
  }

  public Rectangle Union(Rectangle rectangle) {
    int nx1, ny1,
        nx2, ny2;
    nx1 = Math.min(rectangle.getX1(), this.x1);
    nx2 = Math.max(rectangle.getX2(), this.x2);
    ny1 = Math.min(rectangle.getY1(), this.y1);
    ny2 = Math.max(rectangle.getY2(), this.y2);

    return new Rectangle(nx1, ny1, nx2, ny2);
  }

  public int getX1() {
    return x1;
  }

  public int getX2() {
    return x2;
  }

  public int getY1() {
    return y1;
  }

  public int getY2() {
    return y2;
  }

  public void setX1(int x1) {
    this.x1 = x1;
  }

  public void setX2(int x2) {
    this.x2 = x2;
  }

  public void setY1(int y1) {
    this.y1 = y1;
  }

  public void setY2(int y2) {
    this.y2 = y2;
  }
}

