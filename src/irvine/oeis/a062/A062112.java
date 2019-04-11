package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062112 <code>a(0)=0</code>; <code>a(1)=1</code>; <code>a(n) = a(n-1) + (3 + (-1)^n)*a(n-2)/2</code>.
 * @author Sean A. Irvine
 */
public class A062112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062112() {
    super(new long[] {-2, 0, 4, 0}, new long[] {0, 1, 1, 2});
  }
}
