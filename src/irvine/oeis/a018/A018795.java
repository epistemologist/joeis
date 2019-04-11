package irvine.oeis.a018;

/**
 * A018795 Number of subsets of <code>{ 1, </code>..., <code>n }</code> containing <code>an</code> A.P. of length 10.
 * @author Sean A. Irvine
 */
public class A018795 extends A018794 {

  @Override
  protected int ap() {
    return 10;
  }
}
