package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A019320 Cyclotomic polynomials at <code>x=2</code>.
 * @author Sean A. Irvine
 */
public class A019320 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.TWO : Cyclotomic.cyclotomic(mN, 2);
  }
}

