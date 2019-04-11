package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289798 p-INVERT of <code>(-1 + 2^n),</code> where p(S) <code>= 1 -</code> S - S^2.
 * @author Sean A. Irvine
 */
public class A289798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289798() {
    super(new long[] {-4, 14, -15, 7}, new long[] {1, 5, 22, 93});
  }
}
