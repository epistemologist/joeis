package irvine.oeis.a127;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A127620 Number of walks from <code>(0,0)</code> to <code>(n,n)</code> in the region <code>0 &lt;=</code> x-y <code>&lt;= 6</code> with the steps <code>(1,0), (0, 1), (2,0)</code> and <code>(0,2)</code>.
 * @author Georg Fischer
 */
public class A127620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127620() {
    super(new long[] {8, -6, -28, -24, 5, 6}, new long[] {1, 1, 5, 22, 117, 654});
  }
}
