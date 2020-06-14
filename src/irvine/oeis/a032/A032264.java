package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032264 Number of ways to partition n labeled elements into pie slices of odd sizes allowing the pie to be turned over.
 * @author Sean A. Irvine
 */
public class A032264 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    final Polynomial<Q> g = RING.sinh(RING.x(), mN);
    return RING.divide(RING.subtract(RING.add(g, RING.divide(RING.pow(g, 2, mN), Q.TWO)), RING.log1p(RING.negate(g), mN)), Q.TWO).coeff(mN).multiply(mF).toZ();
  }
}
