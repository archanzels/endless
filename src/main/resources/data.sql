INSERT INTO USER (user_id, active, email, first_name, last_name, password,bgroup)
VALUES (1001, true , 'user@gmail.com', 'user', 'user', '$2a$04$blLlcdjPQSNeuzqoZvFDO.3wn8GyfqYkeDH21fRKcl69DpQkUNV1W','A+');
INSERT INTO USER (user_id, active, email, first_name, last_name, password,bgroup)
VALUES (1002,true , 'admin@gmail.com', 'admin', 'admin', '$2a$04$w5tT/uEMmOgcte79wScfR.m2SB3x5yWfAjO8XwRerTTHoaPgeid/e','B+');
INSERT INTO USER (user_id, active, email, first_name, last_name, password,bgroup)
VALUES (1003,true , 'user2@gmail.com', 'user2', 'user2', '$2a$04$w5tT/uEMmOgcte79wScfR.m2SB3x5yWfAjO8XwRerTTHoaPgeid/e','B+');
INSERT INTO USER (user_id, active, email, first_name, last_name, password,bgroup)
VALUES (1004,true , 'user3@gmail.com', 'user3', 'user3', '$2a$04$w5tT/uEMmOgcte79wScfR.m2SB3x5yWfAjO8XwRerTTHoaPgeid/e','B-');
INSERT INTO USER (user_id, active, email, first_name, last_name, password,bgroup)
VALUES (1005,true , 'user4@gmail.com', 'user4', 'user4', '$2a$04$w5tT/uEMmOgcte79wScfR.m2SB3x5yWfAjO8XwRerTTHoaPgeid/e','B+');
INSERT INTO USER (user_id, active, email, first_name, last_name, password,bgroup)
VALUES (1006,true , 'user5@gmail.com', 'user5', 'user5', '$2a$04$w5tT/uEMmOgcte79wScfR.m2SB3x5yWfAjO8XwRerTTHoaPgeid/e','B+');
INSERT INTO USER (user_id, active, email, first_name, last_name, password,bgroup)
VALUES (1007,true , 'user6@gmail.com', 'user6', 'user6', '$2a$04$w5tT/uEMmOgcte79wScfR.m2SB3x5yWfAjO8XwRerTTHoaPgeid/e','O+');
INSERT INTO USER (user_id, active, email, first_name, last_name, password,bgroup)
VALUES (1008,true , 'user7@gmail.com', 'user7', 'user7', '$2a$04$w5tT/uEMmOgcte79wScfR.m2SB3x5yWfAjO8XwRerTTHoaPgeid/e','O+');
INSERT INTO USER (user_id, active, email, first_name, last_name, password,bgroup)
VALUES (1000,true , 'user8@gmail.com', 'user8', 'user8', '$2a$04$w5tT/uEMmOgcte79wScfR.m2SB3x5yWfAjO8XwRerTTHoaPgeid/e','AB+');
INSERT INTO USER (user_id, active, email, first_name, last_name, password,bgroup)
VALUES (1010,true , 'user9@gmail.com', 'user9', 'user9', '$2a$04$w5tT/uEMmOgcte79wScfR.m2SB3x5yWfAjO8XwRerTTHoaPgeid/e','AB+');


INSERT INTO ROLE VALUES (2001, 'USER');
INSERT INTO ROLE VALUES (2002, 'ADMIN');
INSERT INTO ROLE VALUES (2003, 'DBA');

INSERT INTO USER_ROLE VALUES (1001, 2001);
INSERT INTO USER_ROLE VALUES (1002, 2001);
INSERT INTO USER_ROLE VALUES (1002, 2002);
INSERT INTO USER_ROLE VALUES (1002, 2003);

INSERT INTO USER_PROFILES (id, gender, bgroup,user_id)
values ('4001', 1,'A-', 1001);
INSERT INTO USER_PROFILES (id, gender,bgroup, user_id)
values ('4002', 1,'B+', 1002);

insert into request(request_id,name,bgroup)
values(5001,'Suman','A+');
insert into request(request_id,name,bgroup)
values(5002,'Sujan','B-');


insert into message(message_id,sender_name,sender_email,message)
values(6001,'ABC DEF','abac@email.com','Lorem Ipsum')