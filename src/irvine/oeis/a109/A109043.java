package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109043 <code>a(n) =</code> lcm(n,2).
 * @author Sean A. Irvine
 */
public class A109043 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109043() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 2, 2, 6});
  }
}
