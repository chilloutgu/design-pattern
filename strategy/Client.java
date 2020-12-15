package strategy;

public class Client {
  public static void main(String[] args) {
    Robot atom = new Atom("atomv1");
    Robot taekwonV = new TaekwonV("taekwonVv1");

    System.out.println("My name is " + atom.getName());
    atom.move();
    atom.attack();

    System.out.println();

    System.out.println("My name is " + taekwonV.getName());
    taekwonV.move();
    taekwonV.attack();
  }
}
