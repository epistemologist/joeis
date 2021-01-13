package irvine.oeis.a069;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.a001.A001221;


/**
 * A069903 Number of distinct prime factors of n-th triangular number.
 * Formula: <code>a(n) = A001221(A000217(n)).</code>
 * @author Georg Fischer
 */
public class A069903 extends NestedSequence {

  /** Construct the sequence. */
  public A069903() {
    super(1, new A001221(), new A000217(), 1, 0); 
  }

}