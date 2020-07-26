package irvine.oeis.a080;
// Generated by gen_seq4.pl moderiv at 2020-07-25 14:53
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a001.A001223;


/**
 * A080378 Residues <code>mod 4</code> of the n-th difference between consecutive primes.
 * @author Georg Fischer
 */
public class A080378 extends A001223 {

  /** Construct the sequence. */
  public A080378() {
    super();
  }

  @Override
  public Z next() {
    return super.next().mod(Z.valueOf(4));
  }
}
