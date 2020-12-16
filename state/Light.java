package state;

public class Light {
  private LightState currentState;

  public Light() {
    this.currentState = new Off();
  }

  public void setLightState(LightState newState) {
    this.currentState = newState;
  }

  public void turnOn() {
    currentState.turnOn(this);
  }

  public void turnOff() {
    currentState.turnOff(this);
  }
}
