package irvine.oeis.a142;
// Generated by gen_seq4.pl holos [[0],[-3,-4,-1],[-3],[1]] [1,3,17] 2 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A142988 a(1) = 1, a(2) = 3, a(n+2) = 3*a(n+1)+(n+1)*(n+3)*a(n).
 * @author Georg Fischer
 */
public class A142988 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A142988() {
    super(1, "[[0],[-3,-4,-1],[-3],[1]]", "[1,3,17]", 2);
  }
}
