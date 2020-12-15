package strategy;

// Robot 클래스는 실체화가 될 수 없다는 것을 abstract 키워드를 통해 나타냄.
public abstract class Robot {
  private String name;
  private AttackBehavior attackBehavior;
  private MoveBehavior moveBehavior;

  public Robot(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  // 의존성 주입 DI.
  public void setAttackBehavior(AttackBehavior attackBehavior) {
    this.attackBehavior = attackBehavior;
  }

  public void setMoveBehavior(MoveBehavior moveBehavior) {
    this.moveBehavior = moveBehavior;
  }

  public void performAttack() {
    this.attackBehavior.attack();
  }

  public void performMove() {
    this.moveBehavior.move();
  }
}