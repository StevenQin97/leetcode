import java.util.ArrayList;
import java.util.List;

public class ReorderSpacesSolution {
    public static String reorderSpaces(String text) {
        int spaceNum = 0;
        int stringCount = 0;
        StringBuilder builder = new StringBuilder();
        StringBuilder res = new StringBuilder();
        List<String> list = new ArrayList<>();
        String[] strs = text.split("");
        int textLen = strs.length;
        for (int i = 0; i < textLen; i++) {
            if (" ".equals(strs[i])) {
                spaceNum++;
            } else {
                builder.append(strs[i]);
                if (i + 1 == textLen || " ".equals(strs[i + 1])) {
                    list.add(builder.toString());
                    builder = new StringBuilder();
                    stringCount++;
                }
            }
        }
        if (stringCount == 0||(stringCount == 1 && spaceNum == 0)) {
            return text;
        }else if(stringCount == 1 && spaceNum != 0){
            res.append(text.trim());
            for(int i =0;i < spaceNum;i++){
                res.append(" ");
            }
            return res.toString();
        }

        int spaceNumBetweenStr = spaceNum / (stringCount - 1);
        int spaceNumLast = spaceNum % (stringCount - 1);

        for (int i = 0; i < stringCount - 1; i++) {
            res.append(list.get(i));
            for (int j = 0; j < spaceNumBetweenStr; j++) {
                res.append(" ");
            }
        }
        res.append(list.get(stringCount - 1));
        for (int i = 0; i < spaceNumLast; i++) {
            res.append(" ");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(reorderSpaces(
                "  this   is  a sentence "));
    }
}
