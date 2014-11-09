public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        //Arrays.sort(numbers);
        int[] index = new int[2];
        int len = numbers.length;
        // for(int i = 1; i < len + 1; i++){
        //     for(int j = i + 1; j < len + 1; j++){
        //         if(target - numbers[i-1] == numbers[j-1]){
        //             index[0] = i;
        //             index[1] = j;
        //         }
        //     }
        // }
        //after seeing the discussion
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 1; i < len + 1; i++){
            if(map.containsKey(target - numbers[i-1])){
                index[1] = i;
                index[0] = map.get(target - numbers[i-1]);
                return index;
            }
            map.put(numbers[i-1],i);
        }
        return index;
    }
}