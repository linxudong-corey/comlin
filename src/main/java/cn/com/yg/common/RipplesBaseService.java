package cn.com.yg.common;

import com.baomidou.mybatisplus.extension.service.IService;

import java.io.Serializable;
import java.util.Collection;

public interface RipplesBaseService<T> extends IService<T> {
    PageResponse<T> page(PageRequest<T> var1);

    int deleteBatchIds(Collection<? extends Serializable> var1);
}
