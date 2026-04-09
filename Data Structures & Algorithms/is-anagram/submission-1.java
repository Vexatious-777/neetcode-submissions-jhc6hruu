class Solution {
    public boolean isAnagram(String s, String t) {
        /*Brute Force Sorting solution with a 
        Time Space complexity of:
        Time:O(n logn + m logm)
        Space: O(1) or O(n+m) depending on the sorting algo
        if (s.length() != t.length()) {
            return false;
        }

        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        return Arrays.equals(sSort, tSort);
    }*/

    //The optimized solution seems to be a HashMap that will
    // Compare whether or not each hashmap holds the same
    // Characters

    //fast exit they can't be anagrams if the length is not
    //equivalent
    if (s.length() != t.length()) {
        return false;
    }

    //creation of the respective hashmaps for each string
    HashMap<Character, Integer> countS = new HashMap<>();
    HashMap<Character, Integer> countT = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
        countS.put(s.charAt(i),
        countS.getOrDefault(s.charAt(i), 0) + 1);
                    countT.put(t.charAt(i),
        countT.getOrDefault(t.charAt(i), 0) + 1);
    }
    return countS.equals(countT);
    }
}
