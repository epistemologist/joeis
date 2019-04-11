package irvine.oeis.a283;

import irvine.oeis.LinearRecurrence;

/**
 * A283393 <code>a(n) =</code> gcd(n^2-1, <code>n^2+9)</code>.
 * @author Sean A. Irvine
 */
public class A283393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A283393() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 10, 1, 2, 5, 2, 5, 2, 1, 10});
  }
}
