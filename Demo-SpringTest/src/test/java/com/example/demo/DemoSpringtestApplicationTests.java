package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @RunWith()是用于指定junit运行环境，是junit提供给其他框架测试环境的接口扩展，spring依赖注入，
 * spring提供了org.springframework.test.context.junit4.SpringJUnit4ClassRunner作为junit测试环境
 *@ContextConfiguration导入配置文件
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes ={MyConfig.class})
@ActiveProfiles("dev")
@SpringBootTest
public class DemoSpringtestApplicationTests {

	@Autowired
	private TestBean testBean;

		@Test
		public void equlaBean(){
           String content = testBean.getContext();
           //判断是否相等
			Assert.assertEquals("dev",content);
		}

}
