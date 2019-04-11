package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049652 <code>a(n) =</code> (F(3*n+2) <code>- 1)/4,</code> where F=A000045 (the Fibonacci sequence).
 * @author Sean A. Irvine
 */
public class A049652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049652() {
    super(new long[] {-1, -3, 5}, new long[] {0, 1, 5});
  }
}
