package irvine.oeis.a057;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.PrimePositionSubsequence;


/**
 * A057184 Numbers n such that (18^n + 1)/19 is a prime.
 * @author Georg Fischer
 */
public class A057184 extends PrimePositionSubsequence {

  private static final Z DIV = Z.valueOf(19);
  
  /** Construct the sequence */
  public A057184() {
    super("[[-17],[18],[-1]]", "[2, 19]", 0);
  }

  @Override
  public boolean isOk(final Z term) {
    final Z[] quotRem = term.divideAndRemainder(DIV);
    return quotRem[1].equals(Z.ZERO) && quotRem[0].isProbablePrime();
  }

}