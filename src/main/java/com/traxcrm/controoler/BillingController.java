package com.traxcrm.controoler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.traxcrm.entities.billing;
import com.traxcrm.entities.contact;
import com.traxcrm.services.BillingService;
import com.traxcrm.services.ContactService;

@Controller
public class BillingController {
	@Autowired
	private ContactService contactService;
	@Autowired
	private BillingService billservice;
	
	@RequestMapping("/ganretedbill")
	public String viewBillingPage(@RequestParam("id")long id,ModelMap model) {
		contact con = contactService.findById(id);
		model.addAttribute("contact", con);
		return"create_bill";
	}
	
	@RequestMapping("/saveBill")
	public void saveBilling(@ModelAttribute("billing")billing bill) {
		      billservice.savebill(bill);
		  }
	
	@RequestMapping("/listbill")
	public String listallbills(ModelMap model) {
		 List<billing>bill=billservice.listallbills();
		model.addAttribute("billing", bill);
		
		return"billing_search_result";
	}

}
