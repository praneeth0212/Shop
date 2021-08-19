package com.app.dao;

import com.app.exception.BusinessException;
import com.app.model.Customer;

public interface SearchServiceDAO {
	public int  RegisterService(Customer customer)throws BusinessException;
	public int LoginService(String a,String b)throws BusinessException;
	public int viewProducts()throws BusinessException;
}
