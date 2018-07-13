INSERT INTO USER (user_id, active, email, first_name, last_name, password,bgroup,location,lat,lng,dist)
VALUES (1001, true , 'user@gmail.com', 'user', 'user', '$2a$04$blLlcdjPQSNeuzqoZvFDO.3wn8GyfqYkeDH21fRKcl69DpQkUNV1W','A+','Gwarko,Lalitpur',27.6663423,85.3330053,0);
INSERT INTO USER (user_id, active, email, first_name, last_name, password,bgroup,location,lat,lng,dist)
VALUES (1002,true , 'admin@gmail.com', 'admin', 'admin', '$2a$04$w5tT/uEMmOgcte79wScfR.m2SB3x5yWfAjO8XwRerTTHoaPgeid/e','B+','Lubhu,Lalitpur',27.641683,85.378915,0);
INSERT INTO USER (user_id, active, email, first_name, last_name, password,bgroup,location,lat,lng,dist)
VALUES (1003,true , 'user2@gmail.com', 'user2', 'user2', '$2a$04$w5tT/uEMmOgcte79wScfR.m2SB3x5yWfAjO8XwRerTTHoaPgeid/e','B+','Siddhapokhari,Bhaktapur',27.6719895,85.42030729999999,0);
INSERT INTO USER (user_id, active, email, first_name, last_name, password,bgroup,location,lat,lng,dist)
VALUES (1004,true , 'user3@gmail.com', 'user3', 'user3', '$2a$04$w5tT/uEMmOgcte79wScfR.m2SB3x5yWfAjO8XwRerTTHoaPgeid/e','B-','Pokhara',28.237987,83.995588,0);
INSERT INTO USER (user_id, active, email, first_name, last_name, password,bgroup,location,lat,lng,dist)
VALUES (1005,true , 'user4@gmail.com', 'user4', 'user4', '$2a$04$w5tT/uEMmOgcte79wScfR.m2SB3x5yWfAjO8XwRerTTHoaPgeid/e','B+','Lokanthali,Bhaktapur',27.6738134,85.35948499999999,0);
INSERT INTO USER (user_id, active, email, first_name, last_name, password,bgroup,location,lat,lng,dist)
VALUES (1006,true , 'user5@gmail.com', 'user5', 'user5', '$2a$04$w5tT/uEMmOgcte79wScfR.m2SB3x5yWfAjO8XwRerTTHoaPgeid/e','B+','Tansen,Palpa',27.861901,83.5443287,0);
INSERT INTO USER (user_id, active, email, first_name, last_name, password,bgroup,location,lat,lng,dist)
VALUES (1007,true , 'user6@gmail.com', 'user6', 'user6', '$2a$04$w5tT/uEMmOgcte79wScfR.m2SB3x5yWfAjO8XwRerTTHoaPgeid/e','O+','Kalanki,Kathmandu',27.6931052,85.28065389999999,0);
INSERT INTO USER (user_id, active, email, first_name, last_name, password,bgroup,location,lat,lng,dist)
VALUES (1008,true , 'user7@gmail.com', 'user7', 'user7', '$2a$04$w5tT/uEMmOgcte79wScfR.m2SB3x5yWfAjO8XwRerTTHoaPgeid/e','O+','Sallaghari,Bhaktapur',27.6717628,85.4078902,0);
INSERT INTO USER (user_id, active, email, first_name, last_name, password,bgroup,location,lat,lng,dist)
VALUES (1000,true , 'user8@gmail.com', 'user8', 'user8', '$2a$04$w5tT/uEMmOgcte79wScfR.m2SB3x5yWfAjO8XwRerTTHoaPgeid/e','AB+','Koteshwor,Kathmandu',27.6755549,85.3459238,0);
INSERT INTO USER (user_id, active, email, first_name, last_name, password,bgroup,location,lat,lng,dist)
VALUES (1010,true , 'user9@gmail.com', 'user9', 'user9', '$2a$04$w5tT/uEMmOgcte79wScfR.m2SB3x5yWfAjO8XwRerTTHoaPgeid/e','AB+','Pokhara',28.237987,83.995588,0);
INSERT INTO USER (user_id, active, email, first_name, last_name, password,bgroup,location,lat,lng,dist)
VALUES (1011,true , 'user5@gmail.com', 'user5', 'user5', '$2a$04$w5tT/uEMmOgcte79wScfR.m2SB3x5yWfAjO8XwRerTTHoaPgeid/e','B+','New Road,Kathmandu',27.70346,85.3113552,0);


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

insert into request(request_id,first_name,last_name,bgroup,address,posted_date,required_date)
values(5001,'Suman','Shrestha','A+','Lubhu','2018-07-9','2018-07-14');
insert into request(request_id,first_name,last_name,bgroup,address,posted_date,required_date)
values(5002,'Sujan','Acharya','B+','Thimi','2018-07-9','2018-07-12');
insert into request(request_id,first_name,last_name,bgroup,address,posted_date,required_date)
values(5003,'Suyoj','Tamrakar','B-','Mahabauddha','2018-07-13','2018-07-13');
insert into request(request_id,first_name,last_name,bgroup,address,posted_date,required_date)
values(5004,'Surya','Khanal','O-','Butwal','2018-07-12','2018-07-13');

values(6001,'ABC DEF','abac@email.com','Lorem Ipsum')