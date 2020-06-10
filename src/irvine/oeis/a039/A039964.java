package irvine.oeis.a039;
// Generated by gen_seq4.pl seqop a001 A001006 mod(Z.THREE) 0 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a001.A001006;

/**
 * A039964 Motzkin numbers <code>A001006</code> read <code>mod 3</code>.
 * @author Georg Fischer
 */
public class A039964 extends A001006 {
  private int mN = -1;
  
  /** Construct the sequence. */
  public A039964() {
    super();
    int bOffset = -1;
    while (bOffset < mN) {
      ++bOffset;
      super.next();
    }
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().mod(Z.THREE);
  }
}
