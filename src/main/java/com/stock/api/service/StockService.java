package com.stock.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.api.model.Stocks;
import com.stock.api.repository.StockRepository;

@Service
public class StockService {
@Autowired
StockRepository repository;

public int save(Stocks s){
	 repository.save(s);
	return s.getId();
}

}
