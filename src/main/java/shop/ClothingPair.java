package shop;

public class ClothingPair<E extends Sized> extends Pair<E> {
  public ClothingPair(E left, E right) {
    super(left, right);
  }

  public boolean isMatched() {
    return getLeft().getSize() == getRight().getSize();
//        && left.getColor().equals(right.getColor());
  }

}
