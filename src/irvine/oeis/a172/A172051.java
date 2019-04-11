package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172051 Decimal expansion of <code>1/999999</code>.
 * @author Sean A. Irvine
 */
public class A172051 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172051() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {0, 0, 0, 0, 0, 1});
  }
}
