package irvine.oeis.a033;
// Generated by gen_seq4.pl floor3 2020-06-09 22:00
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033411 <code>[ 91/n ]</code>.
 * @author Georg Fischer
 */
public class A033411 implements Sequence {
  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return CR.valueOf(91).divide(n).floor();
  }
}
