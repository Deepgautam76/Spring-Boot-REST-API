package com.deepalien.teluskoApp.Services;

import com.deepalien.teluskoApp.Model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class Service {

    //This is the service class
    //This is the temprary data for application
    List<Product> products=new ArrayList<>(Arrays.asList(
            new Product(101,"Iphone",40000),
            new Product(102,"vivo",20000),
            new Product(103,"One plus",30000)
    ));
    public List<Product> getProduct() {
        return products;
    }

    public Product getProductById(int prodId){
        return products.stream()
                .filter(a->a.getProdId()==prodId)
                .findFirst().orElse(new Product(100,"No product",0));
    }

    public void updateById(int prodId,Product prod) {
        int index=-1;
        for(int i=0; i<products.size(); i++){
            if(products.get(i).getProdId()==prodId){
                index=i;
                break;
            }
        }
        products.remove(index);
        products.add(index,prod);
    }

    public void deleteById(int prodId) {
      int index=-1;
      for(int i=0; i<products.size(); i++){
          if(products.get(i).getProdId()==prodId){
              index=i;
              break;
          }
      }
      products.remove(index);
    }
    public Product addProduct(Product prod) {
         products.add(prod);
         return prod;
    }
}
