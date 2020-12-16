package state;

public class On implements LightState {

  @Override
  public void turnOn(Light light) {
    System.out.println("Sleeping mode");
    light.setLightState(new Sleeping());
  }

  @Override
  public void turnOff(Light light) {
    System.out.println("Light off!");
    light.setLightState(new Off());
  }
}
