CREATE TABLE event_communities (
	id integer NOT NULL AUTO_INCREMENT,  
    community_id integer NOT NULL,
    event_id integer NOT NULL,
    PRIMARY KEY(id)
);