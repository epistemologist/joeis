package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173009 The mean value m(n) = sum(k*p(n,k), k <code>= 0 </code>.. <code>2^n-n-1)</code> of the distribution function p(n,k) := binomial(2^n-n-1, k)/2^(2^n-n-1) is 0., 0.5, 2., 5.5, 13., 28.5, 60., 123.5, 251., 506.5, 1018., 2041.5, 4089., 8184.5... We set A173009(n)=round(m(n)).
 * @author Sean A. Irvine
 */
public class A173009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173009() {
    super(new long[] {2, -3, -1, 3}, new long[] {0, 1, 2, 6});
  }
}
