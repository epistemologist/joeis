package irvine.oeis.a179;
// Generated by gen_seq4.pl geneth at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.GeneralizedEulerTransform;


/**
 * A179051 Number of partitions of n into powers of 10 (cf. A011557).
 * G.f.: <code>Product_{k&gt;=0} (1/(1-x^(10^k)))</code>
 * @author Georg Fischer
 */
public class A179051 extends GeneralizedEulerTransform {

  /**
   * Construct the sequence.
   */
  public A179051() {
    super(0, 0);
    mNextH = advanceH(mKh);
  }

  @Override
  protected Z advanceH(final long k) {
    return Z.TEN.pow(k);
  }

}