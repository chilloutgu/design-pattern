package strategy;

public class PunchBehavior implements AttackBehavior {
  @Override
  public void attack() {
    System.out.println("펀치 공격!");
  }
}
