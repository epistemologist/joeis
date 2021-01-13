package irvine.oeis.a306;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a007.A007093;
import irvine.oeis.a032.A032862;


/**
 * A306109 Numbers with digits in {0,...,6} such that every other digit is strictly less than its neighbors.
 * Formula: <code>a(n) = A007093(A032862(n)).</code>
 * @author Georg Fischer
 */
public class A306109 extends NestedSequence {

  /** Construct the sequence. */
  public A306109() {
    super(1, new A007093(), new A032862(), 0, 1); 
  }

}