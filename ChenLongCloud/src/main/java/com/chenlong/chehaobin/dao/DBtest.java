package com.chenlong.chehaobin.dao;

import java.io.IOException;
import java.io.InputStream;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.chenlong.chehaobin.entity.Role;

public class DBtest {

	public static void main(String[] args) throws IOException {
		  String resource = "conf.xml";
	      // 读取配置文件
	      InputStream inputStream = Resources.getResourceAsStream(resource);
	      // 构建sqlSessionFactory
	      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	      // 获取sqlSession
	      SqlSession sqlSession = sqlSessionFactory.openSession();
	      try {
	         // 操作CRUD，第一个参数：指定statement，规则：命名空间+“.”+statementId
	         // 第二个参数：指定传入sql的参数：这里是用户id
	    	  List<Role> list = sqlSession.selectList("role.selectAllRole");
	         System.out.println(list.get(0).getRole_nam());
	         System.out.println(list.get(1).getRole_nam());
	         System.out.println(list.get(2).getRole_nam());
	         System.out.println(list.get(3).getRole_nam());
	         System.out.println("___________________________"); 
	         Map<String, Object> map2 = new HashMap<String, Object>();
	         map2.put("role_ID1","0000");
	         map2.put("role_ID2","001a");
	         List<Role> list2 = sqlSession.selectList("role.selectRoleByID",map2);
	        
	         
	         for(int n=0;n<list2.size();n++) {
	        	System.out.println(list2.get(n).getRole_nam()); 
	         }
	         
	         
	      } finally {
	         sqlSession.close();
	      }

}
}


/**
 * 多参数查询MAP封装  配置文件属性parameterType="hashmap";mybatis方法使用;key与parameter对应
 * 
 * 
 **/
