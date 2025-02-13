package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017089 a(n) = 8*n+2.
 * @author Sean A. Irvine
 */
public class A017089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017089() {
    super(new long[] {-1, 2}, new long[] {2, 10});
  }
}
