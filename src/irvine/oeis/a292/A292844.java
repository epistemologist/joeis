package irvine.oeis.a292;
// Generated by gen_seq4.pl genetfg at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.GeneralizedEulerTransform;


/**
 * A292844 Number of sets of nonempty words with a total of n letters over 10-ary alphabet.
 * G.f.: <code>Product_{k&gt;=1} ((1+x^k)^(10^k))</code>
 * @author Georg Fischer
 */
public class A292844 extends GeneralizedEulerTransform {

  /**
   * Construct the sequence.
   */
  public A292844() {
    super(0, 1);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{Z.TEN.pow(k).negate()};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.NEG_ONE;
  }

}