package irvine.oeis.a071;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000005;
import irvine.oeis.a006.A006530;


/**
 * A071188 Largest prime factor of number of divisors of n.
 * Formula: <code>a(n) = A006530(A000005(n)).</code>
 * @author Georg Fischer
 */
public class A071188 extends NestedSequence {

  /** Construct the sequence. */
  public A071188() {
    super(1, new A006530(), new A000005(), 1, 1); 
  }

}