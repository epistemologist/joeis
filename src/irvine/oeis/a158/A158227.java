package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158227 <code>225n - 1</code>.
 * @author Sean A. Irvine
 */
public class A158227 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158227() {
    super(new long[] {-1, 2}, new long[] {224, 449});
  }
}
