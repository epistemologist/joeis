package irvine.oeis.a081;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a001.A001223;
import irvine.oeis.a006.A006530;


/**
 * A081412 Largest prime divisors of differences between consecutive primes.
 * Formula: <code>a(n) = A006530(A001223(n)).</code>
 * @author Georg Fischer
 */
public class A081412 extends NestedSequence {

  /** Construct the sequence. */
  public A081412() {
    super(2, new A006530(), new A001223(), 1, 1); 
  }

}