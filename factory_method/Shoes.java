package factory_method;

public abstract class Shoes {

  protected String name;
  protected int size;
  protected Color color;
  protected Leather leather;
  protected Sole sole;
  protected boolean hasPattern;

  /* 추상 메서드는 반드시 오버라이드를 해야하며 따라서 오버라이드를 강제할 수 있다. */
  /*
   * abstract void checking();
   * 
   * abstract void packaging();
   */

  public void checking() {
    System.out.println("주문하신 제품 검수중입니다.");
  }

  public void packaging() {
    System.out.println("주문하신 제품 포장중입니다.");
  }
}
