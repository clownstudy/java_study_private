package kr.co.sol.shop.dao;

import java.util.Hashtable;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.sol.shop.dto.OrderDTO;

@Mapper
public interface OrderMgrDAO {

	List<OrderDTO> getOrders(OrderDTO odto);

	int insertOrders(Hashtable<Integer, OrderDTO> hCartList);

}
