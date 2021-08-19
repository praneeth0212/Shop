package com.app.search.service.impl;

import com.app.dao.SearchServiceDAO;
import com.app.dao.impl.SearchServiceDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Customer;
import com.search.service.SearchService;

public class SearchServiceImpl implements SearchService {
	private SearchServiceDAO searchServiceDAO=new SearchServiceDAOImpl();
	public int  RegisterService(Customer customer)throws BusinessException{
		int success=0;
		
		if(customer!=null) {
			 success=searchServiceDAO.RegisterService(customer);
		}
		return success;
	}
	public int LoginService(String customerId,String customerPwd) throws BusinessException{
		int success=0;
	
		success=searchServiceDAO.LoginService(customerId,customerPwd);
		return success;
		}
}