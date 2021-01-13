package irvine.oeis.a085;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000961;
import irvine.oeis.a001.A001414;


/**
 * A085729 Sum of prime factors of prime powers.
 * Formula: <code>a(n) = A001414(A000961(n)).</code>
 * @author Georg Fischer
 */
public class A085729 extends NestedSequence {

  /** Construct the sequence. */
  public A085729() {
    super(1, new A001414(), new A000961(), 1, 1); 
  }

}