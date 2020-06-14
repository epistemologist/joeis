package irvine.oeis.a072;
// Generated by gen_seq4.pl nthprimf 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A072579 In binary representation: n has the same number of 1's as the n-th prime has 0's.
 * @author Georg Fischer
 */
public class A072579 extends A000040 {
  protected long mK = 1 - 1;
  protected Z mNP = null;

  protected boolean isOk() {
    return ZUtils.digitCounts(Z.valueOf(mK), 2)[1] == ZUtils.digitCounts(mNP, 2)[0];
  }

  @Override
  public Z next() {
    ++mK;
    mNP = super.next();
    while (!isOk()) {
      ++mK;
      mNP = super.next();
    }
    return Z.valueOf(mK);
  }
}
