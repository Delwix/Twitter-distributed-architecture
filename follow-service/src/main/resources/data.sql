CREATE TABLE User( id bigint(20), PRIMARY KEY(id) );

INSERT INTO User(id) VALUES(1);
INSERT INTO User(id) VALUES(2);
INSERT INTO User(id) VALUES(3);
INSERT INTO User(id) VALUES(4);
INSERT INTO User(id) VALUES(5);
INSERT INTO User(id) VALUES(6);

CREATE TABLE Follow(id bigint(20) PRIMARY KEY,followee bigint(20), follower bigint(20),FOREIGN KEY (follower) REFERENCES  User(id),FOREIGN KEY (followee) REFERENCES User(id));

INSERT INTO Follow(id,follower,followee) VALUES(1,1,5);
INSERT INTO Follow(id,follower,followee) VALUES(2,6,3);
INSERT INTO Follow(id,follower,followee) VALUES(3,2,4);

