package irvine.oeis.a068;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A068395 a(n) = n-th prime minus its sum of digits.
 * @author Georg Fischer
 */
public class A068395 extends A000040 {
  protected long mN = 1 - 1;
  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return nextPrime.subtract(Z.valueOf(ZUtils.digitSum(nextPrime)));
  }
}
