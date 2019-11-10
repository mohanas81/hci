package com.anas.hci;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@MybatisTest(properties = { "mybatis.type-aliases-package=org.mybatis.spring.boot.test.autoconfigure",
		"logging.level.org.springframework.jdbc=debug",
		"spring.datasource.schema=classpath:schema.sql" })
class HciApplicationTests {
	@Autowired


	@Test
	void contextLoads() {

	}

}
