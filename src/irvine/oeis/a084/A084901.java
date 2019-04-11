package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084901 <code>4^(n-2)n(5n+3)/2</code>.
 * @author Sean A. Irvine
 */
public class A084901 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084901() {
    super(new long[] {64, -48, 12}, new long[] {0, 1, 13});
  }
}
