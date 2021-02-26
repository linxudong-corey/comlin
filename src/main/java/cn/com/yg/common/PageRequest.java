package cn.com.yg.common;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.cglib.core.internal.Function;


public class PageRequest<T> {
    private int pageSize;
    private int pageNum;
    private String[] ascs;
    private String[] descs;
    private T condition;

    public PageRequest() {
    }

    public PageRequest(int pageSize, int pageNum, String[] ascs, String[] descs, T condition) {
        this.pageSize = pageSize;
        this.pageNum = pageNum;
        this.ascs = ascs;
        this.descs = descs;
        this.condition = condition;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String[] getAscs() {
        return this.ascs;
    }

    public void setAscs(String[] ascs) {
        this.ascs = ascs;
    }

    public String[] getDescs() {
        return this.descs;
    }

    public void setDescs(String[] descs) {
        this.descs = descs;
    }

    public T getCondition() {
        return this.condition;
    }

    public void setCondition(T condition) {
        this.condition = condition;
    }

    public <R> Page<R> toPage(Class<R> clazz) {
        Page<R> p = new Page();
        p.setSize((long)this.getPageSize());
        p.setCurrent((long)this.getPageNum());
        p.setAsc(this.getAscs());
        p.setDesc(this.getDescs());
        return p;
    }

    public <R> QueryWrapper<R> toQueryWrapper(Function<T, R> converter) {
        if (this.getCondition() == null) {
            return null;
        } else {
            R condition = converter.apply(this.getCondition());
            return new QueryWrapper(condition);
        }
    }

    public QueryWrapper<T> toQueryWrapper() {
        return this.getCondition() == null ? null : new QueryWrapper(this.getCondition());
    }
}
