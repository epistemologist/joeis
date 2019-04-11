package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099156 <code>a(n) =</code> 2^(n-1)*U(n-1, <code>2)</code>.
 * @author Sean A. Irvine
 */
public class A099156 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099156() {
    super(new long[] {-4, 8}, new long[] {0, 1});
  }
}
