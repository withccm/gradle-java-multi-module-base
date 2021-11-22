package com.withccm.gjmmb.api.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.withccm.gjmmb.core.sample.SampleData;
import com.withccm.gjmmb.core.sample.SampleService;

@RestController
public class ApiSampleController {

	@Autowired
	private SampleService sampleService;

	@GetMapping("/sample/{id}")
	public SampleData getSample(@PathVariable Integer id) {
		return sampleService.getData(id);
	}
}
