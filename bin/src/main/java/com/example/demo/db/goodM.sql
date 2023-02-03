SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS diary_board;
DROP TABLE IF EXISTS like_list;
DROP TABLE IF EXISTS reply;
DROP TABLE IF EXISTS general_board;
DROP TABLE IF EXISTS info_board;
DROP TABLE IF EXISTS map;
DROP TABLE IF EXISTS test_result;
DROP TABLE IF EXISTS users;




/* Create Tables */

CREATE TABLE diary_board
(
	did int NOT NULL AUTO_INCREMENT,
	uid varchar(20) NOT NULL,
	title varchar(128) NOT NULL,
	content varchar(128),
	modtime datetime NOT NULL,
	isDeleted int NOT NULL,
	files varchar(100),
	PRIMARY KEY (did)
);


CREATE TABLE general_board
(
	genBid int NOT NULL AUTO_INCREMENT,
	uid varchar(20) NOT NULL,
	title varchar(128) NOT NULL,
	content varchar(128),
	modtime datetime DEFAULT CURRENT_TIMESTAMP NOT NULL,
	viewCount int DEFAULT 0 NOT NULL,
	replyCount int DEFAULT 0 NOT NULL,
	isDeleted int DEFAULT 0 NOT NULL,
	files varchar(100),
	PRIMARY KEY (genBid)
);


CREATE TABLE info_board
(
	infoBid int NOT NULL AUTO_INCREMENT,
	uid varchar(20) NOT NULL,
	title varchar(128) NOT NULL,
	content varchar(128),
	modtime datetime DEFAULT CURRENT_TIMESTAMP NOT NULL,
	viewCount int DEFAULT 0 NOT NULL,
	isDeleted int DEFAULT 0 NOT NULL,
	files varchar(100),
	PRIMARY KEY (infoBid)
);


CREATE TABLE like_list
(
	likeCount int DEFAULT 0 NOT NULL,
	uid varchar(20) NOT NULL,
	genBid int NOT NULL,
	infoBid int NOT NULL,
	PRIMARY KEY (likeCount)
);


CREATE TABLE map
(
	hid int NOT NULL,
	orgName varchar(50) NOT NULL,
	orgType varchar(40) NOT NULL,
	addr varchar(100) NOT NULL,
	homepage varchar(200),
	PRIMARY KEY (hid)
);


CREATE TABLE reply
(
	rid int NOT NULL AUTO_INCREMENT,
	content varchar(128) NOT NULL,
	regDate datetime DEFAULT CURRENT_TIMESTAMP NOT NULL,
	isMine int NOT NULL,
	uid varchar(20) NOT NULL,
	genBid int NOT NULL,
	PRIMARY KEY (rid)
);


CREATE TABLE test_result
(
	uid varchar(20) NOT NULL,
	result varchar(200) NOT NULL
);


CREATE TABLE users
(
	uid varchar(20) NOT NULL,
	pwd char(60) NOT NULL,
	uname varchar(20) NOT NULL,
	email varchar(32),
	regDate date DEFAULT (CURRENT_DATE),
	isDeleted int DEFAULT 0 NOT NULL,
	PRIMARY KEY (uid)
);



/* Create Foreign Keys */

ALTER TABLE like_list
	ADD FOREIGN KEY (genBid)
	REFERENCES general_board (genBid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE reply
	ADD FOREIGN KEY (genBid)
	REFERENCES general_board (genBid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE like_list
	ADD FOREIGN KEY (infoBid)
	REFERENCES info_board (infoBid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE diary_board
	ADD FOREIGN KEY (uid)
	REFERENCES users (uid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE general_board
	ADD FOREIGN KEY (uid)
	REFERENCES users (uid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE like_list
	ADD FOREIGN KEY (uid)
	REFERENCES users (uid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE reply
	ADD FOREIGN KEY (uid)
	REFERENCES users (uid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE test_result
	ADD FOREIGN KEY (uid)
	REFERENCES users (uid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



