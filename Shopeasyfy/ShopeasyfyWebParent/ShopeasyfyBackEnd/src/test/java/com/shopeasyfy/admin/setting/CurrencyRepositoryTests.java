package com.shopeasyfy.admin.setting;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import java.util.ArrayList;
import java.util.List;

import com.shopeasyfy.entity.Currency;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE )
@Rollback(false)
public class CurrencyRepositoryTests {

	@Autowired
	private CurrencyRepository repo;
	
	@Test
	public void testCreateCurrencies() {
//		List<Currency> listCurrencies = Arrays.asList(
//				new Currency("Nepal Nepalese Rupee", "", "NPR"),
//				new Currency("Indian Rupee", "", "INR")
//				);
		
        List<Currency> listCurrencies = new ArrayList<>();
        listCurrencies.add(new Currency("Nepal Nepalese Rupee", "RS", "NPR"));
        listCurrencies.add(new Currency("Indian Rupee", "₹", "INR"));


		
		repo.saveAll(listCurrencies);
		
		Iterable<Currency> iterable = repo.findAll();
		
		assertThat(iterable).size().isEqualTo(2);
		
	}
}
