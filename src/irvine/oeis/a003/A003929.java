package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003929 Order of simple Chevalley group B_n <code>(7)</code>.
 * @author Sean A. Irvine
 */
public class A003929 extends A003928 {

  @Override
  protected Z q() {
    return Z.SEVEN;
  }
}
