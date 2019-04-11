package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166986 <code>a(n) =</code> 2*floor((n+2)/log(2)) <code>- 4 =</code> 2*Sum_{i=2,..,n+1}(A022934(i)).
 * @author Sean A. Irvine
 */
public class A166986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166986() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {4, 6, 10, 12, 16, 18, 20, 24, 26, 30});
  }
}
