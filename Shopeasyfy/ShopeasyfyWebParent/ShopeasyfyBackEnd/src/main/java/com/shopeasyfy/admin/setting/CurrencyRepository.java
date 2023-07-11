package com.shopeasyfy.admin.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.shopeasyfy.entity.Currency;


public interface CurrencyRepository extends CrudRepository<Currency, Integer> {

	List<Currency> findAllByOrderByNameAsc();

	
}
