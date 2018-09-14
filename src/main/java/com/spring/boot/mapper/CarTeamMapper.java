package com.spring.boot.mapper;

import com.spring.boot.entity.CarTeam;
import com.spring.boot.entity.CarTeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarTeamMapper {
    long countByExample(CarTeamExample example);

    int deleteByExample(CarTeamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CarTeam record);

    int insertSelective(CarTeam record);

    List<CarTeam> selectByExample(CarTeamExample example);

    CarTeam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CarTeam record, @Param("example") CarTeamExample example);

    int updateByExample(@Param("record") CarTeam record, @Param("example") CarTeamExample example);

    int updateByPrimaryKeySelective(CarTeam record);

    int updateByPrimaryKey(CarTeam record);
}