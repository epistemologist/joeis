package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011698 A binary <code>m-sequence</code>: expansion of reciprocal of <code>x^8+x^6+x^5+x^4+x^2+x+1</code>.
 * @author Sean A. Irvine
 */
public class A011698 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011698() {
    super(8, 0b10111011);
  }
}
