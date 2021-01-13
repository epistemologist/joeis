package irvine.oeis.a050;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a007.A007953;
import irvine.oeis.a019.A019506;


/**
 * A050223 Digit sums of hoax numbers A019506.
 * Formula: <code>a(n) = A007953(A019506(n)).</code>
 * @author Georg Fischer
 */
public class A050223 extends NestedSequence {

  /** Construct the sequence. */
  public A050223() {
    super(1, new A007953(), new A019506(), 0, 1); 
  }

}