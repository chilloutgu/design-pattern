package state;

public class Off implements LightState {

  @Override
  public void turnOn(Light light) {
    System.out.println("Light on!");
    light.setLightState(new On());
  }

  @Override
  public void turnOff(Light light) {
    System.out.println("반응 없음");
  }
}
