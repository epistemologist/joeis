package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017017 <code>a(n) = 7n+3</code>.
 * @author Sean A. Irvine
 */
public class A017017 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017017() {
    super(new long[] {-1, 2}, new long[] {3, 10});
  }
}
