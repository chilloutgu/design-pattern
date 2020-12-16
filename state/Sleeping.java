package state;

public class Sleeping implements LightState {

  private static final Sleeping sleeping = new Sleeping();

  private Sleeping() {
  }

  public static Sleeping getInstance() {
    return sleeping;
  }

  @Override
  public void turnOn(Light light) {
    System.out.println("Light on!");
    light.setLightState(On.getInstance());
  }

  @Override
  public void turnOff(Light light) {
    System.out.println("Light off!");
    light.setLightState(Off.getInstance());
  }
}
