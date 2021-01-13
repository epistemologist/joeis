package irvine.oeis.a259;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a053.A053716;


/**
 * A259251 a(n) = 1 + sigma(n) + sigma(n)^2 + sigma(n)^3 + sigma(n)^4 + sigma(n)^5 + sigma(n)^6.
 * Formula: <code>a(n) = A053716(A000203(n)).</code>
 * @author Georg Fischer
 */
public class A259251 extends NestedSequence {

  /** Construct the sequence. */
  public A259251() {
    super(1, new A053716(), new A000203(), 1, 1); 
  }

}