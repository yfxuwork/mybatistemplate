package cn.learnmybatis.chapter6.model;

/**
 * Created by Administrator on 2018/11/6 0006.
 */
public enum Enabled2 {
    enabled(1),
    disabled(0);

    private final int value;

    private Enabled2(int value){
        this.value=value;
    }

    public int getValue(){
        return value;
    }
}
