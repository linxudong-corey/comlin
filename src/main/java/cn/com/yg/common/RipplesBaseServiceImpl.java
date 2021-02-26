package cn.com.yg.common;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Collection;

public class RipplesBaseServiceImpl<M extends RipplesBaseMapper<T>, T> extends ServiceImpl<M, T> implements RipplesBaseService<T> {
    @Autowired
    private M mapper;

    public RipplesBaseServiceImpl() {
    }

    public M getMapper() {
        return this.mapper;
    }

    public boolean updateById(T entity) {
        if (!super.updateById(entity)) {
            throw Errors.wrap(CommonError.UPDATE_NOTHING, new Object[0]);
        } else {
            return true;
        }
    }

    public boolean removeById(Serializable id) {
        if (!super.removeById(id)) {
            throw Errors.wrap(CommonError.DELETE_NOTHING, new Object[0]);
        } else {
            return true;
        }
    }

    public PageResponse<T> page(PageRequest<T> pageRequest) {
        Page p = new Page();
        p.setSize((long)pageRequest.getPageSize());
        p.setCurrent((long)pageRequest.getPageNum());
        p.setAsc(pageRequest.getAscs());
        p.setDesc(pageRequest.getDescs());
        QueryWrapper q = null;
        if (pageRequest.getCondition() != null) {
            q = new QueryWrapper(pageRequest.getCondition());
        }

        IPage r = super.page(p, q);
        return new PageResponse(r.getRecords(), r.getTotal(), r.getSize(), r.getCurrent());
    }

    public int deleteBatchIds(Collection<? extends Serializable> idList) {
        return this.mapper.deleteBatchIds(idList);
    }
}
