package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034803 Consider the sequence of 4-tuples <code>{0,a</code>,b,c} (c&gt;=a+b; a,b,c&gt;0)) which have the smallest integer 'c' required to reach {k,k,k,k} in n steps under map {r,s,t,u}-&gt;{|r-s|,|s-t|,|t-u|,|u-r|}. This sequence gives the second term 'a' of these quadruples.
 * @author Sean A. Irvine
 */
public class A034803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034803() {
    super(new long[] {1, 0, 0, 1, 0, 0, 3, 0, 0}, new long[] {1, 0, 0, 1, 0, 1, 1, 2, 2});
  }
}
