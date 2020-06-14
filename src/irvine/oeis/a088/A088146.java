package irvine.oeis.a088;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A088146 n-th prime rotated one binary place to the right.
 * @author Georg Fischer
 */
public class A088146 extends A000040 {
  protected long mN = 1 - 1;

  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    final String sNP = nextPrime.toString(2);

    return new Z(sNP.substring(sNP.length() - 1) + sNP.substring(0, sNP.length() - 1), 2);
  }
}
