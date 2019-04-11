package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098739 This sequence is constructed using only the four single-digit primes <code>2,3,5,7</code> in that order.
 * @author Sean A. Irvine
 */
public class A098739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098739() {
    super(new long[] {-10, 1, 0, 0, 10}, new long[] {2, 23, 235, 2357, 23572});
  }
}
