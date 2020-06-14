package irvine.oeis.a138;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A138434 a(n) = ((n-th prime)^5-(n-th prime)^3)/4.
 * @author Georg Fischer
 */
public class A138434 extends A000040 {
  protected long mN = 1 - 1;
  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return nextPrime.pow(5).subtract(nextPrime.pow(3)).divide(Z.valueOf(4));
  }
}
