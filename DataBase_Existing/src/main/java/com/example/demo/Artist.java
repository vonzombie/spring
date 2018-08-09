package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "albums") // USING AN EXISTING DATABASE CHINOOK
public class Artist {

	@Id
	@Column(name = "AlbumId")
	private Integer albumId; // when dealing with database keys it it will always be a capital Integer
	@Column(name = "Title")
	private String title;
	@Column(name = "ArtistId")
	private Integer artistId;

	public Integer getAlbumId() {
		return albumId;
	}

	public void setAlbumId(Integer albumId) {
		this.albumId = albumId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getArtistId() {
		return artistId;
	}

	public void setArtistId(Integer artistId) {
		this.artistId = artistId;
	}

}
