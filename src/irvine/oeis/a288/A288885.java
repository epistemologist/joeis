package irvine.oeis.a288;
// Generated by gen_seq4.pl primoff at 2021-01-16 00:20
// DO NOT EDIT here!

import irvine.oeis.AddConstantSequence;
import irvine.oeis.HolonomicRecurrence;
import irvine.oeis.PrimeSubsequence;


/**
 * A288885 Primes of the form k!3 + 3^9, where k!3 is the triple factorial number (A007661).
 * @author Georg Fischer
 */
public class A288885 extends PrimeSubsequence {

  /** Construct the sequence */
  public A288885() {
    super(new AddConstantSequence(19683, new HolonomicRecurrence(0, "[[0],[0, 1],[0],[0],[-1]]", "1, 1, 2", 0)), 0);
  }
}