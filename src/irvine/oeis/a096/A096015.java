package irvine.oeis.a096;
// Generated by gen_seq4.pl dersimple at 2022-12-15 23:30

import irvine.math.z.Z;

/**
 * A096015 A096014(n) / 2.
 * @author Georg Fischer
 */
public class A096015 extends A096014 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
