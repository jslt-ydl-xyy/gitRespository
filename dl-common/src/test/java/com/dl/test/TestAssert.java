package com.dl.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.dl.common.utils.AssertUtil;
import com.dl.common.utils.MyException;

public class TestAssert {
//	测试AssertUtil.isTrue()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void isTrueTest1() throws MyException{
		AssertUtil.isTrue(true,"-->true");
	}
	@Test
	public void isTrueTest2() throws MyException{
		AssertUtil.isTrue(false,"-->false");
	}
	
	
//	测试AssertUtil.isFalse()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void isFalseTest1() throws MyException{
		AssertUtil.isFalse(true, "-->true");
	}
	@Test
	public void isFalseTest2() throws MyException{
		AssertUtil.isFalse(false, "-->false");
	}
//	测试AssertUtil.notNull()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void notNullTest1() throws MyException{
		
		Object o = null;
		AssertUtil.notNull(o, "obj为空");
	}
	@Test
	public void notNullTest2() throws MyException{
		Object o ="你哈";
		AssertUtil.notNull(o, "obj不为空");
	}
//	测试AssertUtil.isNull()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void isNullTest1() throws MyException{
		Object o = null;
		AssertUtil.isNull(o, "obj为空");
	}
	@Test
	public void isNullTest2() throws MyException{
		Object o = "你好";
		AssertUtil.isNull(o, "obj不为空");
	}
//	用List对象测试AssertUtil.notEmpty()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void notEmptyTest1() throws MyException{
		List list = new ArrayList();
		AssertUtil.notEmpty(list, "coll为空");
	}
	@Test
	public void notEmptyTest2() throws MyException{
		ArrayList list = new ArrayList();
		list.add("nihoa");
		AssertUtil.notEmpty(list, "coll不为空");
	}
//	用Map对象测试AssertUtil.notEmpty()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void notEmptyTest3() throws MyException{
		Map map = new HashMap();
		AssertUtil.notEmpty(map, "map为空");
	}
	@Test
	public void notEmptyTest4() throws MyException{
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "你好");
		AssertUtil.notEmpty(map, "map不为空");
	}
//	用String对象测试AssertUtil.hasText()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void hasTextTest1() throws MyException{
		String str = " ";
		AssertUtil.hasText(str, "str长度为0");
	}
	@Test
	public void hasTextTest2() throws MyException{
		String str = "你好";
		AssertUtil.hasText(str, "str不为空");
	}
//	测试AssertUtil. greaterThanZero()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	@Test
	public void greateThanZeroTest1() throws MyException{
		BigDecimal int_value = new BigDecimal(-1);
		AssertUtil.greaterThanZero(int_value, "小于0");
		
	}
	@Test
	public void greateThanZeroTest2() throws MyException{
		BigDecimal int_value = new BigDecimal(5);
		AssertUtil.greaterThanZero(int_value, "大于0");
		
	}

}
