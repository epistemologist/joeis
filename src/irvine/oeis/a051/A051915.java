package irvine.oeis.a051;
// Generated by gen_seq4.pl prisubf at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.AddConstantSequence;
import irvine.oeis.HolonomicRecurrence;
import irvine.oeis.PrimePositionSubsequence;


/**
 * A051915 Numbers k such that 2*k! + 1 is prime.
 * @author Georg Fischer
 */
public class A051915 extends PrimePositionSubsequence {

  /** Construct the sequence */
  public A051915() {
    super(new AddConstantSequence(1, new HolonomicRecurrence(0, "[[0],[0, 1],[-1]]", "2", 0)), 0);
  }
}