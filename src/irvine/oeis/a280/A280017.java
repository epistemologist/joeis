package irvine.oeis.a280;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.PrimePositionSubsequence;


/**
 * A280017 Numbers k such that (10^k - 13)/3 is prime.
 * @author Georg Fischer
 */
public class A280017 extends PrimePositionSubsequence {

  private static final Z DIV = Z.valueOf(3);
  
  /** Construct the sequence */
  public A280017() {
    super("[[117],[10],[-1]]", "[-12,-3]", 0);
  }

  @Override
  public boolean isOk(final Z term) {
    final Z[] quotRem = term.divideAndRemainder(DIV);
    return quotRem[1].equals(Z.ZERO) && quotRem[0].isProbablePrime();
  }

}