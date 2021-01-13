package irvine.oeis.a088;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000578;
import irvine.oeis.a020.A020639;


/**
 * A088378 (Smallest prime-factor of n)^3.
 * Formula: <code>a(n) = A000578(A020639(n)).</code>
 * @author Georg Fischer
 */
public class A088378 extends NestedSequence {

  /** Construct the sequence. */
  public A088378() {
    super(1, new A000578(), new A020639(), 0, 1); 
  }

}