class NumberToRoman {
    static String numberToRoman(int number) {
        String[] romanArray = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] arabicArray = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        StringBuilder roman = new StringBuilder();
        int i = 12;
        while (number>0) {
            while (number>=arabicArray[i]) {
                roman.append(romanArray[i]);
                number-=arabicArray [i];
            }
            i--;
        }
        return roman.toString();
    }
}