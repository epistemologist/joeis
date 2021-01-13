package irvine.oeis.a325;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.a007.A007955;


/**
 * A325838 Product of divisors of n-th triangular number.
 * Formula: <code>a(n) = A007955(A000217(n)).</code>
 * @author Georg Fischer
 */
public class A325838 extends NestedSequence {

  /** Construct the sequence. */
  public A325838() {
    super(1, new A007955(), new A000217(), 1, 0); 
  }

}