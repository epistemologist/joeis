package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168195 <code>a(n) = 2*n - a(n-1) + 1</code> with <code>n&gt;1, a(1)=5</code>.
 * @author Sean A. Irvine
 */
public class A168195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168195() {
    super(new long[] {-1, 1, 1}, new long[] {5, 0, 7});
  }
}
