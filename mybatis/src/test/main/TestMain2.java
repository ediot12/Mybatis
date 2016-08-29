package test.main;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMain2 {

	public static void main(String args[]) {
		String res = "config.xml";
		SqlSession session = null;
		try {
			InputStream is = Resources.getResourceAsStream(res);
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
			session = factory.openSession();
			Map<String,Object> map = session.selectMap("member.getlist", "java");
			Iterator<String> keys  = map.keySet().iterator();
			while(keys.hasNext()){
				System.out.println("¤¾¤·");
			}
			
						
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		finally{
			session.close();
		}
		

	}

}
