package irvine.oeis.a142;
// Generated by gen_seq4.pl holos [[0],[0,1,-1],[-8],[1]] [1,8] 0 at 2019-12-06 18:14
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A142986 a(1) = 1, a(2) = 8, a(n+2) = 8*a(n+1) + (n+1)*(n+2)*a(n).
 * @author Georg Fischer
 */
public class A142986 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A142986() {
    super(1, "[[0],[0,1,-1],[-8],[1]]", "[1,8]", 0);
  }
}
