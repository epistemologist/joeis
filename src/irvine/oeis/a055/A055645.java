package irvine.oeis.a055;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055645 Integers in base 16 with each hexadecimal digit represented by 2 decimal digits.
 * Integers in base 16 with each base 16 digit represented by 2 decimal digits.
 * @author Georg Fischer
 */
public class A055645 implements Sequence  {

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(Z.valueOf(++mN).toTwoDigits(16));
  }
}
