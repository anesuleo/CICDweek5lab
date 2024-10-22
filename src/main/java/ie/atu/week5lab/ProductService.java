package ie.atu.week5lab;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ProductService {
    private List<Product> myList = new ArrayList<>();
    public List<Product> addProduct(Product product)
    {
        //Do business stuff like retrieving details from db, or generating files pdfs
        myList.add(product);
        return myList;
    }
    public List<Product> updateProduct(Product product, int id)
    {
        for (Product p : myList) {
            if (Objects.equals(p.getId(), id)) {
                p.setName(product.getName());
                p.setPrice(product.getPrice());
            }
        }
        return myList;
    }

    public List<Product> deleteProduct(Product product, int id)
    {
        for (Product p : myList){
            if(Objects.equals(p.getId(), id)){
                myList.remove(p);
            }
        }
        return myList;
    }


}
