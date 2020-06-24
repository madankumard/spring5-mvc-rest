package mk.springframework.services;

import mk.springframework.api.v1.model.CategoryDTO;
import mk.springframework.api.v1.model.CustomerDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getAllCategories();
    CategoryDTO getCategoryByName(String name);
}
