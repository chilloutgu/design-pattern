package state;

public class On implements LightState {

  private static final On on = new On();

  private On() {

  }

  public static On getInstance() {
    return on;
  }

  @Override
  public void turnOn(Light light) {
    System.out.println("Sleeping mode");
    light.setLightState(Sleeping.getInstance());
  }

  @Override
  public void turnOff(Light light) {
    System.out.println("Light off!");
    light.setLightState(Off.getInstance());
  }
}
