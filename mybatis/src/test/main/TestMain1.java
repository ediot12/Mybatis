package test.main;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import test.vo.MembersVo;

public class TestMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String res = "config.xml";

		try {
			InputStream is = Resources.getResourceAsStream(res);
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
			SqlSession session = factory.openSession();
			List<MembersVo> list = session.selectList("member.getlist");
			for (MembersVo vo : list) {
				System.out.println("id : " + vo.getId());
				System.out.println("pwd : " + vo.getPwd());
				System.out.println("email : " + vo.getEmail());
				System.out.println("phone : " + vo.getPhone());
				System.out.println("regdate : " + vo.getRegdate());
				System.out.println();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
