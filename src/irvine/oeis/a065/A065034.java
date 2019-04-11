package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065034 <code>a(n) =</code> Lucas(2*n) <code>+ 1</code>.
 * @author Sean A. Irvine
 */
public class A065034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065034() {
    super(new long[] {1, -4, 4}, new long[] {3, 4, 8});
  }
}
