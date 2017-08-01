package com.contaazul.marsexplorer.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class RobotController {
	
	@PostMapping("/mars/{command}")
	public String execute(@PathVariable String command) {
		return "(0, 0, N)";
	}
}
