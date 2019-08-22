package com.yx.demo.service;

import java.util.List;

import com.yx.demo.model.ClientModel;



public interface IClientService {

	public List<ClientModel> getListByAll() throws Exception;
	
}
