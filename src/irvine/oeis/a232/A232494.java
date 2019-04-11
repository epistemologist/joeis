package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232494 If <code>n mod 2 = 0</code> then <code>2^(n-1)*(3^n+3*3^(n/2)-2)</code> otherwise <code>2^(n-1)*(3^n+5*3^((n-1)/2)-2)</code>.
 * @author Sean A. Irvine
 */
public class A232494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232494() {
    super(new long[] {144, -96, 0, 8}, new long[] {1, 6, 32, 160});
  }
}
