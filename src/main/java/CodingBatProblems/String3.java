package CodingBatProblems;

public class String3 {

    public int countYZ(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == 'y' || c == 'z') {
                if (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1))) {
                    count++;
                }
            }
        }
        return count;
    }

    public String withoutString(String base, String remove) {
        StringBuilder result = new StringBuilder();
        String baseLower = base.toLowerCase();
        String removeLower = remove.toLowerCase();

        int i = 0;
        while (i < base.length()) {
            if (i <= base.length() - remove.length() &&
                    baseLower.substring(i, i + remove.length()).equals(removeLower)) {
                i += remove.length();
            } else {
                result.append(base.charAt(i));
                i++;
            }
        }
        return result.toString();
    }
    public boolean equalIsNot(String str) {
        int isCount = 0;
        int notCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i <= str.length() - 2 && str.substring(i, i + 2).equals("is")) {
                isCount++;
            }
            if (i <= str.length() - 3 && str.substring(i, i + 3).equals("not")) {
                notCount++;
            }
        }
        return isCount == notCount;
    }

    public boolean gHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                boolean leftG  = (i > 0 && str.charAt(i - 1) == 'g');
                boolean rightG = (i < str.length() - 1 && str.charAt(i + 1) == 'g');

                if (!leftG && !rightG) {
                    return false;
                }
            }
        }
        return true;
    }
}
