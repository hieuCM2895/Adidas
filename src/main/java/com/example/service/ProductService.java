package com.example.service;

import com.example.dao.ProductDAOImpl;
import com.example.dto.ProductDTO;
import com.example.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private ProductDAOImpl productDAO = new ProductDAOImpl();
    private ProductDTO productDTO = new ProductDTO();

    public boolean deleteProductById(int productId) {
        return productDAO.delete(productDAO.findById(Product.class, productId));
    }

    public boolean addNewProduct(Product product) {
        return productDAO.save(product);
    }

    public boolean updateProduct(Product product) {
        return productDAO.update(product);
    }

    public List<Product> findAllProduct() {

        List<Product> listOfProduct = productDAO.findAll(Product.class);
        List<Product> listOfProductDTO = new ArrayList<>();
        for (Product product : listOfProduct) {
            listOfProductDTO.add(productDTO.productDTO(product));
        }
        return listOfProductDTO;

    }

    public Product findNewProduct() {
        return productDTO.productDTO(productDAO.findNewProduct());
    }

    public Product findProductById(int productId) {
        return productDTO.productDTO(productDAO.findById(Product.class, productId));
    }

    public Product findNewProductByCategoryId(int categoryId) {
        return productDTO.productDTO(productDAO.findNewProductByCategoryId(categoryId));
    }

    public List<Product> searchProductByName(String txt) {

        List<Product> listOfProduct = productDAO.searchProductByName(txt);
        List<Product> listOfProductDTO = new ArrayList<>();
        for (Product product : listOfProduct) {
            listOfProductDTO.add(productDTO.productDTO(product));
        }
        return listOfProductDTO;

    }

    public List<Product> searchProductByAccountID(int accountId, int currentNumberPage, int pageSize) {

        List<Product> listOfProduct = productDAO.searchProductByAccountID(accountId, currentNumberPage, pageSize);
        List<Product> listOfProductDTO = new ArrayList<>();
        for (Product product : listOfProduct) {
            listOfProductDTO.add(productDTO.productDTO(product));
        }
        return listOfProductDTO;

    }

    public List<Product> searchProductByAccountID(int currentNumberPage, int pageSize) {

        List<Product> listOfProduct = productDAO.searchProductByAccountID(currentNumberPage, pageSize);
        List<Product> listOfProductDTO = new ArrayList<>();
        for (Product product : listOfProduct) {
            listOfProductDTO.add(productDTO.productDTO(product));
        }
        return listOfProductDTO;

    }

    public List<Product> searchProductByCategoryId(int categoryId ,int currentNumberPage, int pageSize) {

        List<Product> listOfProduct = productDAO.searchProductByCategoryId(categoryId, currentNumberPage, pageSize);
        List<Product> listOfProductDTO = new ArrayList<>();
        for (Product product : listOfProduct) {
            listOfProductDTO.add(productDTO.productDTO(product));
        }
        return listOfProductDTO;

    }

    public List<Product> findListProductByCategoryID(int categoryId) {

        List<Product> listOfProduct = productDAO.findListProductByCategoryID(categoryId);
        List<Product> listOfProductDTO = new ArrayList<>();
        for (Product product : listOfProduct) {
            listOfProductDTO.add(productDTO.productDTO(product));
        }
        return listOfProductDTO;

    }

    public long getNumberPage(int accountId) {
        return (long) productDAO.getNumberSellProductByAccountID(accountId);
    }

    public long getNumberPageByProduct() {
        return (long) productDAO.getNumberSellProduct();
    }

    public long getNumberPageByProduct(int categoryId) {
        return (long) productDAO.getNumberSellProductByCategory(categoryId);
    }

    public List<Product> searchProductByAmount(int amount) {

        List<Product> listOfProduct = productDAO.searchProductByAmount(amount);
        List<Product> listDTO = new ArrayList<>();
        for (Product product : listOfProduct) {
            listDTO.add(productDTO.productDTO(product));
        }
        return listDTO;

    }

    public List<Product> searchLastProductByAmount(int amount) {

        List<Product> listOfProduct = productDAO.searchLastProductByAmount(amount);
        List<Product> listDTO = new ArrayList<>();
        for (Product product : listOfProduct) {
            listDTO.add(productDTO.productDTO(product));
        }
        return listDTO;

    }

    public Object findCategoryIdByProductId(int productId) {
        return productDAO.findCategoryIdByProductId(productId);
    }

    public static void main(String[] args) {
        ProductService productService = new ProductService();
        long list = productService.getNumberPage(1);
        System.out.println(list);
    }
}
