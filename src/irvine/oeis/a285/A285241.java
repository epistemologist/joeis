package irvine.oeis.a285;
// Generated by gen_seq4.pl genetfg at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.GeneralizedEulerTransform;


/**
 * A285241 Expansion of Product_{k&gt;=1} 1/(1 - k*x^k)^(k^2).
 * G.f.: <code>Product_{k&gt;=1} (1/(1-k*x^k)^(k*k))</code>
 * @author Georg Fischer
 */
public class A285241 extends GeneralizedEulerTransform {

  /**
   * Construct the sequence.
   */
  public A285241() {
    super(0, 1);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{Z.valueOf(k * k)};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.valueOf(k);
  }

}