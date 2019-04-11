package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204766 <code>a(n) = 167*(n-1)-a(n-1)</code> with <code>n&gt;1, a(1)=13</code>.
 * @author Sean A. Irvine
 */
public class A204766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204766() {
    super(new long[] {-1, 1, 1}, new long[] {13, 154, 180});
  }
}
