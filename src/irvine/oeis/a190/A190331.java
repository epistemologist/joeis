package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190331 <code>a(n) = 8*a(n-1) + 2*a(n-2),</code> with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A190331 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190331() {
    super(new long[] {2, 8}, new long[] {0, 1});
  }
}
