package irvine.oeis.a262;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000330;


/**
 * A262247 Number of squares formed from a square composed of p^2 unit squares where p is n-th prime.
 * Formula: <code>a(n) = A000330(A000040(n)).</code>
 * @author Georg Fischer
 */
public class A262247 extends NestedSequence {

  /** Construct the sequence. */
  public A262247() {
    super(1, new A000330(), new A000040(), 0, 1); 
  }

}