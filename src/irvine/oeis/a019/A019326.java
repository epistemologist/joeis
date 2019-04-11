package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A019326 Cyclotomic polynomials at <code>x=8</code>.
 * @author Sean A. Irvine
 */
public class A019326 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.EIGHT : Cyclotomic.cyclotomic(mN, 8);
  }
}

