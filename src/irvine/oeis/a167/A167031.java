package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167031 <code>a(n) = 20*a(n-1) - 64*a(n-2) + 1</code> for <code>n &gt; 1</code>; <code>a(0) = 1, a(1) = 20</code>.
 * @author Sean A. Irvine
 */
public class A167031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167031() {
    super(new long[] {64, -84, 21}, new long[] {1, 20, 337});
  }
}
