package irvine.oeis.a261;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.PrimePositionSubsequence;


/**
 * A261539 Numbers m such that (4^m + 5) / 3  is prime.
 * @author Georg Fischer
 */
public class A261539 extends PrimePositionSubsequence {

  private static final Z DIV = Z.valueOf(3);
  
  /** Construct the sequence */
  public A261539() {
    super("[[-15],[4],[-1]]", "[6, 9]", 0);
  }

  @Override
  public boolean isOk(final Z term) {
    final Z[] quotRem = term.divideAndRemainder(DIV);
    return quotRem[1].equals(Z.ZERO) && quotRem[0].isProbablePrime();
  }

}