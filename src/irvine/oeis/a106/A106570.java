package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106570 First entry of the vector (M^n)v, where M is the 2 X 2 matrix <code>[[0,3],[1,4]]</code> and v is the column vector <code>[0,1]</code>.
 * @author Sean A. Irvine
 */
public class A106570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106570() {
    super(new long[] {3, 4}, new long[] {0, 3});
  }
}
