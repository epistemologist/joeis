package irvine.oeis.a079;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000079;
import irvine.oeis.a032.A032020;


/**
 * A079281 Number of compositions of 2^n into distinct parts.
 * Formula: <code>a(n) = A032020(A000079(n)).</code>
 * @author Georg Fischer
 */
public class A079281 extends NestedSequence {

  /** Construct the sequence. */
  public A079281() {
    super(0, new A032020(), new A000079(), 0, 0); 
  }

}