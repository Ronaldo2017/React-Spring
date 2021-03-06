package com.nossacriacao.nossacriacao.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {

	// faz a referencia para o Movie e User(associacao das chaves primarias)
	@EmbeddedId
	private ScorePK id = new ScorePK();
	private Double value;

	public Score() {
	}

	// salva a referencia do filme com o score
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}

	public void setUser(User user) {
		id.setUser(user);
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

}
