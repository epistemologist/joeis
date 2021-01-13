package irvine.oeis.a163;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a003.A003052;
import irvine.oeis.a007.A007953;


/**
 * A163125 Sum of digits of the n-th Colombian number, A003052(n).
 * Formula: <code>a(n) = A007953(A003052(n)).</code>
 * @author Georg Fischer
 */
public class A163125 extends NestedSequence {

  /** Construct the sequence. */
  public A163125() {
    super(1, new A007953(), new A003052(), 0, 1); 
  }

}