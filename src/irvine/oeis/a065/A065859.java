package irvine.oeis.a065;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A065859 Remainder when the n-th prime is divided by the n-th composite number.
 * @author Georg Fischer
 */
public class A065859 extends A000040 {
  protected long mN = 1 - 1;
protected final Sequence mCompos = new A002808();

  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return nextPrime.remainder(mCompos.next());
  }
}
