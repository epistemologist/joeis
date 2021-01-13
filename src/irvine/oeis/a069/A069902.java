package irvine.oeis.a069;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.a006.A006530;


/**
 * A069902 Largest prime factor of n-th triangular number n(n+1)/2.
 * Formula: <code>a(n) = A006530(A000217(n)).</code>
 * @author Georg Fischer
 */
public class A069902 extends NestedSequence {

  /** Construct the sequence. */
  public A069902() {
    super(2, new A006530(), new A000217(), 1, 0); 
  }

}