package com.spring.boot.mapper;

import com.spring.boot.entity.OutboundOrder;
import com.spring.boot.entity.OutboundOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutboundOrderMapper {
    long countByExample(OutboundOrderExample example);

    int deleteByExample(OutboundOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OutboundOrder record);

    int insertSelective(OutboundOrder record);

    List<OutboundOrder> selectByExample(OutboundOrderExample example);

    OutboundOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OutboundOrder record, @Param("example") OutboundOrderExample example);

    int updateByExample(@Param("record") OutboundOrder record, @Param("example") OutboundOrderExample example);

    int updateByPrimaryKeySelective(OutboundOrder record);

    int updateByPrimaryKey(OutboundOrder record);
}