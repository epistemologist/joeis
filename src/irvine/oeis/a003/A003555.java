package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003555 Sum{1,2,...,(10^n <code>- 1)/9},</code> or <code>(10^n -1)/9)((10^n -1)/9 +1)/2</code> (n-th term is the middle <code>2(n-1)</code> digits of the (n+9)-th term for <code>n &gt; 1)</code>.
 * @author Sean A. Irvine
 */
public class A003555 implements Sequence {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(10);
    final Z t = mA.subtract(1).divide(9);
    return t.multiply(t.add(1)).divide2();
  }
}
