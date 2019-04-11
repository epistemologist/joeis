package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080674 <code>a(n) = (4/3)*(4^n - 1)</code>.
 * @author Sean A. Irvine
 */
public class A080674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080674() {
    super(new long[] {-4, 5}, new long[] {0, 4});
  }
}
