package irvine.oeis.a207;

import irvine.oeis.LinearRecurrence;

/**
 * A207832 <code>20*x^2+1</code> is a perfect square.
 * @author Sean A. Irvine
 */
public class A207832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A207832() {
    super(new long[] {-1, 18}, new long[] {0, 2});
  }
}
