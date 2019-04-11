package irvine.oeis.a018;

/**
 * A018832 Numbers n such that n is a substring of its square in base 8 (written in base <code>10)</code>.
 * @author Sean A. Irvine
 */
public class A018832 extends A018826 {

  @Override
  protected int base() {
    return 8;
  }
}
