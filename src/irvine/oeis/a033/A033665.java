package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A033665 Number of 'Reverse and Add' steps needed to reach a palindrome starting at <code>n,</code> or <code>-1</code> if n never reaches a palindrome.
 * @author Sean A. Irvine
 */
public class A033665 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    long c = 0;
    Z m = mN;
    String n = m.toString();
    while (!StringUtils.isPalindrome(n)) {
      m = m.add(new Z(new StringBuilder(n).reverse()));
      n = m.toString();
      ++c;
    }
    return Z.valueOf(c);
  }
}
