package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291337 p-INVERT of <code>(1,1,1,1,1,</code>...), where p(S) <code>= 1 - 2</code> S <code>- 2</code> S^3.
 * @author Sean A. Irvine
 */
public class A291337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291337() {
    super(new long[] {5, -7, 5}, new long[] {1, 3, 10});
  }
}
