/**
 * 
 */
package com.denali.dci.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.denali.dci.model.Account;

/**
 * @author zentere
 *
 */
@RestController
@RequestMapping("/api/")
public class Api {

	private List<Account> accounts;

	protected Logger logger = Logger.getLogger(Api.class.getName());

	public Api() {
		accounts = new ArrayList<>();
		accounts.add(new Account(1, 1, "232323"));
		accounts.add(new Account(2, 2, "Ariv"));
		accounts.add(new Account(3, 3, "Test"));
		accounts.add(new Account(4, 4, "fff"));
		accounts.add(new Account(5, 1, "ffg"));
		accounts.add(new Account(6, 2, "dfdg"));
		accounts.add(new Account(7, 2, "fg"));
	}

	@RequestMapping("/accounts/{number}")
	public Account findByNumber(@PathVariable("number") String number) {
		logger.info(String.format("Account.findByNumber(%s)", number));
		return accounts.stream().filter(it -> it.getNumber().equals(number)).findFirst().get();
	}

	@RequestMapping("/accounts/customer/{customer}")
	public List<Account> findByCustomer(@PathVariable("customer") Integer customerId) {
		logger.info(String.format("Account.findByCustomer(%s)", customerId));
		return accounts.stream().filter(it -> it.getCustomerId().intValue() == customerId.intValue())
				.collect(Collectors.toList());
	}

	@RequestMapping("/accounts")
	public List<Account> findAll() {
		logger.info("Account.findAll()");
		return accounts;
	}
}
