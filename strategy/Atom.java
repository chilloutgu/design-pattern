package strategy;

public class Atom extends Robot {

  public Atom(String name) {
    super(name);
  }

  /*
   * @Override public void attack() { System.out.println("주먹 공격!"); }
   * 
   * @Override public void move() { // TaekonV 의 move 매서드와 중복됨과 동시에 새로운 기능으로 변경하기
   * 위해 기존의 코드를 변경하고 있으므로 OCP 위반. System.out.println("걷기!"); }
   */
}
