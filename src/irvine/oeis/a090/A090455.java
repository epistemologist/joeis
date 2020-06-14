package irvine.oeis.a090;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A090455 Difference between numbers of binary 1's of n and binary 1's of n-th prime.
 * @author Georg Fischer
 */
public class A090455 extends A000040 {
  protected long mN = 1 - 1;
  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return Z.valueOf(Z.valueOf(mN).bitCount() - nextPrime.bitCount());
  }
}
