package com.springrest.springrest.services;
import com.springrest.springrest.entities.asset;
import java.util.List;
public interface assetService {
	public List<asset> getassets();

	asset addasset(asset asset);

	asset getasset(long id);

	asset updateasset(asset asset);

	void deleteasset(long parseLong);

}
