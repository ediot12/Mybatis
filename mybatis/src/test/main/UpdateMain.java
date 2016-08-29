package test.main;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import test.vo.MembersVo;

public class UpdateMain {

	public static void main(String args[]) {

		String res = "config.xml";
		SqlSession session = null;
		try {
			InputStream is = Resources.getResourceAsStream(res);
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
			session = factory.openSession();
			MembersVo mv = new MembersVo("kkk", "1212", "starkcb123@naver.com", "01067479197", null);
			int i = session.update("member.updateMem", mv);
			/*session.selectOne("member.updateMem", mv);*/
			/*session.update("member.updateMem", session.selectOne("member.getlist"));*/
			if (i == 0) {
				System.out.println("실패했음");
			} else {
				System.out.println("성공");
			}
			/*session.update("member.updateMem", session.selectOne("member.getlist", mv));*/
			session.commit();
		}

		catch (IOException e) {
			e.printStackTrace();
		} finally {

			session.close();
		}
	}

}
