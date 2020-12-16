package state;

public class Client {
  public static void main(String[] args) {
    Light light = new Light();
    light.on();
    light.on();
    light.off();
    light.off();
  }
}
