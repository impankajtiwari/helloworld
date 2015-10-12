package com.pankajtiwari.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pankajtiwari.dao.entities.Agency;
import com.pankajtiwari.services.interfaces.IAgencyService;

/**
 * @author pankajtiwari
 */
@RestController
@RequestMapping("/process")
public class MainController {
	
	@Autowired
	private IAgencyService agencyService;

	/**
	 * @param name
	 * @return
	 */
	@RequestMapping(value="/mtadata",produces=MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public @ResponseBody Map<String,List<Agency>> processMTAData(@RequestParam(value = "city", required = false, defaultValue = "SANDIEGO") String cityName) {
		System.out.println("Processing for City:"+cityName);
		Map<String,List<Agency>> map=new HashMap<String, List<Agency>>();
		List<Agency> list=agencyService.fetchAllAgencies();
		map.put("result", list);
		return map;
	}
}
