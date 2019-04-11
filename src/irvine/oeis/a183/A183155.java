package irvine.oeis.a183;

import irvine.oeis.LinearRecurrence;

/**
 * A183155 The number of order-preserving partial isometries (of <code>an</code> n-chain) of fix zero (fix of alpha <code>= 0))</code>. Equivalently, the number of order-preserving partial derangement isometries (of <code>an</code> n-chain).
 * @author Sean A. Irvine
 */
public class A183155 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183155() {
    super(new long[] {2, -5, 4}, new long[] {1, 1, 3});
  }
}
