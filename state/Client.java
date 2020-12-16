package state;

public class Client {
  public static void main(String[] args) {
    Light light = new Light();
    light.turnOn(); /* Light on! */
    light.turnOn(); /* Sleeping mode */
    light.turnOn(); /* Light on! */
    light.turnOn(); /* Sleeping mode */
    light.turnOff(); /* Light off! */
    light.turnOff(); /* 반응 없음 */
  }
}
