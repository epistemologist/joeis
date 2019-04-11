package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004985 <code>a(n) =</code> 2^n/n!*Product_{k=0..n-1} (4*k <code>+ 5)</code>.
 * @author Sean A. Irvine
 */
public class A004985 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(4 * mN + 1).multiply2().divide(mN);
    }
    return mA;
  }
}

