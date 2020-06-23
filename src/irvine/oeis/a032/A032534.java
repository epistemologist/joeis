package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032534 Quotient of <code>'base-2'</code> division described in <code>A032533</code>.
 * @author Sean A. Irvine
 */
public class A032534 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z[] qr = new Z(Long.toString(++mN, 2)).divideAndRemainder(Z.valueOf(mN));
      if (Z.ZERO.equals(qr[1])) {
        return qr[0];
      }
    }
  }
}
