package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291403 p-INVERT of <code>(1,1,0,0,0,0,</code>...), where p(S) <code>= 1 - 2</code> S^2 - S^4.
 * @author Sean A. Irvine
 */
public class A291403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291403() {
    super(new long[] {1, 4, 6, 4, 3, 4, 2, 0}, new long[] {0, 2, 4, 7, 20, 42, 92, 214});
  }
}
