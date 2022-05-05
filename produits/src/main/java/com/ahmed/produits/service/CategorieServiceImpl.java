package com.ahmed.produits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmed.produits.entities.Categorie;
import com.ahmed.produits.repos.CategorieRepository;

@Service
public class CategorieServiceImpl implements CategorieService {
	@Autowired
	CategorieRepository categorieRepository;

	
	
	@Override
	public List<Categorie> getAllCategories() {
		return categorieRepository.findAll();
	}

}
