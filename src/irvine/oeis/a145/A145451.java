package irvine.oeis.a145;
// Generated by gen_seq4.pl seqop a006 A006266 divide(2) 1 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a006.A006266;

/**
 * A145451 <code>a(n) = (1/2) * ((1 + sqrt(2))^(3^n) + (1 - sqrt(2))^(3^n))</code>.
 * @author Georg Fischer
 */
public class A145451 extends A006266 {
  private int mN = -1;
  
  /** Construct the sequence. */
  public A145451() {
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
    return super.next().divide(2);
  }
}
