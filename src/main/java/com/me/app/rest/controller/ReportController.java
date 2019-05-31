package com.me.app.rest.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.me.app.model.AoAccountInfo;
import com.me.app.service.AccountInfoService;
import com.me.app.tool.ExcelCreator;

@RestController
@RequestMapping("/api")

public class ReportController {
	@Autowired
	AccountInfoService accountService;

	@RequestMapping(value = "/report/account.rpt", method = RequestMethod.GET)
    public ResponseEntity<InputStreamResource> excelAccountsReport(@RequestParam(value = "sdate") String s, @RequestParam("edate") String e,@RequestParam("branch") String b) throws IOException 
 	{
		List<AoAccountInfo> accountsList = (List<AoAccountInfo>) accountService.getByDateBranch(s, e, b);
		
		ByteArrayInputStream in = ExcelCreator.AccountsToExcel(accountsList);
		// return IOUtils.toByteArray(in);
		
		HttpHeaders headers = new HttpHeaders();
		    headers.add("Content-Disposition", "attachment; filename=accounts.xlsx");
		    headers.add("Content-Type", "application/vnd.ms-excel; charset=utf-8");
		  return ResponseEntity
          .ok()
          .headers(headers)
          .body(new InputStreamResource(in));
    }

}
