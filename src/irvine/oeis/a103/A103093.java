package irvine.oeis.a103;
// Generated by gen_seq4.pl prisub at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.PrimePositionSubsequence;


/**
 * A103093 Numbers n such that 9*10^n + 2*R_n - 1 is prime, where R_n = 11...1 is the repunit (A002275) of length n.
 * @author Georg Fischer
 */
public class A103093 extends PrimePositionSubsequence {

  /** Construct the sequence */
  public A103093() {
    super("[[11],[10],[-1]]", "[8, 91]", 0);
  }
}