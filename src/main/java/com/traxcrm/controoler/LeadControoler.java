package com.traxcrm.controoler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.traxcrm.entities.Lead;
import com.traxcrm.entities.contact;
import com.traxcrm.services.ContactService;
import com.traxcrm.services.LeadService;

@Controller
public class LeadControoler {
	@Autowired
	private LeadService leadService;
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/cd")
	public String viewLeadPage() {
		return "view_lead_page";
	}
	@RequestMapping("/savelead")
	public String saveOneLead(@ModelAttribute("lead")Lead lead ,ModelMap model) {
		leadService.SaveLead(lead);
		model.addAttribute("lead", lead);
		return"lead_info";
	}
	@RequestMapping("/convertlead")
	public String convertLead(@RequestParam("id")long id,ModelMap model) {
		Lead lead = leadService.getLeadById(id);
		System.out.println(lead.getId());
		contact con=new contact();
		con.setFirstname(lead.getFirstname());
		con.setLastname(lead.getLastname());
		con.setEmail(lead.getEmail());
		con.setMobile(lead.getMobile());
		con.setLeadsource(lead.getLeadsource());
		con.setGender(lead.getGender());
		contactService.saveContact(con);
		List<contact>contacts=contactService.listAll();
		model.addAttribute("contacts",contacts);
		
		leadService.deleteOneLead(id);
		return"contact_search_result";
	}
	
	@RequestMapping("/listall")
	public String getAllLeads(ModelMap model)
	{
		List<Lead>Leads=leadService.listAll();
		model.addAttribute("leads", Leads);
		return"lead_serch_result";
	}
	
	@RequestMapping("/getLeadByid")
	public String getLeadByid(@RequestParam("id")long id,ModelMap model) {
		Lead lead = leadService.getLeadById(id);
		model.addAttribute("lead", lead);
		return"lead_info";
		
}
	
	//@RequestMapping("/listcon")
	//public String getAllContacts(ModelMap model) {
		//List<contact>contacts=contactService.listAll();
		//model.addAttribute("contacts",contacts);
	//	return"contact_search_result";
   //}
}
