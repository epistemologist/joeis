package irvine.oeis.a103;
// Generated by gen_seq4.pl moderiv at 2020-07-25 14:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a001.A001043;


/**
 * A103271 <code>a(n) = (prime(n)+prime(n+1)) mod 4</code>.
 * @author Georg Fischer
 */
public class A103271 extends A001043 {

  /** Construct the sequence. */
  public A103271() {
    super();
  }

  @Override
  public Z next() {
    return super.next().mod(Z.valueOf(4));
  }
}
