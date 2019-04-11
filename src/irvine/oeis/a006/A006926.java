package irvine.oeis.a006;

/**
 * A006926 Number of connected trivalent graphs with <code>2n</code> nodes and girth exactly 6.
 * @author Sean A. Irvine
 */
public class A006926 extends A006924 {

  @Override
  protected int girth() {
    return 6;
  }
}

