package factory_method;

public class BlackShoes extends Shoes {

  public BlackShoes(OrderList orderList) {
    this.name = orderList.getName();
    this.size = orderList.getSize();
    this.color = orderList.getColor();
    this.leather = orderList.getLeather();
    this.sole = orderList.getSole();
    this.hasPattern = orderList.getHasPattern();
  }
}
