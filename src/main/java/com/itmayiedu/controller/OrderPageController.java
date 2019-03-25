package com.itmayiedu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itmayeidu.ext.ExtApiIdempotent;
import com.itmayeidu.ext.ExtApiToken;
import com.itmayeidu.utils.ConstantUtils;
import com.itmayeidu.utils.RedisToken;
import com.itmayiedu.entity.OrderEntity;
import com.itmayiedu.mapper.OrderMapper;

@Controller
public class OrderPageController {
	@Autowired
	private OrderMapper orderMapper;
	@Autowired
	private RedisToken redisToken;

	@RequestMapping("/indexPage")
	@ExtApiToken
	public String indexPage(HttpServletRequest req) {
		return "indexPage";
	}

	@RequestMapping("/addOrderPage")
	@ExtApiIdempotent(type = ConstantUtils.EXTAPIFROM)
	public String addOrder(OrderEntity orderEntity) {
		int addOrder = orderMapper.addOrder(orderEntity);
		return addOrder > 0 ? "success" : "fail";
	}

}
