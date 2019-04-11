package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164540 <code>a(n) = 4*a(n-1) + 4*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 1, a(1) = 14</code>.
 * @author Sean A. Irvine
 */
public class A164540 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164540() {
    super(new long[] {4, 4}, new long[] {1, 14});
  }
}
