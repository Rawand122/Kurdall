package com.rawand.kurdall.kurdall;

import com.rawand.kurdall.kurdall.web.WebController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class KurdallApplicationTests {

	@Autowired
	private WebController controller;
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
