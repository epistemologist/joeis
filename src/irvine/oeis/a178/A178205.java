package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178205 <code>a(n) = a(n-1) + 10*a(n-3)</code> for <code>n &gt; 2</code>; <code>a(0) = a(1) = a(2) = 1</code>.
 * @author Sean A. Irvine
 */
public class A178205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178205() {
    super(new long[] {10, 0, 1}, new long[] {1, 1, 1});
  }
}
