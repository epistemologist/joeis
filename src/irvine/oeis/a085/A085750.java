package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085750 Determinant of the symmetric n X n matrix A defined by A[i,j] = |i-j| for <code>1 &lt;=</code> i,j <code>&lt;= n</code>.
 * @author Sean A. Irvine
 */
public class A085750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085750() {
    super(new long[] {-4, -4}, new long[] {0, -1});
  }
}
