package irvine.oeis.a279;
// Generated by gen_seq4.pl genet at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.GeneralizedEulerTransform;


/**
 * A279329 Number of partitions of n into distinct cubes.
 * G.f.: <code>Product_{k&gt;=1} ((1+x^(k^3)))</code>
 * @author Georg Fischer
 */
public class A279329 extends GeneralizedEulerTransform {

  /**
   * Construct the sequence.
   */
  public A279329() {
    super(0, 1);
    mNextH = advanceH(mKh);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{Z.NEG_ONE};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.NEG_ONE;
  }

  @Override
  protected Z advanceH(final long k) {
    return Z.valueOf(k).pow(3);
  }

}