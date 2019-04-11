package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001585 <code>a(n) = 3^n + n^3</code>.
 * @author Sean A. Irvine
 */
public class A001585 implements Sequence {

  private long mN = -1;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mT = mT.multiply(3);
    }
    return mT.add(Z.valueOf(mN * mN).multiply(mN));
  }
}
