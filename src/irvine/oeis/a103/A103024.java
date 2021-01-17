package irvine.oeis.a103;
// Generated by gen_seq4.pl prisub at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.PrimePositionSubsequence;


/**
 * A103024 Numbers n such that 5*10^n + 8*R_n + 1 is prime, where R_n = 11...1 is the repunit (A002275) of length n.
 * @author Georg Fischer
 */
public class A103024 extends PrimePositionSubsequence {

  /** Construct the sequence */
  public A103024() {
    super("[[-1],[10],[-1]]", "[6, 59]", 0);
  }
}