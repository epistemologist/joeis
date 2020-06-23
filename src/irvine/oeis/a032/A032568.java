package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032568 Quotient of <code>'base-18'</code> division described in <code>A032567</code>.
 * @author Sean A. Irvine
 */
public class A032568 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z[] qr = new Z(Long.toString(++mN), 18).divideAndRemainder(Z.valueOf(mN));
      if (Z.ZERO.equals(qr[1])) {
        return qr[0];
      }
    }
  }
}
