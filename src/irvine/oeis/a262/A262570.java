package irvine.oeis.a262;
// Generated by gen_seq4.pl seqop a002 A002704 divide(2) 0 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a002.A002704;

/**
 * A262570 <code>a(n) = A002704(n)/2</code>.
 * @author Georg Fischer
 */
public class A262570 extends A002704 {
  private int mN = -1;
  
  /** Construct the sequence. */
  public A262570() {
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
    return super.next().divide(2);
  }
}
