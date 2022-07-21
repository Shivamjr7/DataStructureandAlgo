package arrays;

import java.util.List;

public class CountItemsMatchingaRule {


    public static void main(String[] args) {

    }


    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {


        int index = -1;
        if(ruleKey.equals("type"))
        {
            index = 0;
        }
        else if(ruleKey.equals("color"))
        {
            index =1;
        }
        else {
            index = 2;
        }

        int count =0;


        for(List<String> list : items)
        {
            if(list.get(index).equals(ruleValue))
                count++;
        }


        return count;

    }
}
