package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237415 For k in <code>{2,3,</code>...,9} define a sequence as follows: <code>a(0)=0</code>; for <code>n&gt;=0, a(n+1)=a(n)+1,</code> unless <code>a(n)</code> ends in k, in which case <code>a(n+1)</code> is obtained by replacing the last digit of <code>a(n)</code> with the digit(s) of k^3. This is k(2).
 * @author Sean A. Irvine
 */
public class A237415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237415() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 2, 8, 9, 10});
  }
}
