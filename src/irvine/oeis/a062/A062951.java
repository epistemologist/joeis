package irvine.oeis.a062;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A062951 H(A005117(n)) where H(n) is the half-totient function and A005117(n) are the squarefree numbers.
 * @author Sean A. Irvine
 */
public class A062951 extends A005117 {

  {
    super.next();
    super.next();
    setOffset(3);
  }

  @Override
  public Z next() {
    return Euler.phi(super.next()).divide2();
  }
}

