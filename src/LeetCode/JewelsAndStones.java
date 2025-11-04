package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JewelsAndStones {  public int numJewelsInStones(String jewels, String stones) {

    Set<Character> jws = new HashSet<>();

    for (char a :jewels.toCharArray()) jws.add(a);

    int count = 0;

    for (char a : stones.toCharArray()){

        if (jws.contains(a)){
            count++;
        }
    }

    return count;

}

}
