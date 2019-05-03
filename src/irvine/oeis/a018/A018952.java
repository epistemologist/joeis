package irvine.oeis.a018;

/**
 * A018952 Cycle class sequence <code>c(2n)</code> (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite AFG = Afghanite <code>(Na2,Ca,K2)12 [ Al24Si24O96 ]</code>.
 * @author Sean A. Irvine
 */
public class A018952 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // AFG
    return "a-1: a-45(000) a-44(000) c-15(000) b-14(000)\n"
      + "b-14: a-37(000) b-28(000) b-26(+00)\n"
      + "c-15: c-36(+00) c-32(0+0) a-23(00-)\n"
      + "b-2: a-41(000) b-30(0+0) b-26(000) a-7(000)\n"
      + "a-7: a-44(000) a-43(000)\n"
      + "b-26: a-43(000) a-27(000)\n"
      + "b-30: a-45(000)\n"
      + "c-3: c-40(000) c-36(0-0) a-21(00-) a-7(0-0)\n"
      + "a-21: a-35(000) a-31(000)\n"
      + "c-36: a-43(000) a-39(-0-)\n"
      + "c-40: a-45(000)\n"
      + "a-4: a-47(000) a-46(000) c-18(+00) b-17(000)\n"
      + "b-17: a-39(000) b-22(000) b-20(++0)\n"
      + "c-18: c-38(0+0) c-34(-00) a-27(000)\n"
      + "b-5: a-31(000) b-24(-00) b-20(000) a-10(000)\n"
      + "a-10: a-48(000) a-46(000)\n"
      + "b-20: a-48(000) a-21(000)\n"
      + "b-24: a-47(000)\n"
      + "a-31: c-40(00+)\n"
      + "c-6: c-42(000) c-38(000) a-25(000) a-10(000)\n"
      + "a-25: a-37(000) a-33(000) b-30(000)\n"
      + "c-38: a-48(000) a-41(0-0)\n"
      + "c-42: a-47(-00)\n"
      + "b-8: a-33(000) b-30(000) b-28(--0) a-13(000)\n"
      + "a-13: a-45(000) a-43(000)\n"
      + "b-28: a-44(000) a-29(000)\n"
      + "a-33: c-42(000)\n"
      + "c-9: c-40(000) c-32(-00) a-19(-0-) a-13(000)\n"
      + "a-19: a-39(000) a-35(000) b-24(000)\n"
      + "c-32: a-44(0-0) a-35(00-)\n"
      + "b-11: a-35(000) b-24(000) b-22(0-0) a-16(000)\n"
      + "a-16: a-48(000) a-47(000)\n"
      + "b-22: a-46(000) a-23(000)\n"
      + "c-12: c-42(+00) c-34(0-0) a-29(0-0) a-16(000)\n"
      + "a-29: a-41(000) a-37(000)\n"
      + "c-34: a-46(000) a-37(000)\n"
      + "a-23: a-39(000) a-31(000)\n"
      + "a-27: a-41(000) a-33(000)\n";
  }
}

