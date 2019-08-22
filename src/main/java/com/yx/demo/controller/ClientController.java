package com.yx.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yx.demo.model.ClientModel;
import com.yx.demo.service.IClientService;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	private IClientService cs;
	
	@RequestMapping("/getListByAll")
	public List<ClientModel> getListByAll() throws Exception{
		return cs.getListByAll();
	}
}
