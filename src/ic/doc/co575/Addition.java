package ic.doc.co575;

import static java.lang.Integer.max;

public class Addition extends BinaryExpression {

  public Addition(Expression val_left, Expression val_right) {

    super(val_left, val_right);
  }

  @Override
  public int evaluate() {
    return left.evaluate() + right.evaluate();
  }

}
