package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016090 <code>a(n) = 16^(5^n) mod 10^n</code>: Automorphic numbers ending in digit <code>6,</code> with repetitions.
 * @author Sean A. Irvine
 */
public class A016090 implements Sequence {

  private Z mT = Z.ONE;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(10);
    mF = mF.multiply(5);
    return Z.SIX.modPow(mF, mT);
  }
}
