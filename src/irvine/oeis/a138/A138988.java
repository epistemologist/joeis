package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138988 <code>a(n) =</code> Frobenius number for 8 successive numbers = F(n+1,n+2,n+3,n+4,n+5,n+6,n+7,n+8).
 * @author Sean A. Irvine
 */
public class A138988 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138988() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, -2, 2, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 3, 4, 5, 6, 7, 17, 19, 21, 23, 25, 27, 29, 47});
  }
}
