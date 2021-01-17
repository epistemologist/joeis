package irvine.oeis.a219;
// Generated by gen_seq4.pl prisub at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.PrimePositionSubsequence;


/**
 * A219618 Numbers n such that 3^n + 100 is prime.
 * @author Georg Fischer
 */
public class A219618 extends PrimePositionSubsequence {

  /** Construct the sequence */
  public A219618() {
    super("[[-200],[3],[-1]]", "[101]", 0);
    next();
  }
}