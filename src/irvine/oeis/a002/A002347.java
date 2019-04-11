package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.prime.Fast;

/**
 * A002347 Consider all primes of form p <code>= (x^2 +</code> 11y^2 <code>)/4</code>; sequence gives values of y.
 * @author Sean A. Irvine
 */
public class A002347 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z p = mP.shiftLeft(2);
      Z y = Z.ZERO;
      while (true) {
        y = y.add(1);
        final Z x2 = p.subtract(y.square().multiply(11));
        if (x2.signum() < 0) {
          break;
        }
        final Z[] s = x2.sqrtAndRemainder();
        if (Z.ZERO.equals(s[1])) {
          return y;
        }
      }
    }
  }
}
