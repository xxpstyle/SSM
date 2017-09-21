package main.java.com.gs.dao;

import com.gs.bean.Prop;
import com.gs.common.Pager;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 道具DAO接口，实现道具的CRUD
 * 创建：
 *
 * @author XXX
 * @version 1.0
 *
 */
@Repository
public interface PropDAO {

    /**
     *
     * @return
     */
    List<Prop> listByPager(Pager pager);

}
