package irvine.oeis.a187;
// Generated by gen_seq4.pl floor3 2020-06-09 22:00
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A187976 <code>a(n) = [nr+kr]-[nr]-[kr]</code>, where <code>r=sqrt(2), k=6, [ ]=floor</code>.
 * @author Georg Fischer
 */
public class A187976 implements Sequence {
  private long mN = 0;
  private static final CR R = CR.SQRT2;
  private static final CR K = CR.valueOf(6);

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.multiply(R).add(K.multiply(R)).floor().subtract(n.multiply(R).floor()).subtract(K.multiply(R).floor());
  }
}
