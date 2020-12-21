package irvine.oeis.a318;
// Generated by gen_seq4.pl genetfg at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.GeneralizedEulerTransform;
import irvine.oeis.a000.A000108;


/**
 * A318264 Expansion of Product_{k&gt;=1} (1 + C(k)*x^k), where C(k) is the Catalan number A000108.
 * G.f.: <code>Product_{k&gt;=1} ((1+A000108(k)*x^k))</code>
 * @author Georg Fischer
 */
public class A318264 extends GeneralizedEulerTransform {

  /**
   * Construct the sequence.
   */
  public A318264() {
    super(0, 1);
    mSeqG = new A000108();
    mSeqG.next();
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