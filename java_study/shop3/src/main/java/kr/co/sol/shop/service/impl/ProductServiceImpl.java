package kr.co.sol.shop.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.co.sol.shop.dao.ProductDAO;
import kr.co.sol.shop.dto.ProductDTO;
import kr.co.sol.shop.service.ProductMgrService;
@Service("ProductService")
public class ProductServiceImpl implements ProductMgrService{
	@Autowired
	ProductDAO productDao;
	@Override
	public List<ProductDTO> getProduct() {
		return productDao.getProduct();
	}
	@Override
	public int insertProduct(ProductDTO pdto, MultipartFile file) {
		String sourceFileName = file.getOriginalFilename();
		// String sourceFileNameExtension
		// = FilenameUtils.getExtension(sourceFileName).toLowerCase();
		File destinationFile;
			if(sourceFileName == null || sourceFileName.length()==0) {
				pdto.setImage("ready.gif");
			} else {
				pdto.setImage(sourceFileName);
				destinationFile = new File(pdto.getPath()+sourceFileName);
				destinationFile.getParentFile().mkdirs();
				try {
					file.transferTo(destinationFile);
				} catch (IllegalStateException e){
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return productDao.insertProduct(pdto);
	}
	@Override
	public List<ProductDTO> productUpdate() {
		// TODO Auto-generated method stub
		return null;
	}

}
