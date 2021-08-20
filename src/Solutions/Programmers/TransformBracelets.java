package Solutions.Programmers;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class TransformBracelets {

    public String solution(String p)
    {
        String Answer = "";

        Vector<Character> B_Stk = new Vector<>();

        Map<Character,Character> BraceletMap = new HashMap<>();
        BraceletMap.put(')','(');
        BraceletMap.put('}','{');
        BraceletMap.put(']','[');

        for(char c : p.toCharArray())
        {
            if(BraceletMap.containsKey(c))
            {

            }
        }

        return Answer;
    }
}
