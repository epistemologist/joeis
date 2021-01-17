package irvine.oeis.a128;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.PrimePositionSubsequence;


/**
 * A128338 Numbers k such that (8^k + 5^k)/13 is prime.
 * @author Georg Fischer
 */
public class A128338 extends PrimePositionSubsequence {

  private static final Z DIV = Z.valueOf(13);
  
  /** Construct the sequence */
  public A128338() {
    super("[[0],[-40],[13],[-1]]", "[2, 13]", 0);
  }

  @Override
  public boolean isOk(final Z term) {
    final Z[] quotRem = term.divideAndRemainder(DIV);
    return quotRem[1].equals(Z.ZERO) && quotRem[0].isProbablePrime();
  }

}