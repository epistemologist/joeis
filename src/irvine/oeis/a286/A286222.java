package irvine.oeis.a286;
// Generated by gen_seq4.pl genet at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.GeneralizedEulerTransform;
import irvine.oeis.a026.A026424;


/**
 * A286222 Number of partitions of n into distinct parts with an odd number of prime divisors (counted with multiplicity).
 * G.f.: <code>Product_{k&gt;=1} ((1+x^A026424(k)))</code>
 * @author Georg Fischer
 */
public class A286222 extends GeneralizedEulerTransform {

  /**
   * Construct the sequence.
   */
  public A286222() {
    super(0, 1);
    mSeqH = new A026424();
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
    return mSeqH.next();
  }

}