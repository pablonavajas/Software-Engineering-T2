package ic.doc.co575;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NaturalNumberTest {

  @Test
  public void containsValue() {
    NaturalNumber w = new NaturalNumber(2);
    assertThat(w.evaluate(), is(2));
  }
}
