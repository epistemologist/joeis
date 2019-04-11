package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214828 <code>a(n) = a(n-1) + a(n-2) + a(n-3),</code> with <code>a(0) = 1, a(1) = a(2) = 6</code>.
 * @author Sean A. Irvine
 */
public class A214828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214828() {
    super(new long[] {1, 1, 1}, new long[] {1, 6, 6});
  }
}
