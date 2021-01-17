package irvine.oeis.a197;
// Generated by gen_seq4.pl prisubd at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.PrimePositionSubsequence;


/**
 * A197038 Numbers n such that (2^n + 3^n)/97 is prime.
 * @author Georg Fischer
 */
public class A197038 extends PrimePositionSubsequence {

  private static final Z DIV = Z.valueOf(97);
  
  /** Construct the sequence */
  public A197038() {
    super("[[0],[-6],[5],[-1]]", "[2, 5]", 0);
  }

  @Override
  public boolean isOk(final Z term) {
    final Z[] quotRem = term.divideAndRemainder(DIV);
    return quotRem[1].equals(Z.ZERO) && quotRem[0].isProbablePrime();
  }

}