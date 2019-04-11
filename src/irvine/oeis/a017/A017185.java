package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017185 <code>9*n+2</code>.
 * @author Sean A. Irvine
 */
public class A017185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017185() {
    super(new long[] {-1, 2}, new long[] {2, 11});
  }
}
