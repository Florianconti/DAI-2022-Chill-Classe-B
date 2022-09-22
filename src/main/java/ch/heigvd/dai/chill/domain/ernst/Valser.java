package ch.heigvd.dai.chill.domain.ernst;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Valser implements IProduct {

  public final static String NAME = "Valser";
  public final static BigDecimal PRICE = new BigDecimal(5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
