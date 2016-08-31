package spring.chap01;

public class MySQLArticleDAO implements ArticleDao{

	@Override
	public void insert(Article article){
		System.out.println("MySQLArticleDao.insert() ½ÇÇà");
	}

}
