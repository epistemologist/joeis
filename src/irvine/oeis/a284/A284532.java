package irvine.oeis.a284;
// Generated by gen_seq4.pl padding 1 at 2020-08-22 18:36
// DO NOT EDIT here!

import irvine.oeis.PaddingSequence;


/**
 * A284532 The lexicographically earliest sequence of positive integers such that <code>a(1) = a(2) = 1</code> and <code>a(n + k) != a(n - k)</code> for all k <code>&lt;= a(n)</code>.
 * @author Georg Fischer
 */
public class A284532 extends PaddingSequence {

  /** Construct the sequence. */
  public A284532() {
    super(new long[] {1, 1, 2, 2, 3, 3, 1, 4, 3, 1, 2, 4, 1, 2}, new long[] {1, 4, 2, 1, 3, 2, 1, 3, 2, 1, 4, 2});
  }
}
