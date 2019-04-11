package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041778 Numerators of continued fraction convergents to <code>sqrt(410)</code>.
 * @author Sean A. Irvine
 */
public class A041778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041778() {
    super(new long[] {-1, 0, 162, 0}, new long[] {20, 81, 3260, 13121});
  }
}
