package irvine.oeis.a292;
// Generated by gen_seq4.pl genetg at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.GeneralizedEulerTransform;


/**
 * A292311 Expansion of Product_{k&gt;=1} 1/(1 + k^k*x^k).
 * G.f.: <code>Product_{k&gt;=1} (1/(1+k^k*x^k))</code>
 * @author Georg Fischer
 */
public class A292311 extends GeneralizedEulerTransform {

  /**
   * Construct the sequence.
   */
  public A292311() {
    super(0, 1);
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.valueOf(k).pow(k).negate();
  }

}