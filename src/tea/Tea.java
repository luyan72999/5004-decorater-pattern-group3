package tea;

public abstract class Tea {
  Size size = Size.LARGE;
  String description = "Unknown Tea";
  public String getDescription() {
    return this.description;
  }
  public void setSize(Size size) {
    this.size = size;
  }

  public Size getSize() {
    return this.size;
  }

  public abstract double price();
}
