package irvine.oeis.a102;
// Generated by gen_seq4.pl prisub at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.PrimePositionSubsequence;


/**
 * A102932 Numbers n such that 10^n + 3*R_n + 4 is prime, where R_n = 11...1 is the repunit (A002275) of length n.
 * @author Georg Fischer
 */
public class A102932 extends PrimePositionSubsequence {

  /** Construct the sequence */
  public A102932() {
    super("[[-33],[10],[-1]]", "[5, 17]", 0);
  }
}