package factory_method;

public class PinkShoes extends Shoes {

  public PinkShoes(OrderList orderList) {
    this.name = orderList.getName();
    this.size = orderList.getSize();
    this.color = orderList.getColor();
    this.leather = orderList.getLeather();
    this.sole = orderList.getSole();
    this.hasPattern = orderList.getHasPattern();
  }
}
