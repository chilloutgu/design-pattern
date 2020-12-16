package state;

public class Light {
  private static final int ON = 1;
  private static final int OFF = 0;

  private int state;

  public Light() {
    this.state = OFF;
  }

  public void on() {
    if (this.state == OFF) {
      System.out.println("Light on!");
      this.state = ON;
    } else {
      System.out.println("반응 없음");
    }
  }

  public void off() {
    if (this.state == ON) {
      System.out.println("Light off!");
      this.state = OFF;
    } else {
      System.out.println("반응 없음");
    }
  }
}
