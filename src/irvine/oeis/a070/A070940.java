package irvine.oeis.a070;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000265;


/**
 * A070940 Number of digits that must be counted from left to right to reach the last 1 in the binary representation of n.
 * Formula: <code>a(n) = A070939(A000265(n)).</code>
 * @author Georg Fischer
 */
public class A070940 extends NestedSequence {

  /** Construct the sequence. */
  public A070940() {
    super(1, new A070939(), new A000265(), 0, 1); 
  }

}