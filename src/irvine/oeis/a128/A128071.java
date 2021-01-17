package irvine.oeis.a128;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.PrimePositionSubsequence;


/**
 * A128071 Numbers k such that (3^k + 13^k)/16 is prime.
 * @author Georg Fischer
 */
public class A128071 extends PrimePositionSubsequence {

  private static final Z DIV = Z.valueOf(16);
  
  /** Construct the sequence */
  public A128071() {
    super("[[0],[-39],[16],[-1]]", "[2, 16]", 0);
  }

  @Override
  public boolean isOk(final Z term) {
    final Z[] quotRem = term.divideAndRemainder(DIV);
    return quotRem[1].equals(Z.ZERO) && quotRem[0].isProbablePrime();
  }

}