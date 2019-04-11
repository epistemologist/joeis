package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120612 For <code>n&gt;1, a(n) = 2*a(n-1) + 15*a(n-2)</code>; <code>a(0)=1, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A120612 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120612() {
    super(new long[] {15, 2}, new long[] {1, 1});
  }
}
