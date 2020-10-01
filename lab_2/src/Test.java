import edu.oreluniver.lab2.ColoredRect;
import edu.oreluniver.lab2.Rectangle;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Test {

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(1, 1, 5, 5);
    Rectangle rectangle1 = new Rectangle(10, 15);
    Rectangle rectangle2 = new Rectangle();

    rectangle.rect_print();
    rectangle1.rect_print();
    rectangle2.rect_print();

    rectangle.move(1, 1);
    rectangle1.move(6, 6);
    rectangle2.move(3, 3);

    System.out.println("Moved: ");

    rectangle.rect_print();
    rectangle1.rect_print();
    rectangle2.rect_print();

    rectangle = rectangle.Union(rectangle1);

    System.out.println("United: ");

    rectangle.rect_print();

  }
}
