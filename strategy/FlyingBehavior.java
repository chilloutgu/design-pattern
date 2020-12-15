package strategy;

public class FlyingBehavior implements MoveBehavior {
  @Override
  public void move() {
    System.out.println("날기!");
  }
}
