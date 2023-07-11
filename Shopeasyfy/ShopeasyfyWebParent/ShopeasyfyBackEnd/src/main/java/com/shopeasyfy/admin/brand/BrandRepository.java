//package com.shopeasyfy.admin.brand;
//
//import org.springframework.data.repository.PagingAndSortingRepository;
//
//import com.shopeasyfy.entity.Brand;
//import com.shopeasyfy.entity.Category;
//
//public interface BrandRepository extends PagingAndSortingRepository<Brand, Integer> {
//
//	
//public Long countById(Integer id);
//	
//	public Category findByName(String name);
//	
//	public Category findByAlias(String alias);
//}

package com.shopeasyfy.admin.brand;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import com.shopeasyfy.admin.paging.SearchRepository;
import com.shopeasyfy.entity.Brand;

public interface BrandRepository extends SearchRepository<Brand, Integer> {
	
	public Long countById(Integer id);
	
	public Brand findByName(String name);
	
	@Query("SELECT b FROM Brand b WHERE b.name LIKE %?1%")
	public Page<Brand> findAll(String keyword, Pageable pageable);
	
	@Query("SELECT NEW Brand(b.id, b.name) FROM Brand b ORDER BY b.name ASC")
	public List<Brand> findAll();
}
