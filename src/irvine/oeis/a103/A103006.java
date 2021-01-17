package irvine.oeis.a103;
// Generated by gen_seq4.pl prisub at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.PrimePositionSubsequence;


/**
 * A103006 Numbers n such that 5*10^n + R_n + 6 is prime, where R_n = 11...1 is the repunit (A002275) of length n.
 * @author Georg Fischer
 */
public class A103006 extends PrimePositionSubsequence {

  /** Construct the sequence */
  public A103006() {
    super("[[-53],[10],[-1]]", "[11, 57]", 0);
  }
}