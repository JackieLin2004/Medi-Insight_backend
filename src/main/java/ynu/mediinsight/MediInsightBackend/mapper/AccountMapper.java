package ynu.mediinsight.MediInsightBackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import ynu.mediinsight.MediInsightBackend.entity.po.Account;

@Mapper
public interface AccountMapper extends BaseMapper<Account> {
}
