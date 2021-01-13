package irvine.oeis.a080;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000010;
import irvine.oeis.a008.A008472;


/**
 * A080647 Sum of prime factors of phi(n).
 * Formula: <code>a(n) = A008472(A000010(n)).</code>
 * @author Georg Fischer
 */
public class A080647 extends NestedSequence {

  /** Construct the sequence. */
  public A080647() {
    super(3, new A008472(), new A000010(), 1, 1); 
  }

}