package service;

import java.util.List;

import entity.Timepiece;

public interface TimepieceService {
	public void insert(Timepiece timepiece);
	public Timepiece findTimepieceById(long timepieceId);
	public void update(Timepiece timepiece);
	public void delete(long timepieceId);
	public List<Timepiece> getAllTimepiece();
	public List<Timepiece> findTimepieceName(String timepiecename);
	public List<Timepiece> findTimepieceByPawnerId(long pawnerId);

}

