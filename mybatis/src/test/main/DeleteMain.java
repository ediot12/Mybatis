package test.main;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import test.vo.MembersVo;

public class DeleteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String res = "config.xml";
		SqlSession session = null;
		try {
			InputStream is = Resources.getResourceAsStream(res);
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
			session = factory.openSession();
			/* MembersVo mv = new MembersVo("kkk", null, null, null, null); */

			/* session.delete("member.deleteMem", mv); */
			session.delete("member.deleteMem", session.selectOne("member.getlist", "java"));

			session.commit();
		}

		catch (IOException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
