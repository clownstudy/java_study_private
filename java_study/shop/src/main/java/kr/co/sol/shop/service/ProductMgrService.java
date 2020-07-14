package kr.co.sol.shop.service;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;
import kr.co.sol.shop.dto.ProductDTO;

public interface ProductMgrService {

	List<ProductDTO> getProduct();
	int insertProduct(ProductDTO pdto, MultipartFile file);

}
