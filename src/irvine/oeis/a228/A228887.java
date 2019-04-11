package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228887 <code>a(n) =</code> binomial(3*n <code>+ 1,3)</code>.
 * @author Sean A. Irvine
 */
public class A228887 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228887() {
    super(new long[] {-1, 4, -6, 4}, new long[] {4, 35, 120, 286});
  }
}
