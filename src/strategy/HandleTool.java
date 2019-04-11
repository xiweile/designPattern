package strategy;

/**
 * 处理的工具
 */
public class HandleTool {

    /** 排序接口 */
    private Rank rank;


    public HandleTool(){
        this.rank = rank;
    }

    public HandleTool(Rank rank){
        this.rank = rank;
    }

    public int[] rankHandle(int[] numbers){

        if(rank != null){
            numbers = rank.sort(numbers);
        }

        return numbers;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
}
