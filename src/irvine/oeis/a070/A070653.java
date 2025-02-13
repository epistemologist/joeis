package irvine.oeis.a070;
// Generated by gen_seq4.pl modpow 6 30 at 2020-01-19 20:24
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070653 Duplicate of A070452.
 * @author Georg Fischer
 */
public class A070653 extends Sequence0 {

  private int mN = 0;
  private final Z mExp = Z.SIX;
  private final Z mMod = Z.valueOf(30);

  @Override
  public Z next() {
    return Z.valueOf(mN++).modPow(mExp, mMod);
  }
}
