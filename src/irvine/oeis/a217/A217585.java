package irvine.oeis.a217;
// Generated by gen_seq4.pl holos [0,1,-2,1] [0,1,5,11,15] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A217585 Number of triangles with endpoints of the form <code>(x,x^2), x</code> in <code>{-n,...,n}</code>, having at least one angle of <code>45\u00b0</code>.
 * @author Georg Fischer
 */
public class A217585 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A217585() {
    super(1, "[0,1,-2,1]", "[0,1,5,11,15]", 0);
  }
}
