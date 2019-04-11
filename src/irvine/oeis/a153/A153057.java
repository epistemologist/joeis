package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153057 <code>a(0)=3</code>; <code>a(n) = n^2 + a(n-1)</code> for <code>n&gt;0</code>.
 * @author Sean A. Irvine
 */
public class A153057 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153057() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 4, 8, 17});
  }
}
