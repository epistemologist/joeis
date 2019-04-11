package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161680 <code>a(n) =</code> binomial(n,2): number of size-2 subsets of <code>{0,1,</code>...,n} that contain no consecutive integers.
 * @author Sean A. Irvine
 */
public class A161680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161680() {
    super(new long[] {1, -3, 3}, new long[] {0, 0, 1});
  }
}
