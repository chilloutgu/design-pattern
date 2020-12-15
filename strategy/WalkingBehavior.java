package strategy;

public class WalkingBehavior implements MoveBehavior {
  @Override
  public void move() {
    System.out.println("걷기!");
  }
}
