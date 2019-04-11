package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049779 <code>a(n) =</code> Sum{T(n,2k): k=1,2,...,[ <code>n/2 ]},</code> array T as in A049777.
 * @author Sean A. Irvine
 */
public class A049779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049779() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {2, 5, 13, 23, 41, 62});
  }
}
