package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164542 <code>a(n) = 8*a(n-1) - 8*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 1, a(1) = 16</code>.
 * @author Sean A. Irvine
 */
public class A164542 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164542() {
    super(new long[] {-8, 8}, new long[] {1, 16});
  }
}
