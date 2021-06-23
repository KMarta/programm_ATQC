package Basic;

//import com.sun.javafx.binding.StringFormatter;

import java.util.Locale;

//import static javafx.scene.input.KeyCode.W;
//import static jdk.nashorn.internal.objects.NativeString.replace;
//import static jdk.nashorn.internal.objects.NativeString.trim;

public class Task10 {
    private static Object NumberFormatException;

    public static void main(String[] args) {

        // Create 2 different strings.  Concatenate them and print result. Explain what types of concatenation exists
        String str1 = "One", str2 = " Two";
        str1 = str1 + str2; //Using the concatenation operator '+'.
        System.out.println(str1);

        // Create string "   egweerw  ererferw  kuy  yu i ". Print its length
        String s1 = "   egweerw  ererferw  kuy  yu i ";
        System.out.println(s1.length());

        //Create string "   egweerw  ererferw  kuy  yu i ". Print its length;Trim string and print result. Print length of trimmed string
        String myStr = "   egweerw  ererferw  kuy  yu i ";
        System.out.println(myStr.length());
        System.out.println(myStr);  // without trim ()
        String tr = myStr.trim();
        System.out.println(tr.length());
        System.out.println(tr); //With trim ()

        // Create string "   egweerw  ererferw  kuy  yu i ".  Split string by spaces and print each value in separate row
        String str = "   egweerw  ererferw  kuy  yu i ";
        String[] splits = str.split("\\s+"); //This regEx splits the String on the WhiteSpaces
        for (String splits2 : splits) {
            System.out.println(splits2);

            //Create string "   egweerw  ererferw  kuy  yu i ".  Split string by spaces and print each value in separate row.
            String st = "   egweerw  ererferw  kuy  yu i ";
            String[] spl = str.trim().split("\\s+"); //This regEx splits the String on the WhiteSpaces
            for (String spl2 : spl) {
                System.out.println(spl2);

                //Create string "   egweerw  ererferw  kuy  yu i ". Convert all characters to uppercase. Print result; ·
                String s = "   egweerw  ererferw  kuy  yu i ";
                System.out.println("Return value with UPPERCASE :");
                System.out.println(s.toUpperCase(Locale.ROOT));  //Convert to UpperCase

                // Create string "   egweerw  ererferw  kuy  yu i ". Convert all 'w' to uppercase.Print result;
                String r = "   egweerw  ererferw  kuy  yu i ";
                System.out.println("Return value with UPPERCASE W :");
                char[] chArray = r.toCharArray();
                for (int i = 0; i < chArray.length; i++) {
                    if (chArray[i] == 'w') {
                        chArray[i] = 'W';
                        System.out.println(chArray);
                    }
                }

                // Create string "egweerw  ererferw  kuy  yu i ". Convert first 'w' to uppercase. Print result;

                String t = "   egweerw  ererferw  kuy  yu i ";
                char[] cArray = t.toCharArray();
                System.out.println("Return value with  first uppercase : ");
                cArray[1] = Character.toUpperCase(chArray[5]);
                for (int i = 1; i < cArray.length; i++) {
                    if (chArray[i] == 'w') {
                        chArray[i] = 'W';
                        System.out.println(chArray);
                    }
                }

                System.out.println(cArray);

                //Create string "this item previous price $5.99 .Sale price $1.99. " - parse original and sale price from string and print them.

                class NumberFormatExceptionExample {
                    public void main(String[] args) {
                        try {
                            String strMsg = "this item previous price $5.99. Sale price $1.99 ";
                            float value = Float.parseFloat(strMsg);
                            //Float.parseFloat("(\d+\.\d+)\s(\d+\.\d+)"));
                            System.out.println("Parse prices -  " + value);
                        } catch (Exception e) {
                            System.err.println("Invalid string in argumment");
                        } finally {
                            System.out.printf("return parse price" + "(\\d+\\.\\d+)\\s(\\d+\\.\\d+)\")");

                        }
                    }
                }
            }
        }
    }
}










