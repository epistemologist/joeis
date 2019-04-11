package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179992 Extended three term Fibonacci sequence <code>a(n)=a(n-1)+a(n-2)+n^2</code>. <code>a(1)=2</code>; a(2)=5.
 * @author Sean A. Irvine
 */
public class A179992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179992() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {2, 5, 16, 37, 78});
  }
}
