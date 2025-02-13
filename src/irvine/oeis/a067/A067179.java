package irvine.oeis.a067;

import irvine.math.z.Z;

/**
 * A067179 Numbers whose squares give sum of digits which is the n-th term of A056991.
 * @author Sean A. Irvine
 */
public class A067179 extends A067178 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
