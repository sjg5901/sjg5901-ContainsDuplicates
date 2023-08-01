import java.util.*;
import java.util.stream.Collectors;

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){


        // several ways to accomplish this. Using Set.add() most primitive
        
        Set<Integer> set = new HashSet<Integer>();

        // Set interface doesn't allow duplicates
        // set.add returns true if successfully added, false otherwise meaning duplicate present

        for (int num : nums) {
            if (!set.add(num)) { return true;}

        }

        return false;
    }
}
