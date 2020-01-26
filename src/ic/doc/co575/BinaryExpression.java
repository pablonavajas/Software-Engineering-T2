package ic.doc.co575;

import static java.lang.Integer.max;

public abstract class BinaryExpression implements Expression {

  protected final Expression left;
  protected final Expression right;
  protected final int depth_val;

  public BinaryExpression(Expression val_left, Expression val_right) {

    left = val_left;
    right = val_right;

    depth_val = max(val_left.depth(), val_right.depth());
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
      return ((Expression) o).evaluate() == this.evaluate();
    } else
      return false;
  }

}
