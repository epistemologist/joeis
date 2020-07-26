package irvine.oeis.a128;
// Generated by gen_seq4.pl moderiv at 2020-07-25 14:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a039.A039598;


/**
 * A128937 Triangle formed by reading <code>A039598 mod 2</code>.
 * @author Georg Fischer
 */
public class A128937 extends A039598 {

  /** Construct the sequence. */
  public A128937() {
    super();
  }

  @Override
  public Z next() {
    return super.next().mod(Z.valueOf(2));
  }
}
