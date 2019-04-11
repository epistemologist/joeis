package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005113 Smallest prime in class n (sometimes written <code>n+)</code> according to the Erd&#337;s-Selfridge classification of primes.
 * @author Sean A. Irvine
 */
public class A005113 extends A005106 {

  private Z mPrev = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    mPrev = mPrev.multiply2().subtract(2);
    while (true) {
      mPrev = mFast.nextPrime(mPrev);
      if (primeClass(mPrev) == mN) {
        return mPrev;
      }
    }
  }
}
