package kr.co.sol.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sol.shop.dao.ProductDAO;
import kr.co.sol.shop.dto.ProductDTO;
import kr.co.sol.shop.service.ProductService;
@Service("ProductService")
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductDAO productDao;
	@Override
	public List<ProductDTO> getProduct() {
		return productDao.getProduct();
	}

}
