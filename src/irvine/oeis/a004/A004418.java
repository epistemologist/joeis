package irvine.oeis.a004;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004418 Expansion of (Sum_{n=-inf..inf} <code>x^(n^2))^(-17)</code>.
 * @author Sean A. Irvine
 */
public class A004418 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(RING.one(), RING.pow(ThetaFunctions.theta3z(++mN), 17, mN), mN);
  }
}

