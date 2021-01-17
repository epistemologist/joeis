package irvine.oeis.a056;
// Generated by gen_seq4.pl prisub at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.PrimePositionSubsequence;


/**
 * A056723 Numbers n such that 8*10^n + 3*R_n is prime, where R_n = 11...1 is the repunit (A002275) of length n.
 * @author Georg Fischer
 */
public class A056723 extends PrimePositionSubsequence {

  /** Construct the sequence */
  public A056723() {
    super("[[3],[10],[-1]]", "[8, 83]", 0);
  }
}