package com.meng.provider.entity;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @Description:User 实体类
 *
 * @Date Create on 2019-12-08 17:51:14
 * @author <a href="mailto:mengqingcai@lendchain.vip">mengqingcai</a>
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
	/**
	*主键id
	*/
	private Integer id;

	/**
	*用户名
	*/
	private String username;

	/**
	*密码
	*/
	private String passwork;

	/**
	*创建时间
	*/
	private Date gmtCreate;

	/**
	*修改时间
	*/
	private Date gmtModify;

	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
	}

}

