package com.wildcat.demo;

import com.wildcat.model.Product;
import com.wildcat.model.ProductForm;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

/**
 * Created by lixingle on 2017/6/16.
 */

@Controller
public class ProductController {

    private static final Log logger = LogFactory.getLog(ProductController.class);

    @RequestMapping(value = "/product_input")
    public String inputProduct(){
        logger.info("product_input 被调用");
        return "ProductForm";
    }

    @RequestMapping(value = "product_save")
    public String saveProduct(ProductForm productForm, Model model){
        logger.info("product_save 被调用");
        Product product = new Product();
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());
        try {
            product.setPrice(Float.parseFloat(productForm.getPrice()));
        }catch (NumberFormatException e){

        }
        model.addAttribute("product",product);
        return "ProductDetails";

    }



}
