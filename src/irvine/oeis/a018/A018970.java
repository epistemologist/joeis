package irvine.oeis.a018;

/**
 * A018970.
 * @author Sean A. Irvine
 */
public class A018970 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // AFX
    return "a-1: a-41(--0) b-38(000) a-37(000) a-15(-0-)\n"
      + "a-15: b-34(000) a-33(000) a-29(+00)\n"
      + "b-2: b-42(000) b-38(000) a-37(000) b-32(000)\n"
      + "a-3: b-48(000) a-47(000) a-45(0-0) a-19(0-0)\n"
      + "a-19: b-36(000) a-35(000) a-31(++0)\n"
      + "b-4: b-48(000) a-47(000) b-46(000) b-34(000)\n"
      + "a-5: b-42(000) a-41(000) a-39(+00) a-13(00-)\n"
      + "a-13: a-33(0+0) b-26(000) a-25(000)\n"
      + "b-6: b-42(000) a-41(000) b-40(000) b-36(000)\n"
      + "a-7: b-46(000) a-45(000) a-43(++0) a-23(+00)\n"
      + "a-23: a-35(-00) b-28(000) a-27(000)\n"
      + "b-8: b-46(000) a-45(000) b-44(000) b-26(000)\n"
      + "a-9: b-40(000) a-39(000) a-37(0+0) a-17(0+-)\n"
      + "a-17: b-30(000) a-29(000) a-25(--0)\n"
      + "b-10: b-40(000) a-39(000) b-38(000) b-28(000)\n"
      + "a-11: a-47(-00) b-44(000) a-43(000) a-21(000)\n"
      + "a-21: b-32(000) a-31(000) a-27(0-0)\n"
      + "b-12: b-48(000) b-44(000) a-43(000) b-30(000)\n"
      + "a-25: a-39(+0+)\n"
      + "a-33: a-41(0-+)\n"
      + "b-14: b-46(000) b-34(000) b-26(000) a-25(000)\n"
      + "a-29: a-37(00+)\n"
      + "b-16: b-48(000) b-34(000) a-33(000) b-30(000)\n"
      + "b-18: b-44(000) b-30(000) a-29(000) b-26(000)\n"
      + "a-31: a-47(-00)\n"
      + "a-35: a-45(000)\n"
      + "b-20: b-42(000) b-36(000) a-35(000) b-32(000)\n"
      + "a-27: a-43(0+0)\n"
      + "b-22: b-38(000) b-32(000) a-31(000) b-28(000)\n"
      + "b-24: b-40(000) b-36(000) b-28(000) a-27(000)\n";
  }

  @Override
  protected String startNode() {
    return "b-2";
  }
}

