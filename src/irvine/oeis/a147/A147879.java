package irvine.oeis.a147;
// Generated by gen_seq4.pl genetfg at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.GeneralizedEulerTransform;
import irvine.oeis.a005.A005185;


/**
 * A147879 Expansion of Product_{k&gt;=1} (1 + x^k*A005185(k)).
 * G.f.: <code>Product_{k&gt;=1} ((1+A005185(k)*x^k))</code>
 * @author Georg Fischer
 */
public class A147879 extends GeneralizedEulerTransform {

  /**
   * Construct the sequence.
   */
  public A147879() {
    super(0, 1);
    mSeqG = new A005185();
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{Z.NEG_ONE};
  }

  @Override
  protected Z advanceG(final long k) {
    return mSeqG.next().negate();
  }

}