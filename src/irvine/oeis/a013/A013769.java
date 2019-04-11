package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013769 <code>a(n) = 21^(3*n + 2)</code>.
 * @author Sean A. Irvine
 */
public class A013769 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(441) : mA.multiply(9261);
    return mA;
  }
}
