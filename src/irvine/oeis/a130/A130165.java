package irvine.oeis.a130;
// Generated by gen_seq4.pl padding 1 at 2020-08-22 18:36
// DO NOT EDIT here!

import irvine.oeis.PaddingSequence;


/**
 * A130165 <code>a(0)=1; a(n)=prime(mod(a(n-1),10))</code>.
 * @author Georg Fischer
 */
public class A130165 extends PaddingSequence {

  /** Construct the sequence. */
  public A130165() {
    super(new long[] {1}, new long[] {11, 2, 3, 5});
  }
}
