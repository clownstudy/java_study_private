package kr.co.sol.order.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.sol.shop.dto.OrderDTO;

public interface OrderMgrService {

	List<OrderDTO> getOrders(OrderDTO odto);

}
