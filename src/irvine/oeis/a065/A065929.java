package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065929 <code>(x</code>,y) <code>= (a(n),a(n+1))</code> are the solutions of (t(x)+t(y))/(1+xy)) = t(3) <code>= 6,</code> where t(n) denotes the n-th triangular number t(n) <code>= n(n+1)/2</code>.
 * @author Sean A. Irvine
 */
public class A065929 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065929() {
    super(new long[] {1, -13, 13}, new long[] {3, 35, 416});
  }
}
