package irvine.oeis.a191;
// Generated by gen_seq4.pl prikron at 2020-09-03 08:47
// DO NOT EDIT here!

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Subsequence;
import irvine.oeis.a000.A000040;

/**
 * A191017 Primes with Kronecker symbol (p|14) = 1.
 * @author Georg Fischer
 */
public class A191017 extends Subsequence {

  /** Construct the sequence. */
  public A191017() {
    super(new A000040());
  }
  
  @Override
  public boolean isOk(Z term) {
    return LongUtils.kronecker(term.longValueExact(), 14) == 1;
  }
}
