package ic.doc.co575;

/** This class represents a natural number */
public class NaturalNumber implements Expression {

  private final int value;

  public NaturalNumber(int val) {
    if (val <= 0) {
      throw new IllegalArgumentException(val + " is not a natural number.");
    }
    value = val;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @Override
  public int evaluate() {
    return value;
  }

  @Override
  public int depth() {
    return 0;
  }

  @Override
  public int compareTo(Expression other) {

    return Integer.compare(this.evaluate(), other.evaluate());
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Expression) {
      return this.compareTo((Expression) o) == 0;
    } else {
      return false;
    }
  }
}
