package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158602 <code>a(n) = 40*n^2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A158602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158602() {
    super(new long[] {1, -3, 3}, new long[] {1, 41, 161});
  }
}
