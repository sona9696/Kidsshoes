package com.niit.TwinkleShoes.dao;

import com.niit.TwinkleShoes.model.UserOrder;

public interface OrderDAO {
	void addOrder(UserOrder userOrder);
    double getOrderGrandTotal(int cartId);
}


