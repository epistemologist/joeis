package irvine.oeis.a339;
// Generated by gen_seq4.pl holos at 2021-01-18 14:41
// 5: 5
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;


/**
 * A339573 a(n) = floor(n*(n+1)/6) - 1.
 * @author Georg Fischer
 */
public class A339573 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A339573() {
    super(2, "[[0],[1],[-2],[1],[-1],[2],[-1]]", "0, 1, 2, 4, 6", 0);
  }
}