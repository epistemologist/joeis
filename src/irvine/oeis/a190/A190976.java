package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190976 <code>a(n) = 8*a(n-1) - 3*a(n-2),</code> with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A190976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190976() {
    super(new long[] {-3, 8}, new long[] {0, 1});
  }
}
