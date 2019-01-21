package cn.learnmybatis.chapter6.model;

import java.util.Date;

/**
 * Created by Administrator on 2018/11/5 0005.
 */
public class CreateInfo {
    private String createBy;
    private Date createTime;

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
