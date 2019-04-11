package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A002062 <code>a(n) =</code> n-th Fibonacci number <code>+ n</code>.
 * @author Sean A. Irvine
 */
public class A002062 extends A000045 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().add(++mN);
  }
}
