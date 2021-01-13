package irvine.oeis.a107;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a001.A001221;
import irvine.oeis.a006.A006049;


/**
 * A107800 a(n) = number of distinct primes dividing A006049(n) (and dividing (A006049(n)+1).
 * Formula: <code>a(n) = A001221(A006049(n)).</code>
 * @author Georg Fischer
 */
public class A107800 extends NestedSequence {

  /** Construct the sequence. */
  public A107800() {
    super(1, new A001221(), new A006049(), 1, 1); 
  }

}