package irvine.oeis.a169;
// Generated by gen_seq4.pl padding 1 at 2020-08-22 18:36
// DO NOT EDIT here!

import irvine.oeis.PaddingSequence;


/**
 * A169735 <code>a(1) = 100;</code> for <code>n&gt;1, a(n) = a(n-1) - digitsum(a(n-1))</code>.
 * @author Georg Fischer
 */
public class A169735 extends PaddingSequence {

  /** Construct the sequence. */
  public A169735() {
    super(new long[] {100, 99, 81, 72, 63, 54, 45, 36, 27, 18, 9}, new long[] {0});
  }
}
