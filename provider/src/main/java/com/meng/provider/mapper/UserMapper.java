package com.meng.provider.mapper;

import com.meng.provider.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description:User Dao接口
 *
 * @Date Create on 2019-12-08 17:51:14
 * @author <a href="mailto:mengqingcai@lendchain.vip">mengqingcai</a>
 */
@Repository
public interface UserMapper {

	/**
	 * 将数据插入到数据库
	 *
	 * @param user
	 * @return 返回成功新增的个数
	 */
	int insertUser(User user);

	/**
	 * 根据ID修改数据
	 *
	 * @param user
	 * @return 返回成功修改记录的个数
	 */
	int updateUserById(User user);

	/**
	 * 根据ID查询数据
	 *
	 * @param id
	 * @return 返回成功查询记录
	 */
	User selectUserById(Integer id);

	/**
	 * 根据条件查询数据
	 * 
	 * @param user
	 * @return 返回查询的记录列表
	 */
	List<User> selectUserListByCond(User user);

	/**
	 * 根据条件查询数据的条数
	 * 
	 * @param user
	 * @return 返回查询的记录条数
	 */
	 Integer selectUserCntByCond(User user);

}

