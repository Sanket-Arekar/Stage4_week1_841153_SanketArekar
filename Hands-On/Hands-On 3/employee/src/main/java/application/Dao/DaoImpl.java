package application.Dao;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Employee;
import application.repository.EmployeeRepository;

/*Class for managing all the operation this is  class for implementing dao*/
@Repository
public class DaoImpl implements Dao{
	@Autowired
	private EmployeeRepository userRepo;
	
	
	
//***********************************************Function for getting all the account details***************************************************************************************************
	public List<Employee> getAllEmployee() {

		return userRepo.findAll();
	}
//****************************************************End of getAll function*****************************************************************************************
	

//****************************************************Function for creating account*****************************************************************************************
//	
//	public String createAccount(Employee user) {
//		try {
//		Optional<Employee> optionalAccountUser = userRepo.findById(user.getAccountNo());
//		Employee accountUser = optionalAccountUser.get();
//		if (accountUser != null) {
//			return "Account Number Already exists. Please try another account number or login !!";
//		}
//		return "error while creating account";
//		}catch(Exception e) {
//			userRepo.save(user);
//			 return "Account Created Successfully";
//		}
//		 
//
//	}
////****************************************************End of Create Account function*****************************************************************************************
//
////****************************************************Function for updating account*****************************************************************************************
//	
//	public Employee updateAccount(Employee user) {
//		try {
//			Optional<Employee> optionalAccountUser = userRepo.findById(user.getAccountNo());
//			Employee accountUser = optionalAccountUser.get();
//			if (accountUser != null) {
//				//user.setBalance(accountUser.getBalance());
//				accountUser.setPin(user.getPin());
//				return userRepo.save(accountUser);
//			} else {
//				throw new UserAccountWithNumberNotFoundException();
//			}
//		} catch (Exception e) {
//				System.out.println(e.getClass());
//			return null;
//		}
//
//	}
////****************************************************End of Update account function*****************************************************************************************
//	
//
//
//	
//
////****************************************************Function for get account by id*****************************************************************************************
//	
//	public Employee getAccountById(String number) {
//		try {
//			Optional<Employee> optionalAccountUser = userRepo.findById(number);
//			Employee user = optionalAccountUser.get();
//			if (user != null) {
//				return user;
//			} else {
//				throw new UserAccountWithNumberNotFoundException();
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			return null;
//		}
	}
//****************************************************End of get Account by id function*****************************************************************************************
	
	




