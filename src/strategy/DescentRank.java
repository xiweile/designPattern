package strategy;

/**
 * 倒序策略
 */
public class DescentRank implements Rank {
    @Override
    public int[] sort(int[] numbers) {

        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[j]>numbers[i]){
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        return numbers;
    }
}
