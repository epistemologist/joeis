package irvine.oeis.a332;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a006.A006577;


/**
 * A332209 Starting from sigma(n), number of halving and tripling steps to reach 1 in '3x+1' problem, or -1 if 1 is never reached.
 * Formula: <code>a(n) = A006577(A000203(n)).</code>
 * @author Georg Fischer
 */
public class A332209 extends NestedSequence {

  /** Construct the sequence. */
  public A332209() {
    super(1, new A006577(), new A000203(), 1, 1); 
  }

}