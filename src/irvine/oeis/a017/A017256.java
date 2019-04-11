package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017256 <code>a(n) = (9*n + 7)^12</code>.
 * @author Sean A. Irvine
 */
public class A017256 implements Sequence {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(9);
    return mN.pow(12);
  }
}

