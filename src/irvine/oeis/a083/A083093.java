package irvine.oeis.a083;
// Generated by gen_seq4.pl moderiv at 2020-07-25 14:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a007.A007318;


/**
 * A083093 Triangle formed by reading Pascal's triangle <code>(A007318) mod 3</code>.
 * @author Georg Fischer
 */
public class A083093 extends A007318 {

  /** Construct the sequence. */
  public A083093() {
    super();
  }

  @Override
  public Z next() {
    return super.next().mod(Z.valueOf(3));
  }
}
