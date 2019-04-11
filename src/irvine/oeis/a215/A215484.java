package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215484 <code>a(n) = 21*a(n-2) + 7*a(n-3),</code> with <code>a(0)=a(1)=0, a(2)=9</code>.
 * @author Sean A. Irvine
 */
public class A215484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215484() {
    super(new long[] {7, 21, 0}, new long[] {0, 0, 9});
  }
}
