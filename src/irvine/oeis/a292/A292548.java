package irvine.oeis.a292;
// Generated by gen_seq4.pl genetf at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.GeneralizedEulerTransform;
import irvine.oeis.a027.A027306;


/**
 * A292548 Number of multisets of nonempty binary words with a total of n letters such that no word has a majority of 0's.
 * G.f.: <code>Product_{k&gt;=1} (1/(1-x^k)^A027306(k))</code>
 * @author Georg Fischer
 */
public class A292548 extends GeneralizedEulerTransform {

  /**
   * Construct the sequence.
   */
  public A292548() {
    super(0, 1);
    mSeqF = new A027306();
    mSeqF.next();
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{mSeqF.next()};
  }

}