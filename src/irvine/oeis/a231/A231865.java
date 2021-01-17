package irvine.oeis.a231;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.PrimePositionSubsequence;


/**
 * A231865 Numbers n such that (43^n + 1)/44 is prime.
 * @author Georg Fischer
 */
public class A231865 extends PrimePositionSubsequence {

  private static final Z DIV = Z.valueOf(44);
  
  /** Construct the sequence */
  public A231865() {
    super("[[-42],[43],[-1]]", "[2, 44]", 0);
  }

  @Override
  public boolean isOk(final Z term) {
    final Z[] quotRem = term.divideAndRemainder(DIV);
    return quotRem[1].equals(Z.ZERO) && quotRem[0].isProbablePrime();
  }

}