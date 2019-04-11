package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023467 <code>n-25</code>.
 * @author Sean A. Irvine
 */
public class A023467 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023467() {
    super(new long[] {-1, 2}, new long[] {-25, -24});
  }
}
