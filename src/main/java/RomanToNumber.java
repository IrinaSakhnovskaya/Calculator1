class RomanToNumber {
    public static int romanToArabic(String roman) {
        String[] romanArray = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] arabicArray = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        int i = 12;
        int arabic = 0;
        while (roman.length() > 0) {
            while (roman.startsWith(romanArray[i])) {
                arabic = arabic + arabicArray[i];
                roman = roman.substring(romanArray[i].length());
            }
            i--;
        }
        return arabic;
    }
}
