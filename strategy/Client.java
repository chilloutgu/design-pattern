package strategy;

public class Client {
  public static void main(String[] args) {
    Robot atom = new Atom("atom");
    atom.setAttackBehavior(new PunchBehavior());
    atom.setMoveBehavior(new FlyingBehavior());

    Robot taekwonV = new TaekwonV("taekwonV");
    taekwonV.setAttackBehavior(new MissileBehavior());
    taekwonV.setMoveBehavior(new WalkingBehavior());

    Robot sungard = new Sungard("sunguard");
    sungard.setAttackBehavior(() -> System.out.println("레이저 공격!"));
    sungard.setMoveBehavior(() -> System.out.println("순간 이동!"));

    System.out.println("My name is " + atom.getName());
    atom.performMove();
    atom.performAttack();

    System.out.println();

    System.out.println("My name is " + taekwonV.getName());
    taekwonV.performMove();
    taekwonV.performAttack();

    System.out.println();
    System.out.println("My name is " + sungard.getName());
    sungard.performMove();
    sungard.performAttack();
  }
}
