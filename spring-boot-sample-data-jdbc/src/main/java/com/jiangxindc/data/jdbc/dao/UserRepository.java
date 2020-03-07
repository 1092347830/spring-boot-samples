
package com.jiangxindc.data.jdbc.dao;

import com.jiangxindc.data.jdbc.entity.User;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author AnQi
 */
public interface UserRepository extends CrudRepository<User, Long> {

	/**
	 * 根据名字查询用户数据
	 * @param name 名字
	 * @return 用户列表
	 */
	@Query("select * from user where upper(first_name) like '%' || upper(:name) || '%' ")
	List<User> findByName(@Param("name") String name);

}
