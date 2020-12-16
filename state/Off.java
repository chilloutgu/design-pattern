package state;

public class Off implements LightState {

  private static final Off off = new Off();

  private Off() {
  }

  public static Off getInstance() {
    return off;
  }

  @Override
  public void turnOn(Light light) {
    System.out.println("Light on!");
    light.setLightState(On.getInstance());
  }

  @Override
  public void turnOff(Light light) {
    System.out.println("반응 없음");
  }
}
