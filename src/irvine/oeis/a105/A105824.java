package irvine.oeis.a105;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a010.A010873;


/**
 * A105824 a(n) = sigma(n) mod 4.
 * Formula: <code>a(n) = A010873(A000203(n)).</code>
 * @author Georg Fischer
 */
public class A105824 extends NestedSequence {

  /** Construct the sequence. */
  public A105824() {
    super(1, new A010873(), new A000203(), 0, 1); 
  }

}