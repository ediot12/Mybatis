package spring.chap01;

public class WriteArticleServiceImpl implements WriteArticleService{
	
	private ArticleDao articleDao;
	
	public WriteArticleServiceImpl(ArticleDao articleDao){
		this.articleDao=articleDao;
	}
	
	@Override
	public void write(Article article){
		System.out.println("WriteArticleServicelmpl.write() �޼��� ����");
		articleDao.insert(article);
		
	}
	

}