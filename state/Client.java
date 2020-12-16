package state;

public class Client {
  public static void main(String[] args) {
    Light light = new Light();
    light.on(); /* Light on! */
    light.on(); /* Sleeping mode */
    light.on(); /* Light on! */
    light.on(); /* Sleeping mode */
    light.off(); /* Light off! */
    light.off(); /* 반응 없음 */
  }
}
