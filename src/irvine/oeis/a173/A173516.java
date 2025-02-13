package irvine.oeis.a173;
// Generated by gen_seq4.pl holos at 2021-06-24 22:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A173516 a(1)=1, a(n)= 3*n*a(n-1)+1, n&gt;1.
 * Recurrence: a(1)=1,a(n)= 3*n*a(n-1)+1 for n&gt;2
 * @author Georg Fischer
 */
public class A173516 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A173516() {
    super(1, "[[1],[0, 3],[-1]]", "[1, 7]", 0);
  }
}
