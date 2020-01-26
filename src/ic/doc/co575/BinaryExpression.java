package ic.doc.co575;

import static java.lang.Integer.max;

public abstract class BinaryExpression implements Expression {

  protected final Expression left;
  protected final Expression right;
  protected final int depth_val;

  public BinaryExpression(Expression valLeft, Expression valRight) {

    left = valLeft;
    right = valRight;

    depth_val = max(valLeft.depth(), valRight.depth());
  }

  public Expression getLeft() {
    return left;
  }

  public Expression getRight() {
    return right;
  }

  @Override
  public String toString() { return String.valueOf(left) + " · " + String.valueOf(right); }

  @Override
  public int depth() {
    return depth_val + 1;
  }

  @Override
  public int compareTo(Expression other) {
    return Integer.compare(this.evaluate(), other.evaluate());
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Expression) {
      return this.compareTo((Expression) o) == 0;
    } else
      return false;
  }

}
