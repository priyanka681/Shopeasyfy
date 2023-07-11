package com.shopeasyfy.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan({"com.shopeasyfy.entity", "com.shopeasyfy.admin.user","com.shopeasyfy.admin.paging"})

public class ShopeasyfyBackEnd {

	public static void main(String[] args) {
		SpringApplication.run(ShopeasyfyBackEnd.class, args);
	}

}

