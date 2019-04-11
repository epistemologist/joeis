package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163206 <code>a(n) = 20*a(n-1) - 92*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 1, a(1) = 10</code>.
 * @author Sean A. Irvine
 */
public class A163206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163206() {
    super(new long[] {-92, 20}, new long[] {1, 10});
  }
}
