package cn.iteast.ssm.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.iteast.ssm.po.Items;
import cn.iteast.ssm.po.ItemsExample;
import cn.iteast.ssm.po.ItemsExample.Criteria;

public class ItemsMapperTest {

	private ApplicationContext applicationContext;
	private ItemsMapper itemsMapper;
	@Before
	public void setUp() throws Exception {
		applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		itemsMapper=(ItemsMapper)applicationContext.getBean("itemsMapper");
	}

	@Test
	public void testDeleteByPrimaryKey() {
		int i=itemsMapper.deleteByPrimaryKey(3);
		System.out.println(i);
	}

	@Test
	public void testInsert() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByExample() {
		ItemsExample itemsExample=new ItemsExample();
		ItemsExample.Criteria criteria=itemsExample.createCriteria();
		criteria.andNameEqualTo("pen");
		List<Items> list=itemsMapper.selectByExample(itemsExample);
		System.out.println(list);
		
	}

	@Test
	public void testSelectByPrimaryKey() {
		Items items=itemsMapper.selectByPrimaryKey(1);
		System.out.println(items);
	}

	@Test
	public void testUpdateByPrimaryKey() {
		//传入数据不为空才更新，在批量更新中使用此方法
		//itemsMapper.updateByPrimaryKeySelective(record);
	}

}
