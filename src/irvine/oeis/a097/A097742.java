package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097742 Pell equation solutions (10*b(n))^2 <code>- 101*a(n)^2 = -1</code> with b(n):=A097741(n), <code>n&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A097742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097742() {
    super(new long[] {-1, 402}, new long[] {1, 401});
  }
}
