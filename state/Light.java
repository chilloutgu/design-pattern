package state;

public class Light {
  private static final int OFF = 0;
  private static final int ON = 1;
  private static final int SLEEPING = 2;

  private int currentState;

  public Light() {
    this.currentState = OFF;
  }

  public void on() {
    if (this.currentState == OFF) {
      System.out.println("Light on!");
      this.currentState = ON;
    } else if (this.currentState == SLEEPING) {
      System.out.println("Light on!");
      this.currentState = ON;
    } else {
      System.out.println("Sleeping mode!");
      this.currentState = SLEEPING;
    }
  }

  public void off() {
    if (this.currentState == ON) {
      System.out.println("Light off!");
      this.currentState = OFF;
    } else if (this.currentState == SLEEPING) {
      System.out.println("Light off!");
      this.currentState = OFF;
    } else {
      System.out.println("반응 없음");
    }
  }
}
