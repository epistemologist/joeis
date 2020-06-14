package irvine.oeis.a076;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a006.A006450;

/**
 * A076240 Remainder when 2nd order prime pp(n) = A006450(n) is divided by n-th prime = A000040(n).
 * @author Georg Fischer
 */
public class A076240 extends A000040 {
  protected long mN = 1 - 1;
  protected final Sequence mPPs = new A006450();

  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return mPPs.next().remainder(nextPrime);
  }
}
