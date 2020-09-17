package com.stock.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.stock.api.model.Stocks;

public interface StockRepository extends CrudRepository<Stocks, Integer>{

}
