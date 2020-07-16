package kr.co.sol.order.service;

import java.util.Hashtable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sol.shop.dao.OrderMgrDAO;
import kr.co.sol.shop.dto.OrderDTO;

@Service("orderMgrService")
public class OrderMgrServiceImpl implements OrderMgrService {
	
	@Autowired
	OrderMgrDAO orderMgrDao;
	
	@Override
	public List<OrderDTO> getOrders(OrderDTO odto) {
		// TODO Auto-generated method stub
		return orderMgrDao.getOrders(odto);
	}
	@Override
	public int insertOrders(Hashtable<Integer, OrderDTO> hCartList) {
		return orderMgrDao.insertOrders(hCartList);
	}

}
