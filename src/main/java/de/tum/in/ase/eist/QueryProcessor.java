package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "ben";
        }
        else if(query.contains("plus")){
            String left = query.substring(17, 18);
            String right = query.substring(24,query.length()-1);
            left = left.strip();
            right = right.strip();
            int numberOne = Integer.parseInt(left);
            int numberTwo = Integer.parseInt(right);
            return left + right;
        }
        else {// TODO extend the programm here
            return "";
        }
    }
}
