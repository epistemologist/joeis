package irvine.oeis.a120;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A120756 <code>a(n) =</code> leftmost term of M^n <code>* [1,0,0,0,0,0]</code> where M is the 6 X 6 matrix <code>[1,2,3,4,5,6</code>; <code>2,3,1,5,6,4</code>; <code>3,1,2,6,4,5</code>; <code>4,6,5,1,3,2</code>; <code>5,4,6,2,1,3</code>; <code>6,5,4,3,2,1]</code>.
 * @author Georg Fischer
 */
public class A120756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120756() {
    super(new long[] {567L, 225L, 9L}, new long[] {91L, 1410L, 33543L}, new long[] {1L});
  } // constructor()
} // A120756
