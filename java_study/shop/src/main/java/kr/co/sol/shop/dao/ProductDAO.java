package kr.co.sol.shop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.sol.shop.dto.ProductDTO;
@Mapper
public interface ProductDAO {


	List<ProductDTO> getProduct();

	int insertProduct(ProductDTO pdto);

}
