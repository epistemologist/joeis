package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109543 <code>a(n) = a(n-1) + a(n-3) + a(n-5)</code>.
 * @author Sean A. Irvine
 */
public class A109543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109543() {
    super(new long[] {1, 0, 1, 0, 1}, new long[] {1, 1, 1, 1, 1});
  }
}
