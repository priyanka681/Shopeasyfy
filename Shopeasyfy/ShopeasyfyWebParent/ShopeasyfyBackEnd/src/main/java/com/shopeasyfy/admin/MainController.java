package com.shopeasyfy.admin;

import java.util.Locale.Category;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController{
	
	
	

	@GetMapping("/")
	public String viewHomePage() {
		return "index";
	}
	
	@GetMapping("/login")
	public String viewLoginPage() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null || authentication.getName().equals("anonymousUser")) {
			return "login";
		}
		
		return "redirect:/";
	}
	
	
	
/* 
	 @GetMapping("/home")
	 public String viewHomePage() {
		 return "index";
	 }
	 
	 @GetMapping("/login")
	 public String viewLoginPage() {
		 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		 
//			 
		 if(auth.getName().equals("anonymousUser")) {
			 return "login";
		 }
		 
		 return "redirect:/home";
	 }
	 */
//	 @GetMapping("/categories/new")
//	 public String getCategory() {
//	 return "categories";
//}
//	 @GetMapping("/category_form")
//	 public String getCategoryForm() {
//	 return "category_form";
//	 
//	 } 
//	 @GetMapping("/product_form")
//	 public String getProductForm() {
//	 return "product_form";
//	 } 
//	 @GetMapping("/products")
//	 public String getProducts() {
//	 return "products";
//	 }
//	 @GetMapping("/customers")
//	 public String getCustomers() {
//	 return "customers";
//	 }
//	 @GetMapping("/customer_detail_modal")
//	 public String getCustomerDetailModal() {
//	 return "customer_detail_modal";
//	 }
//	 @GetMapping("/orders")
//	 public String getOrders() {
//	 return "orders";
//	 }
//	 @GetMapping("/settingspayment")
//	 public String getPayment() {
//	 return "payment";
//	 }
//	 @GetMapping("/settingsgeneral")
//	 public String getSetting() {
//	 return "general";
//	 }
//	 @GetMapping("/reviews")
//	 public String getReviews() {
//	 return "reviews";
//	 }
	 }
