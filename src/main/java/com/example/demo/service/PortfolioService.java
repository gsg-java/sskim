package com.example.demo.service;

import com.example.demo.model.Portfolio;
import com.example.demo.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioService {

    @Autowired
    private PortfolioRepository portfolioRepository;

    public List<Portfolio> findAll() {
        return portfolioRepository.findAll();
    }
}
