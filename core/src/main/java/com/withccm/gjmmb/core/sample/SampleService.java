package com.withccm.gjmmb.core.sample;

import org.springframework.stereotype.Service;

@Service
public class SampleService {

	public SampleData getData(Integer id) {
		return SampleData.builder().id(id).value("sample-data [" + id + "]").build();
	}
}
