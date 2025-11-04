package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmail {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for (String email :emails){
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];
            local = local.split("\\+")[0];
            local = local.replace(".", "");
            String cleanedEmails = local + "@" + domain;
            uniqueEmails.add(cleanedEmails);


        }
        return uniqueEmails.size();



    }
}
