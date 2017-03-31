package string;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {

    public List<String> getPermutations(String string) {
        List<String> result = new ArrayList<>();
        permute("", string, result);
        return result;
    }

    private void permute(String prefix, String rest, List<String> result) {
        int restLength = rest.length();
        if (restLength <= 1) {
            result.add(prefix + rest);
        } else {
            for (int i = 0; i < restLength; i++) {
                permute(prefix + rest.charAt(i), rest.substring(0, i) + rest.substring(i + 1, restLength), result);
            }
        }
    }
}
