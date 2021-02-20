package irvine.oeis.a158;
// Generated by gen_seq4.pl bernoulli at 2021-02-04 17:54
// DO NOT EDIT here!

import irvine.math.polynomial.BernoulliPolynomials;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;


/**
 * A158512 Numerator of Bernoulli(n, -2/7).
 * @author Georg Fischer
 */
public class A158512 implements Sequence {

  private int mN = -1;
  private final Q mFract = new Q(-2, 7);

  @Override
  public Z next() {
    ++mN;
    return BernoulliPolynomials.firstKindEval(mN, mFract).num();
  }
}