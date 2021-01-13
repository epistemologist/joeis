package irvine.oeis.a074;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a000.A000217;


/**
 * A074285 Sum of the divisors of n-th triangular number.
 * Formula: <code>a(n) = A000203(A000217(n)).</code>
 * @author Georg Fischer
 */
public class A074285 extends NestedSequence {

  /** Construct the sequence. */
  public A074285() {
    super(1, new A000203(), new A000217(), 1, 0); 
  }

}