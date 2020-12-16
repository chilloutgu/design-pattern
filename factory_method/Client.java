package factory_method;

public class Client {
  public static void main(String[] args) {
    ShoesStore shoesStore = new ShoesStore();
    OrderList orderList = new OrderList.Builder("신입사원을 위한 검정구두", 270).withColor(Color.BLACK).withLeather(Leather.COW)
        .withSole(Sole.HARD).build();
    shoesStore.orderShoes(orderList);
  }
}
