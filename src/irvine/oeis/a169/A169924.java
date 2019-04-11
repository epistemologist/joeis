package irvine.oeis.a169;

import irvine.oeis.FiniteSequence;

/**
 * A169924 Values of <code>n &gt;= 0</code> such that <code>4*n-40+360/(n+9)</code> is <code>an</code> integer.
 * @author Georg Fischer
 */
public class A169924 extends FiniteSequence {

  /** Construct the sequence. */
  public A169924() {
    super(0, 1, 3, 6, 9, 11, 15, 21, 27, 31, 36, 51, 63, 81, 111, 171, 351);
  }
}
