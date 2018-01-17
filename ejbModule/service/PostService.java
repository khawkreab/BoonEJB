package service;

import java.util.List;

import entity.Post;

public interface PostService {
	public void insert(Post post);
	public Post findPostById(long postId);
	public void update(Post postId);
	public void delete(long postId);
	public List<Post> getAllPost();
	public List<Post> findPostName(String item1);
	public List<Post> findPostByPawnerId(long pawnerId);

}

