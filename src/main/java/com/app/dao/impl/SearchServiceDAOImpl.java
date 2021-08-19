package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.app.Main;
import com.app.dao.SearchServiceDAO;
import com.app.dao.dbutil.MySqlDbConnection;
import com.app.exception.BusinessException;
import com.app.model.Customer;

public class SearchServiceDAOImpl implements SearchServiceDAO{
	private static Logger log = Logger.getLogger(SearchServiceDAOImpl.class);
	//Reg
	public int  RegisterService(Customer customer)throws BusinessException{
		int success=0;
		try(Connection connection=MySqlDbConnection.getConnection()){
			String sql="insert into customer values(?,?,?,?)";
		     PreparedStatement preparedStatement=connection.prepareStatement(sql);
		     preparedStatement.setInt(1,customer.getCust_id());
		     preparedStatement.setString(2, customer.getCust_pwd());
		     preparedStatement.setString(3, customer.getCust_name());
		     preparedStatement.setString(4, customer.getCust_email());
		   success=preparedStatement.executeUpdate();
		    log.info("Successfully Registered");
		}
		catch(ClassNotFoundException | SQLException e){
			log.error(e);
		}
		return success;
	}
	//Login
	public int LoginService(String userName,String pwd)throws BusinessException {
		int success=0;
		Customer customer=null;
		try(Connection connection=MySqlDbConnection.getConnection()){
		String sql="select cust_name from Customer where cust_name=? and cust_pwd=?";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1,userName);
		preparedStatement.setString(2, pwd);
		ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet.next()) {
			customer=new Customer();
			customer.setCust_name(resultSet.getString("cust_name"));
		}
		if(customer!=null) {success=1;}
		}
		catch(ClassNotFoundException | SQLException e){
			log.error(e);
			throw new BusinessException("Internal Error");
		}
		
		return success;
	}
	public int viewProducts()throws BusinessException{
		try(Connection connection=MySqlDbConnection.getConnection()){
			
			String sql="Select p_id,product_name,p_price,p_category from product";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				log.info("Product id |Product Name|Product price|product Category" );
				log.info(resultSet.getString("p_id")+"          | "+resultSet.getString("product_name")+"          |"+resultSet.getInt("p_price")+"          |"+resultSet.getString("p_category"));
			}
		}
		catch(ClassNotFoundException | SQLException e){
			log.error(e);
			throw new BusinessException("Internal Error");
		}
		return 1;
	}
	
}
