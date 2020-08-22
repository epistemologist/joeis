package irvine.oeis.a151;
// Generated by gen_seq4.pl padding 1 at 2020-08-22 18:36
// DO NOT EDIT here!

import irvine.oeis.PaddingSequence;


/**
 * A151951 <code>a(1) = 1113;</code> thereafter <code>a(n) = (a(n-1)</code> with digits sorted into descending order) <code>- (a(n-1)</code> with digits sorted into ascending order) (see the Kaprekar map, <code>A151949)</code>.
 * @author Georg Fischer
 */
public class A151951 extends PaddingSequence {

  /** Construct the sequence. */
  public A151951() {
    super(new long[] {1113, 1998, 8082, 8532}, new long[] {6174});
  }
}
