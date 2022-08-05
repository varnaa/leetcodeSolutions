class Solution {
    public boolean checkIfExist(int[] arr) {
    Set<Integer> store = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (store.contains(2 * arr[i]) || (arr[i] % 2 == 0 && store.contains(arr[i] / 2))) return true;
            store.add(arr[i]);
        }
        return false;
    }
}