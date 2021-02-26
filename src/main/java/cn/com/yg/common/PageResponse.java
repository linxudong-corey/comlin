package cn.com.yg.common;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.cglib.core.internal.Function;

import java.util.List;

public class PageResponse<T> {
    private List<T> records;
    private long total;
    private long pageSize;
    private long pageNum;

    public PageResponse(List<T> records, long total, long pageSize, long pageNum) {
        this.records = records;
        this.total = total;
        this.pageSize = pageSize;
        this.pageNum = pageNum;
    }

    public PageResponse() {
    }

    public List<T> getRecords() {
        return this.records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }

    public long getTotal() {
        return this.total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public long getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(long pageNum) {
        this.pageNum = pageNum;
    }

    public boolean hasPrevious() {
        return this.pageNum > 1L;
    }

    public boolean hasNext() {
        return this.pageNum < this.getPages();
    }

    public long getPages() {
        if (this.getPageSize() == 0L) {
            return 0L;
        } else {
            long pages = this.getTotal() / this.getPageSize();
            if (this.getTotal() % this.getPageSize() != 0L) {
                ++pages;
            }

            return pages;
        }
    }

    public <R> PageResponse<R> convertRecords(Function<T, R> converter) {
        List<R> records = BeanUtils.convertList(this.getRecords(), converter);
        return new PageResponse(records, this.getTotal(), this.getPageSize(), this.getPageNum());
    }

    public static <T> PageResponse<T> from(IPage<T> page) {
        return new PageResponse(page.getRecords(), page.getTotal(), page.getSize(), page.getCurrent());
    }

    public static <T, R> PageResponse<R> from(IPage<T> page, Function<T, R> converter) {
        List<R> records = BeanUtils.convertList(page.getRecords(), converter);
        return new PageResponse(records, page.getTotal(), page.getSize(), page.getCurrent());
    }

    public static <T, R> PageResponse<R> from(IPage<T> page, Class<R> targetType) {
        List<R> records = BeanUtils.convertList(page.getRecords(), targetType);
        return new PageResponse(records, page.getTotal(), page.getSize(), page.getCurrent());
    }
}
