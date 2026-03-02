import java.util.HashMap;

public class OOPSBannerApp {

    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[] {
            "    ***    ",
            " **     ** ",
            "**       **",
            "**       **",
            "**       **",
            "**       **",
            "**       **",
            " **     ** ", 
            "    ***    "
        });

        charMap.put('P', new String[] {
            "******    ",
            "**     ** ",
            "**      **",
            "**     ** ",
            "******    ", 
            "**        ",
            "**        ",
            "**        ",
            "**        ",
        });

        charMap.put('S', new String[] {
            "     *****  ",
            "  **        ",
            " **         ",
            "  **        ",
            "    ****    ",
            "         ** ",
            "          **",
            "         ** ",
            "   *****   ",  
        });

        return charMap;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        if (message == null || message.isEmpty()) return;

        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {
            StringBuilder bannerLine = new StringBuilder();
            for (char c : message.toCharArray()) {
                if (charMap.containsKey(c)) {
                    bannerLine.append(charMap.get(c)[line]).append("  ");
                }
            }
            System.out.println(bannerLine.toString());
        }
    }

    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}