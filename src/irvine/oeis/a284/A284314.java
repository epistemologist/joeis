package irvine.oeis.a284;
// Generated by gen_seq4.pl genetfh at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.GeneralizedEulerTransform;


/**
 * A284314 Expansion of Product_{k&gt;=0} (1 - x^(5*k+1)) in powers of x.
 * G.f.: <code>Product_{k&gt;=0} ((1-x^(5*k+1)))</code>
 * @author Georg Fischer
 */
public class A284314 extends GeneralizedEulerTransform {

  /**
   * Construct the sequence.
   */
  public A284314() {
    super(0, 0);
    mNextH = advanceH(mKh);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{Z.NEG_ONE};
  }

  @Override
  protected Z advanceH(final long k) {
    return Z.valueOf(5 * k + 1);
  }

}