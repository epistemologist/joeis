package irvine.oeis.a013;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013613 Triangle of coefficients in expansion of <code>(1+6x)^n</code>.
 * @author Sean A. Irvine
 */
public class A013613 implements Sequence {

  private int mN = -1;
  private int mM = 0;
  private Z mT = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mT = Z.ONE;
    } else {
      mT = mT.multiply(6);
    }
    return Binomial.binomial(mN, mM).multiply(mT);
  }
}
