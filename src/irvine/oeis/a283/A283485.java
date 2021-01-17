package irvine.oeis.a283;
// Generated by gen_seq4.pl prisubf at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.AddConstantSequence;
import irvine.oeis.HolonomicRecurrence;
import irvine.oeis.PrimePositionSubsequence;


/**
 * A283485 Numbers k such that k![6]-2 is prime, where k![6] = A085158 (k) = sextuple factorial.
 * @author Georg Fischer
 */
public class A283485 extends PrimePositionSubsequence {

  /** Construct the sequence */
  public A283485() {
    super(new AddConstantSequence(-2, new HolonomicRecurrence(0, "[[0],[0, 1],[0],[0],[0],[0],[0],[-1]]", "1, 1, 2, 3, 4, 5", 0)), 0);
  }
}