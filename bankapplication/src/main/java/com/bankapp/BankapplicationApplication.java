package com.bankapp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bankapp.entities.Account;
import com.bankapp.entities.TransactionLog;
import com.bankapp.service.AccountService;

@SpringBootApplication
public class BankapplicationApplication implements CommandLineRunner{

	@Autowired
	private AccountService accountService;
	

	
	public static void main(String[] args) {
		SpringApplication.run(BankapplicationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
//		Account account1=new Account("Afreen", 67889912, "Afreen@gmailcom", 
//				"Nellore","Axis", 5000,"SAVINGS");
//		
//		
//		Account account1=new Account("Zuveriya", 67889912, "Zuvvu@gmailcom", 
//				"Nellore","Axis", 5000,"SAVINGS");
//		Account account3=new Account("Sana", 671234567, "sana@gmailcom", 
//				"Nellore","SBI", 4000, "SAVINGS");
//		
//		Account account4=new Account("Rayhan", 675612489, "rayhan@gmailcom", 
//				"Nellore","Syndicate", 8000,"SAVINGS");
//		
//		Account account5=new Account("Reehana", 671234567, "Reehu@gmailcom", 
//				"Nellore","Andhra", 5670, "CURRENT");
//		
//		
//		accountService.addCustomerAccount(account1);
//		accountService.addCustomerAccount(account2);
//		accountService.addCustomerAccount(account3);
//		accountService.addCustomerAccount(account4);
//		accountService.addCustomerAccount(account5);
		

		
	}

}
