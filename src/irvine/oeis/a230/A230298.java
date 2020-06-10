package irvine.oeis.a230;
// Generated by gen_seq4.pl seqop a010 A010062 mod(Z.TWO) 0 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a010.A010062;

/**
 * A230298 <code>a(n) = A010062(n) mod 2</code>.
 * @author Georg Fischer
 */
public class A230298 extends A010062 {
  private int mN = -1;
  
  /** Construct the sequence. */
  public A230298() {
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
    return super.next().mod(Z.TWO);
  }
}
