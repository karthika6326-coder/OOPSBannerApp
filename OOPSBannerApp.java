public class OOPSBannerApp {

    // Inner class to encapsulate character and its ASCII pattern
    static class CharacterPatternMap {
        char character;
        String[] pattern;

        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
    }

    // Initialize the character mappings
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', new String[] {
            "    ***    ",
            " **     ** ",
            "**       **",
            "**       **",
            "**       **",
            "**       **",
            "**       **",
            " **     ** ", 
            "    ***    "
            }),
            new CharacterPatternMap('P', new String[] {
            "******     ",
            "**     **  ",
            "**      ** ",
            "**     **  ",
            "******     ", 
            "**         ",
            "**         ",
            "**         ",
            "**         ",
            }),
            new CharacterPatternMap('S', new String[] {
            "     *****  ",
            "  **        ",
            " **         ",
            "  **        ",
            "    ****    ",
            "         ** ",
            "          **",
            "         ** ",
            "   *****    ",  
            })
        };
    }

    // Helper to find a specific pattern by character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.character == ch) return map.pattern;
        }
        return new String[] {"        ", "        ", "        ", "        ", "        ", "        ", "        "};
    }

    // Assembles and prints the message horizontally
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        int height = 9; // Fixed height for all patterns
        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[i]).append("  "); // Add 2 spaces between letters
            }
            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        // Create the map array and define the message
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";

        // Print the banner
        printMessage(message, charMaps);
    }
}