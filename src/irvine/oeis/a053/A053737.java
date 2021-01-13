package irvine.oeis.a053;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a007.A007090;
import irvine.oeis.a007.A007953;


/**
 * A053737 Sum of digits of (n written in base 4).
 * Formula: <code>a(n) = A007953(A007090(n)).</code>
 * @author Georg Fischer
 */
public class A053737 extends NestedSequence {

  /** Construct the sequence. */
  public A053737() {
    super(0, new A007953(), new A007090(), 0, 0); 
  }

}