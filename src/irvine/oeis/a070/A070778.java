package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070778 Let M denote the 6 X 6 matrix = row by row <code>/1,1,1,1,1,1/1,1,1,1,1,0/1,1,1,1,0,0/1,1,1,0,0,0/1,1,0,0,0,0/1,0,0,0,0,0/</code> and A(n) the vector <code>(x(n)</code>,y(n),z(n),t(n),u(n),v(n)) = M^n*A where A is the vector <code>(1,1,1,1,1,1)</code>; then <code>a(n) =</code> u(n).
 * @author Sean A. Irvine
 */
public class A070778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070778() {
    super(new long[] {1, 1, -5, -4, 6, 3}, new long[] {1, 2, 11, 41, 176, 721});
  }
}
