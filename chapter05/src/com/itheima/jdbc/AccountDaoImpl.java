package com.itheima.jdbc;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class AccountDaoImpl implements AccountDao{
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{	this.jdbcTemplate = jdbcTemplate;}
	
	public int addAccount(Account account)
	{
		String sql = "insert into account(username,balance) values(?,?)";
		Object[] obj = new Object[]
				{account.getUserName(),account.getBalance()};
		int num = this.jdbcTemplate.update(sql,obj);
		return num;
	}
	public int updateAccount(Account account)
	{
		String sql = "update account set username=?,balance=? where id=?";
		Object[] params = new Object[]
				{account.getUserName(),account.getBalance(),account.getID()};
		int num = this.jdbcTemplate.update(sql,params);
		return num;
	}
	public int deleteAccount(int id)
	{
		String sql = "delete from account where id = ? ";
		int num = this.jdbcTemplate.update(sql,id);
		return num;
	}
	//查询某一ID账户信息
	public Account findAccountByID(int id) {
		String sql = "select * from account where id=?";
		RowMapper<Account> rowMapper = 
				new BeanPropertyRowMapper<Account>(Account.class);
		return this.jdbcTemplate.queryForObject(sql, rowMapper,id);
	}
	//查询所有账户信息
	public List<Account> findAllAccount(){
		String sql = "select * from account";
		RowMapper<Account> rowMapper = 
				new BeanPropertyRowMapper<Account>(Account.class);
		return this.jdbcTemplate.query(sql,rowMapper);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,readOnly=false)
	public void transfer(String outUser,String inUser,Double money) {
		this.jdbcTemplate.update("update account set balance = balance +? "+"where username = ?",money,inUser);
//		int i=1/0;	//模拟系统运行时的突发问题
		this.jdbcTemplate.update("update account set balance = balance -? "+"where username = ?",money,outUser);
	}


}
