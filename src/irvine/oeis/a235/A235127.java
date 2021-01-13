package irvine.oeis.a235;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a004.A004526;
import irvine.oeis.a007.A007814;


/**
 * A235127 Greatest k such that 4^k divides n.
 * Formula: <code>a(n) = A004526(A007814(n)).</code>
 * @author Georg Fischer
 */
public class A235127 extends NestedSequence {

  /** Construct the sequence. */
  public A235127() {
    super(1, new A004526(), new A007814(), 0, 1); 
  }

}