package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093148 <code>a(n) =</code> gcd(Fibonacci(n+5), Fibonacci(n+1)).
 * @author Sean A. Irvine
 */
public class A093148 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093148() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 1, 1, 3});
  }
}
