package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013749 <code>a(n) = 11^(3*n + 2)</code>.
 * @author Sean A. Irvine
 */
public class A013749 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(121) : mA.multiply(1331);
    return mA;
  }
}
