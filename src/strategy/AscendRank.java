package strategy;

/**
 * 升序策略
 */
public class AscendRank implements Rank{

    @Override
    public int[] sort(int[] numbers) {

        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length -i-1;j++){
                if(numbers[j]>numbers[j+1]){
                    int tmp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        return numbers;
    }
}
