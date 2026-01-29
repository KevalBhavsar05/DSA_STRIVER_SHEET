import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UnionOfTwoSortedArray {
    public static List<Integer> Union(int[] nums1, int[] nums2) {
        List<Integer> Union = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if ((nums1[i] <= nums2[j])) {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != nums1[i]) {
                    Union.add(nums1[i]);
                }
                i++;
            } else if (nums2[j] < nums1[i]) {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != nums2[j]) {
                    Union.add(nums1[j]);
                }
                j++;
            } else {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != nums1[i]) {
                    Union.add(nums1[j]);
                }
                i++;
                j++;
            }
        }
        while (i < nums1.length) {
            if (Union.get(Union.size() - 1) != nums1[i])
                Union.add(nums1[i]);
            i++;
        }

        while (j < nums2.length) {
            if (Union.get(Union.size() - 1) != nums2[j])
                Union.add(nums2[j]);
            j++;
        }

        return Union;
    }
    // Time Complexity: O(m+n), Because at max i runs for n times and j runs for m
    // times. When there are no common elements in arr1 and arr2 and all elements in
    // arr1, arr2 are distinct.

    // Space Complexity : O(m+n) {If Space of Union ArrayList is considered} O(1)
    // {If Space of union ArrayList is not considered}

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 4, 5 };
        int[] nums2 = { 1, 1, 4, 5, 6, 7, 8 };
        List<Integer> Union = new ArrayList<>();
        Union = Union(nums1, nums2);
        for (int i : Union) {
            System.out.println(i);
        }
    }
}

// public static List<Integer> Union(int[] nums1, int[] nums2) {
// TreeMap<Integer, Integer> map = new TreeMap<>();
// for (int i : nums1) {
// if (!map.containsKey(i)) {
// map.put(i, 1);
// }
// }
// for (int i : nums2) {
// if (!map.containsKey(i)) {
// map.put(i, 1);
// }
// }
// List<Integer> Union = new ArrayList<>();
// for (int key : map.keySet()) {
// Union.add(key);
// }
// return Union;
// }
// Time Compleixty : O( (m+n)log(m+n) ) . Inserting a key in map takes logN
// times, where N is no of elements in map. At max map can store m+n elements
// {when there are no common elements and elements in arr,arr2 are distntict}.
// So Inserting m+n th element takes log(m+n) time. Upon approximation across
// insertion of all elements in worst it would take O((m+n)log(m+n) time.
// Space Complexity : O(m+n) {If Space of Union ArrayList is considered} ,O(1)
// {If Space of union ArrayList is not considered}
