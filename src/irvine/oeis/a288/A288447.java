package irvine.oeis.a288;
// Generated by gen_seq4.pl prisubf at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.AddConstantSequence;
import irvine.oeis.HolonomicRecurrence;
import irvine.oeis.PrimePositionSubsequence;


/**
 * A288447 Numbers k such that k!6 + 27 is prime, where k!6 is the sextuple factorial number (A085158 ).
 * @author Georg Fischer
 */
public class A288447 extends PrimePositionSubsequence {

  /** Construct the sequence */
  public A288447() {
    super(new AddConstantSequence(27, new HolonomicRecurrence(0, "[[0],[0, 1],[0],[0],[0],[0],[0],[-1]]", "1, 1, 2, 3, 4, 5", 0)), 0);
  }
}