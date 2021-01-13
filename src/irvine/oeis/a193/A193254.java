package irvine.oeis.a193;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000593;
import irvine.oeis.a002.A002322;


/**
 * A193254 Sum of odd divisors of lambda(n).
 * Formula: <code>a(n) = A000593(A002322(n)).</code>
 * @author Georg Fischer
 */
public class A193254 extends NestedSequence {

  /** Construct the sequence. */
  public A193254() {
    super(1, new A000593(), new A002322(), 1, 1); 
  }

}