package irvine.oeis.a157;
// Generated by gen_seq4.pl eulerp at 2021-02-05 23:01
// DO NOT EDIT here!

import irvine.math.polynomial.EulerPolynomials;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;


/**
 * A157087 Numerator of Euler(n, 9/26).
 * @author Georg Fischer
 */
public class A157087 implements Sequence {

  private int mN = -1;
  private final Q mFract = new Q(9, 26);

  @Override
  public Z next() {
    ++mN;
    return EulerPolynomials.eval(mN, mFract).num();
  }
}