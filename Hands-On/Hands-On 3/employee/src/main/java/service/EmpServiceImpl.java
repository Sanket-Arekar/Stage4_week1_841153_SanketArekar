package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import application.Dao.DaoImpl;

import model.Employee;

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	DaoImpl accountDao;
	
	public EmpServiceImpl() {
		accountDao=new DaoImpl();
	}
    @Transactional
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return accountDao.getAllEmployee();
	}
	
	


}
