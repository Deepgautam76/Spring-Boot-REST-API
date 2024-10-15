package com.deepalien.teluskoApp.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//This is the model of the data
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private  int prodId;
    private String prodName;
    private int prodPrice;


}
