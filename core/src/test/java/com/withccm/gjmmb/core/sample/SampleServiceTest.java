package com.withccm.gjmmb.core.sample;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SampleServiceTest {

	@Autowired
	private SampleService sampleService;

	@Test
	public void test() {
		// given
		Integer id = 1;

		// when
		SampleData result = sampleService.getData(id);

		// then
		assertThat(result.getId()).isEqualTo(id);
	}
}
