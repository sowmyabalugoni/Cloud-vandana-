public class RomanToInteger {

public static int romanToInt(String s) {

int result = 0;

for (int i = 0; i < s.length(); i++) {

int currentVal = getValue(s.charAt(i));

if (i + 1 < s.length()) {

int nextVal = getValue(s.charAt(i + 1));
if (currentVal < nextVal) {

result -= currentVal;

} else {

result += currentVal;

}

} else {

result += currentVal;

}

}

return result;

}

public static int getValue(char c) {

switch (c) {

case 'I':

return 1;

case 'V':

return 5;

case 'X':

return 10;

case 'L':

return 50;

case 'C':

return 100;

case 'D':

return 500;

case 'M':

return 1000;
default:

return 0;

}

}

public static void main(String[] args) {

String romanNumeral = "IX";

int result = romanToInt(romanNumeral);

System.out.println(romanNumeral + " = " + result);

}

}
