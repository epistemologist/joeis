package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091685 Sieve out <code>6n+1</code> and <code>6n-1</code>.
 * @author Sean A. Irvine
 */
public class A091685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091685() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0}, new long[] {0, 1, 0, 0, 0, 5, 0, 7, 0, 0, 0, 11});
  }
}
