package com.itmayiedu.mapper;

import org.apache.ibatis.annotations.Insert;

import com.itmayiedu.entity.OrderEntity;

public interface OrderMapper {
	@Insert("insert order_info values (null,#{orderName},#{orderDes})")
	public int addOrder(OrderEntity OrderEntity);
}
