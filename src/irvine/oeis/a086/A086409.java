package irvine.oeis.a086;
// Generated by gen_seq4.pl padding 1 at 2020-08-22 18:36
// DO NOT EDIT here!

import irvine.oeis.PaddingSequence;


/**
 * A086409 <code>a[1]=1; a[n+1]=a[n]-1</code> if <code>prime[a[n]]+1)/2</code> is even, else <code>a[n+1]=a[n]+4</code>.
 * @author Georg Fischer
 */
public class A086409 extends PaddingSequence {

  /** Construct the sequence. */
  public A086409() {
    super(new long[] {1, 5, 4, 3, 7, 11, 10, 14, 13, 17, 16, 20, 19, 18, 22, 21, 25, 29, 33, 37, 41, 40, 44}, new long[] {46, 45, 49, 48, 47});
  }
}
