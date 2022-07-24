public class LongestRomenInteger {

    /*
     * https://leetcode.com/problems/integer-to-roman/
     * 
     * 
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D
     * and M.
     * 
     * Symbol Value
     * I 1
     * V 5
     * X 10
     * L 50
     * C 100
     * D 500
     * M 1000
     * For example, 2 is written as II in Roman numeral, just two one's added
     * together. 12 is written as XII, which is simply X + II. The number 27 is
     * written as XXVII, which is XX + V + II.
     * 
     * Roman numerals are usually written largest to smallest from left to right.
     * However, the numeral for four is not IIII. Instead, the number four is
     * written as IV. Because the one is before the five we subtract it making four.
     * The same principle applies to the number nine, which is written as IX. There
     * are six instances where subtraction is used:
     * 
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given an integer, convert it to a roman numeral.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: num = 3
     * Output: "III"
     * Explanation: 3 is represented as 3 ones.
     * Example 2:
     * 
     * Input: num = 58
     * Output: "LVIII"
     * Explanation: L = 50, V = 5, III = 3.
     * Example 3:
     * 
     * Input: num = 1994
     * Output: "MCMXCIV"
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     * 
     * 
     * Constraints:
     * 
     * 1 <= num <= 3999
     * 
     */
    public static void main(String[] args) {
        int i = 34250;

        System.out.println(hunderdsForms(i));
    }

    public static String intToRoman(int num) {

        String[] numbers = /* hunderdsForms(num); */ new String[5];
        String intToRoman = "";
        for (String string : numbers) {
            int number = Integer.parseInt(string);

            if (number <= 5) {

                if (number < 4) {
                    for (int i = 0; i < number; i++) {
                        intToRoman += "I";
                    }

                } else if (number == 4) {

                    intToRoman += "IV";

                } else {
                    intToRoman += "V";

                }

            } else if (number <= 10) {
                if (number < 9) {
                    intToRoman += "V";
                    for (int i = 5; i < number; i++) {
                        intToRoman += "I";
                    }

                } else if (number == 9) {
                    intToRoman += "IX";
                } else {

                    intToRoman += "X";

                }

            } else if (number <= 50) {
                if (number < 40) {

                    for (int i = 10; i <= number; i += 10) {
                        intToRoman += "X";
                    }
                }

                else if (number == 40) {
                    intToRoman += "XL";

                } else if (number == 50) {
                    intToRoman += "L";
                }

            } else if (number <= 100) {

                if (number < 90) {
                    intToRoman += "L";
                    for (int i = 60; i <= number; i += 10) {
                        intToRoman += "X";
                    }
                } else if (number == 90) {
                    intToRoman += "XC";

                } else if (number == 100) {
                    intToRoman += "C";
                }

            } else if (number <= 500) {
                if (number < 400) {
                    for (int i = 100; i <= number; i += 100) {
                        intToRoman += "C";
                    }
                } else if (number == 400) {
                    intToRoman += "CD";

                } else if (number == 500) {
                    intToRoman += "D";
                }

            } else if (number <= 1000) {

                if (number < 900) {
                    intToRoman += "D";
                    for (int i = 600; i <= number; i += 100) {
                        intToRoman += "C";
                    }
                } else if (number == 900) {
                    intToRoman += "CM";

                } else if (number == 1000) {
                    intToRoman += "M";
                }
            } else if (number > 1000) {

                for (int i = 1000; i <= number; i += 1000) {
                    intToRoman += "M";
                }

            }

        }
        return intToRoman;
    }

    private static String hunderdsForms(int num) {

        int size = String.valueOf(num).length();
        String numberString = String.valueOf(num);
        // String[] values = new String[size];

        String intToRoman = "";

        for (int i = size - 1; i >= 0; i--) {

            int currentIndex = size - 1 - i;

            long number = Math.round(Integer.parseInt(numberString.charAt(currentIndex) + "") * Math.pow(10, i));

            if (number <= 5) {

                if (number < 4) {
                    for (long m = 0; m < number; m++) {
                        intToRoman += "I";
                    }

                } else if (number == 4) {

                    intToRoman += "IV";

                } else {
                    intToRoman += "V";

                }

            } else if (number <= 10) {
                if (number < 9) {
                    intToRoman += "V";
                    for (int m = 5; m < number; m++) {
                        intToRoman += "I";
                    }

                } else if (number == 9) {
                    intToRoman += "IX";
                } else {

                    intToRoman += "X";

                }

            } else if (number <= 50) {
                if (number < 40) {

                    for (int m = 10; m <= number; m += 10) {
                        intToRoman += "X";
                    }
                }

                else if (number == 40) {
                    intToRoman += "XL";

                } else if (number == 50) {
                    intToRoman += "L";
                }

            } else if (number <= 100) {

                if (number < 90) {
                    intToRoman += "L";
                    for (int m = 60; m <= number; m += 10) {
                        intToRoman += "X";
                    }
                } else if (number == 90) {
                    intToRoman += "XC";

                } else if (number == 100) {
                    intToRoman += "C";
                }

            } else if (number <= 500) {
                if (number < 400) {
                    for (int m = 100; m <= number; m += 100) {
                        intToRoman += "C";
                    }
                } else if (number == 400) {
                    intToRoman += "CD";

                } else if (number == 500) {
                    intToRoman += "D";
                }

            } else if (number <= 1000) {

                if (number < 900) {
                    intToRoman += "D";
                    for (int m = 600; m <= number; m += 100) {
                        intToRoman += "C";
                    }
                } else if (number == 900) {
                    intToRoman += "CM";

                } else if (number == 1000) {
                    intToRoman += "M";
                }
            } else if (number > 1000) {

                for (int m = 1000; m <= number; m += 1000) {
                    intToRoman += "M";
                }

            }

        }

        return intToRoman;
    }

}
