package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.assetDao;
import com.springrest.springrest.entities.asset;

@Service
public class assetServiceImpl implements assetService {
	
	@Autowired
	private assetDao assetDao;
	
//	List<asset> list;
	
	public assetServiceImpl(){
		
		
//		list = new ArrayList<>();
//		list.add(new asset(145,"java","this is for java"));
//		list.add(new asset(14,"java","this is for java"));	
//		list.add(new asset(144,"java","this is for java"));
		
	}
	@Override
	public List<asset> getassets() {
		// TODO Auto-generated method stub
		return assetDao.findAll();
	}
	@Override
	public asset getasset(long id){
		return assetDao.getOne(id);
	}
	@Override
	public asset addasset(asset asset) {
		assetDao.save(asset);
		return asset;
	}
	@Override
	public asset updateasset(asset asset) {
		assetDao.save(asset);
		return asset;
	}
	@Override
	public void deleteasset(long parseLong) {
		asset entity = assetDao.getOne(parseLong);
		assetDao.delete(entity);
	}

}
