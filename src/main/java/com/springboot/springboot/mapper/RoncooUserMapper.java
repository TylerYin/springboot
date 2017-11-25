package com.springboot.springboot.mapper;

import com.springboot.springboot.bean.RoncooUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoncooUserMapper {

	/**
	 * 如果采用下面的注解方式：
	 * 1.不用配置mapper.xml文件了；
	 * 2.也不需要在application.yml文件中配置mapper.xml的扫描地址。
	 * @param record
	 * @return
	 */
	//@Insert(value = "insert into roncoo_user (name, create_time) values (#{name,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP})")
	int insert(RoncooUser record);

	//@Select(value = "select id, name, create_time from roncoo_user where id = #{id,jdbcType=INTEGER}")
	//@Results(value = { @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP) })
	RoncooUser selectByPrimaryKey(Integer id);
}
