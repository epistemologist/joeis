package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016029 <code>a(1) = a(2) = 1, a(2n + 1) = 2*a(2n)</code> and <code>a(2n) = 2*a(2n - 1) + (-1)^n</code>.
 * @author Sean A. Irvine
 */
public class A016029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016029() {
    super(new long[] {2, -1, 2}, new long[] {1, 1, 2});
  }
}
