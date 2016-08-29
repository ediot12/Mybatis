package test.main;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import test.vo.MembersVo;

public class InsertMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String res = "config.xml";
		SqlSession session = null;
		try {
			InputStream is = Resources.getResourceAsStream(res);
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
			session = factory.openSession();
			MembersVo mv = new MembersVo("java", "java1", "java@java.com", "01000221122", null);
			int i = session.insert("member.addMem", mv);// memberMapper에 있는
														// member에 addMem을 가리킴
														// 파라미터타입에서 값 가져와서 때려박음

			if (i == 0) {
				System.out.println("인설트 실패");
			} else {
				System.out.println("성공");
			}
			session.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();//어지간하면 끄자
		}
	}

}
