package irvine.oeis.a110;
// Generated by gen_seq4.pl seqop a007 A007778 add(1) 0 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a007.A007778;

/**
 * A110567 <code>a(n) = n^(n+1) + 1</code>.
 * @author Georg Fischer
 */
public class A110567 extends A007778 {
  private int mN = -1;
  
  /** Construct the sequence. */
  public A110567() {
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
    return super.next().add(1);
  }
}
