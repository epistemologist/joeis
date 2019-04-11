package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084241 <code>a(n) = -5*a(n-1)-4*a(n-2)</code> with <code>n&gt;1, a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A084241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084241() {
    super(new long[] {-4, -5}, new long[] {0, 1});
  }
}
