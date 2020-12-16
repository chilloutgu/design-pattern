package state;

public class Sleeping implements LightState {

  @Override
  public void turnOn(Light light) {
    System.out.println("Light on!");
    light.setLightState(new On());
  }

  @Override
  public void turnOff(Light light) {
    System.out.println("Light off!");
    light.setLightState(new Off());
  }
}
