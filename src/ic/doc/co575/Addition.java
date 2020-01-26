package ic.doc.co575;

import static java.lang.Integer.max;

public class Addition extends BinaryExpression {

  public Addition(Expression valLeft, Expression valRight) {

    super(valLeft, valRight);
  }

  @Override
  public int evaluate() {
    return left.evaluate() + right.evaluate();
  }

}
