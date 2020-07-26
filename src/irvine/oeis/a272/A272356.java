package irvine.oeis.a272;
// Generated by gen_seq4.pl moderiv at 2020-07-25 14:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a007.A007504;


/**
 * A272356 <code>(Sum_{i=1..n} prime(i)) mod 4</code>.
 * @author Georg Fischer
 */
public class A272356 extends A007504 {

  /** Construct the sequence. */
  public A272356() {
    super();
  }

  @Override
  public Z next() {
    return super.next().mod(Z.valueOf(4));
  }
}
