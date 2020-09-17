package com.stock.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.api.model.Stocks;
import com.stock.api.service.StockService;

@RestController
@RequestMapping(value="/stockQuote")
public class StockController {
	@Autowired
	StockService stockService;

	@PostMapping("/addStock")
	public int addStocks(@RequestBody Stocks s){
		return stockService.save(s);
	}
	
	
	/*@GetMapping(value="/stockQuote")
	public ResponseEntity<List> getStockDetail(@PathVariable String stockname){
		
		return null;
		
	}*/
}
