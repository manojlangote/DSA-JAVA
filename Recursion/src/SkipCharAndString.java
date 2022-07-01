import javax.sound.midi.SoundbankResource;

public class SkipCharAndString {

    public static void main(String[] args) {
        String Source = "aabapplebfg";
        char EscapeVal = 'a';
        String Target = "";
        System.out.println("Source string: " + Source);
        System.out.println("Skip char " + EscapeVal + " -> " + skipChar(Source, Target, 0, EscapeVal));
        System.out.println("Skip String apple: " + skipString(Source));
    }

    static String skipChar(String source, String Target, int index, char Eval) {
        if (index >= source.length()) {
            return Target;
        }
        if (source.charAt(index) != Eval) Target += source.charAt(index);
        return skipChar(source, Target, ++index, Eval);

    }

    //Simplified version of above one
    static String skipChar2(String source) {
        if (source.isEmpty()) {
            return "";
        }
        char ch = source.charAt(0);
        if (ch == 'a') {
            return skipChar2(source.substring(1));
        }
        return ch + skipChar2(source.substring(1));
    }

    static String skipString(String source) {
        if (source.isEmpty()) {
            return "";
        }
        if (source.startsWith("apple")) {
            return skipString(source.substring(5));
        }
        return source.charAt(0) + skipString(source.substring(1));
    }
}
