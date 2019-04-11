package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048876 <code>a(n) = 4*a(n-1) + a(n-2)</code>; <code>a(0)=1, a(1)=7</code>.
 * @author Sean A. Irvine
 */
public class A048876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048876() {
    super(new long[] {1, 4}, new long[] {1, 7});
  }
}
