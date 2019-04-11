package irvine.oeis.a133;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A133680 <code>a(n)=8*a(n-1)+72*a(n-2)</code> for <code>n&gt;=3, a(0)=1, a(1)=8, a(2)=128 </code>.
 * @author Georg Fischer
 */
public class A133680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133680() {
    super(new long[] {72L, 8L}, new long[] {8L, 128L}, new long[] {1L});
  } // constructor()
} // A133680
