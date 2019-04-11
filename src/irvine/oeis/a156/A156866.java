package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156866 <code>729000n - 116820</code>.
 * @author Sean A. Irvine
 */
public class A156866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156866() {
    super(new long[] {-1, 2}, new long[] {612180, 1341180});
  }
}
