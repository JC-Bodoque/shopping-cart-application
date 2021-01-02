import android.graphics.drawable.Drawable;

public class Product {

  public String title;
  // public Drawable productImage;
  public String description;
  public double price;
  public boolean selected;

  public Product(String title, String description, double price) {
    this.title = title;
    this.description = description;
    this.price = price;
  }

}