package irvine.oeis.a078;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002476;


/**
 * A078655 a(n) = prime(k) where k = n-th prime congruent to 1 mod 6.
 * Formula: <code>a(n) = A000040(A002476(n)).</code>
 * @author Georg Fischer
 */
public class A078655 extends NestedSequence {

  /** Construct the sequence. */
  public A078655() {
    super(1, new A000040(), new A002476(), 1, 1); 
  }

}