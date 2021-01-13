package irvine.oeis.a082;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a009.A009195;
import irvine.oeis.a020.A020639;


/**
 * A082067 Smallest prime that divides n and phi(n)=A000010(n), or 1 if n and phi(n) are relatively prime.
 * Formula: <code>a(n) = A020639(A009195(n)).</code>
 * @author Georg Fischer
 */
public class A082067 extends NestedSequence {

  /** Construct the sequence. */
  public A082067() {
    super(1, new A020639(), new A009195(), 1, 1); 
  }

}