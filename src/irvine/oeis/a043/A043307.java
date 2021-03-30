package irvine.oeis.a043;
// Generated by gen_seq4.pl a0330 at 2021-03-04 18:37
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a033.A033001;


/**
 * A043307 a(n) = A033001(n)/4.
 * @author Georg Fischer
 */
public class A043307 extends A033001 {

  @Override
  public Z next() {
    return super.next().divide(4);
  }
}