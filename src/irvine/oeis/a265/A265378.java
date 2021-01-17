package irvine.oeis.a265;
// Generated by gen_seq4.pl prisubf at 2021-01-15 23:59
// DO NOT EDIT here!

import irvine.oeis.AddConstantSequence;
import irvine.oeis.HolonomicRecurrence;
import irvine.oeis.PrimePositionSubsequence;


/**
 * A265378 Numbers n such that n!3 + 3^9 is prime, where n!3 = n!!! is a triple factorial number (A007661).
 * @author Georg Fischer
 */
public class A265378 extends PrimePositionSubsequence {

  /** Construct the sequence */
  public A265378() {
    super(new AddConstantSequence(19683, new HolonomicRecurrence(0, "[[0],[0, 1],[0],[0],[-1]]", "1, 1, 2", 0)), 0);
  }
}