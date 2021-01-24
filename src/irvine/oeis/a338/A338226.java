package irvine.oeis.a338;
// Generated by gen_seq4.pl holos at 2021-01-18 14:41
// 4: 4
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;


/**
 * A338226 a(n) = Sum_{i=0..n-1} i*10^i - Sum_{i=0..n-1} (n-1-i)*10^i.
 * @author Georg Fischer
 */
public class A338226 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A338226() {
    super(1, "[[0],[-100],[220],[-141],[22],[-1]]", "0, 9, 198, 3087", 0);
  }
}