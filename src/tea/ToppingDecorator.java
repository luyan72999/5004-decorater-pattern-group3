package tea;

/**
 * This is an abstract class(decorator) for the toppings.
 * Extend from superclass Beverage so that Decorator can wrap any beverage.
 * Add getSize() because the condiments to be charged according to size.
 */
public abstract class ToppingDecorator extends Tea {
  public Tea tea;
  public abstract String getDescription();

  public Size getSize() {
    return tea.getSize();
  }

}
