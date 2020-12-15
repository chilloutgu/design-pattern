package strategy;

public class MissileBehavior implements AttackBehavior {
  @Override
  public void attack() {
    System.out.println("미사일 공격!");
  }
}
