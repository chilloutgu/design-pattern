package factory_method;

public class ShoesStore {

  public Shoes orderShoes(OrderList orderList) {
    Shoes shoes = null;
    Color color = orderList.getColor();

    if (color == Color.BLACK) {
      shoes = new BlackShoes(orderList);
    } else if (color == Color.BROWN) {
      shoes = new BrownShoes(orderList);
    } else {
      shoes = new PinkShoes(orderList);
    }

    shoes.checking();
    shoes.packaging();

    return shoes;
  }
}
