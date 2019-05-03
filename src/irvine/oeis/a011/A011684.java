package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011684 A binary <code>m-sequence</code>: expansion of reciprocal of <code>x^7+x^4+x^3+x^2+1</code>.
 * @author Sean A. Irvine
 */
public class A011684 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011684() {
    super(7, 0b1001110);
  }
}
