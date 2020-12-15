package strategy;

public class Client {
  public static void main(String[] args) {
    Robot atom = new Atom("atom");
    atom.setAttackBehavior(new PunchBehavior());
    atom.setMoveBehavior(new FlyingBehavior());

    Robot taekwonV = new TaekwonV("taekwonV");
    taekwonV.setAttackBehavior(new MissileBehavior());
    taekwonV.setMoveBehavior(new WalkingBehavior());

    System.out.println("My name is " + atom.getName());
    atom.performMove();
    atom.performAttack();

    System.out.println();

    System.out.println("My name is " + taekwonV.getName());
    taekwonV.performMove();
    taekwonV.performAttack();
  }
}
