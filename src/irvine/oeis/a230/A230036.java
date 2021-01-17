package irvine.oeis.a230;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.PrimePositionSubsequence;


/**
 * A230036 Numbers n such that (39^n + 1)/40 is prime.
 * @author Georg Fischer
 */
public class A230036 extends PrimePositionSubsequence {

  private static final Z DIV = Z.valueOf(40);
  
  /** Construct the sequence */
  public A230036() {
    super("[[-38],[39],[-1]]", "[2, 40]", 0);
  }

  @Override
  public boolean isOk(final Z term) {
    final Z[] quotRem = term.divideAndRemainder(DIV);
    return quotRem[1].equals(Z.ZERO) && quotRem[0].isProbablePrime();
  }

}