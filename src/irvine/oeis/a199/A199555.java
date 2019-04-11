package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199555 <code>7*8^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199555 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199555() {
    super(new long[] {-8, 9}, new long[] {8, 57});
  }
}
