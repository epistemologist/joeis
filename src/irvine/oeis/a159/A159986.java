package irvine.oeis.a159;
// Generated by gen_seq4.pl seqop a000 A000108 mod(Z.SEVEN) 0 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A159986 Catalan numbers read modulo 7.
 * @author Georg Fischer
 */
public class A159986 extends A000108 {
  private int mN = -1;
  
  /** Construct the sequence. */
  public A159986() {
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
    return super.next().mod(Z.SEVEN);
  }
}
