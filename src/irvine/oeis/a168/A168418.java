package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168418 <code>a(n) = 9*n - a(n-1) - 8</code> with <code>n&gt;1, a(1)=5</code>.
 * @author Sean A. Irvine
 */
public class A168418 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168418() {
    super(new long[] {-1, 1, 1}, new long[] {5, 5, 14});
  }
}
