package irvine.oeis.a052;
// Generated by gen_seq4.pl seqop a003 A003266 add(1) 0 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a003.A003266;

/**
 * A052449 <code>a(n) = 1 + Product_{k=1..n} Fibonacci(k)</code>.
 * @author Georg Fischer
 */
public class A052449 extends A003266 {
  private int mN = 0;
  
  /** Construct the sequence. */
  public A052449() {
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
