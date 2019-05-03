package irvine.oeis.a316;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A316725 Generalized <code>27-gonal</code> (or icosiheptagonal) numbers: <code>m*(25*m - 23)/2</code> with m <code>= 0, +1, -1, +2, -2, +3, -3</code>, ...
 * @author Georg Fischer
 */
public class A316725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A316725() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {24, 27, 73, 78, 147}, new long[] {0, 1});
  }
}
