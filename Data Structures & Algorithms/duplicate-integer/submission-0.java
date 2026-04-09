class Solution {
    public boolean hasDuplicate(int[] nums) {
        /*
        A HashSet can be used here
        A HashSet is a data structure in Java that:
        Stores unique elements only
        provides fast o(1) average time for adding, removing 
        and checking if an element exsists
        When you check if an element exists, it calculates the
        Hash and checks a "bucket" to see if anything has alread
        -y been put into it.
        */
        //HashSet creation
        Set<Integer> dupe = new HashSet<>();
        //enhanced for loop
        for (int num : nums) {
            if (dupe.contains(num)) {
                return true;
            }
            dupe.add(num);
        }
        return false;
    }
}