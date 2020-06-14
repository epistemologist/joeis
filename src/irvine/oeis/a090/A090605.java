package irvine.oeis.a090;
// Generated by gen_seq4.pl nthprimf 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A090605 Numbers n such that n-th prime is of the form 60*k+1.
 * @author Georg Fischer
 */
public class A090605 extends A000040 {
  protected long mK = 1 - 1;
  protected Z mNP = null;
  protected boolean isOk() {
    return mNP.mod(Z.valueOf(60)).equals(Z.ONE);
  }
  
  @Override
  public Z next() {
    ++mK;
    mNP = super.next();
    while (! isOk()) {
      ++mK;
      mNP = super.next();
    }  
    return Z.valueOf(mK);
  }

}
