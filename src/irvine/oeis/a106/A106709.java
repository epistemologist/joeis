package irvine.oeis.a106;
// Generated by gen_seq4.pl holos at 2021-01-18 14:41
// 2: 2
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;


/**
 * A106709 First entry of the vector (M^n)v, where M is the 2 X 2 matrix [[0,-2],[1,5]] and v is the column vector [0,1].
 * @author Georg Fischer
 */
public class A106709 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A106709() {
    super(0, "[[0],[-2],[5],[-1]]", "0,-2", 0);
  }
}