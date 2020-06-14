package irvine.oeis.a071;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000203;

/**
 * A071170 n-th prime reduced modulo sigma[n].
 * @author Georg Fischer
 */
public class A071170 extends A000040 {
  protected long mN = 1 - 1;
protected final Sequence mSigma = new A000203();

  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    return nextPrime.mod(mSigma.next());
  }
}
