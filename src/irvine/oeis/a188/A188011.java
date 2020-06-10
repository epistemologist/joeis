package irvine.oeis.a188;
// Generated by gen_seq4.pl floor3 2020-06-09 22:00
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A188011 <code>a(n) = floor(n*r) - floor(n*r-k*r) - floor(k*r)</code>, where <code>r=(1+sqrt(5))/2, k=3</code>.
 * @author Georg Fischer
 */
public class A188011 implements Sequence {
  private long mN = 0;
  private static final CR R = CR.ONE.add((CR.FIVE).sqrt()).divide(CR.TWO);
  private static final CR K = CR.THREE;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.multiply(R).floor().subtract(n.multiply(R).subtract(K.multiply(R)).floor()).subtract(K.multiply(R).floor());
  }
}
