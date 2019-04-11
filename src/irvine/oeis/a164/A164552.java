package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164552 <code>a(n) = 12*a(n-1)-30*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 1, a(1) = 10</code>.
 * @author Sean A. Irvine
 */
public class A164552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164552() {
    super(new long[] {-30, 12}, new long[] {1, 10});
  }
}
