package homework_15.hibernate.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import homework_15.hibernate.model.Comment;
import homework_15.hibernate.model.Post;

public class App {
	
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("/META-INF/hibernate.cfg.xml");

		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties())
				.buildServiceRegistry();
		Session session = config.buildSessionFactory(serviceRegistry).openSession();
		
		Post post = new Post();
		post.setTitle("Hibernate_top");

		Comment comment  = new Comment ();
		comment.setAuthorName("Misha");;
		comment.setPost(post);;

		Comment comment1  = new Comment ();
		comment1.setAuthorName("Misha2");;
		comment1.setPost(post);
		Set<Comment> comments = new HashSet<>();
		comments.add(comment);
		comments.add(comment1);

		post.setComments(comments);

		// save to DB
		Transaction transaction = session.beginTransaction();
		session.save(post);
		transaction.commit();

		// read from DB
//		Post PostDB = (Post) session.get(Post.class, 1);
//		System.out.println(PostDB + "---->" + PostDB.getComments());
//
//		Comment commentDB = (Comment) session.get(Comment.class, 2);
//		System.out.println(commentDB + "---->" + commentDB.getPost());

	}
}
