package irvine.oeis.a099;
// Generated by gen_seq4.pl seqop a000 A000960 mod(Z.THREE) 1 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000960;

/**
 * A099076 <code>a(n) = A000960(n) mod 3</code>.
 * @author Georg Fischer
 */
public class A099076 extends A000960 {
  private int mN = -1;
  
  /** Construct the sequence. */
  public A099076() {
    super();
    int bOffset = 0;
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
