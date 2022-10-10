package com.traxcrm.controoler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.traxcrm.entities.contact;
import com.traxcrm.services.ContactService;



@Controller
public class ContactController {
	@Autowired
	private ContactService contactService;
	@RequestMapping("/listcon")
		public String getAllContacts(ModelMap model) {
			List<contact>contacts=contactService.listAll();
			model.addAttribute("contacts",contacts);
	return"contact_search_result";
	   }
	@RequestMapping("/getContactByid")
	public String getcontactById(@RequestParam("id")long id,ModelMap model) {
		contact contact = contactService.findById(id);
		model.addAttribute("con", contact);
		return"contact_info";
	}

}
