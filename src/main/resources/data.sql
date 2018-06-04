INSERT INTO USER (user_id, active, email, first_name, last_name, password)
VALUES (1001, true , 'user@gmail.com', 'user', 'user', '$2a$04$blLlcdjPQSNeuzqoZvFDO.3wn8GyfqYkeDH21fRKcl69DpQkUNV1W');
INSERT INTO USER
VALUES (1002,true , 'admin@gmail.com', 'admin', 'admin', '$2a$04$w5tT/uEMmOgcte79wScfR.m2SB3x5yWfAjO8XwRerTTHoaPgeid/e');

INSERT INTO ROLE VALUES (2001, 'USER');
INSERT INTO ROLE VALUES (2002, 'ADMIN');
INSERT INTO ROLE VALUES (2003, 'DBA');

INSERT INTO USER_ROLE VALUES (1001, 2001);
INSERT INTO USER_ROLE VALUES (1002, 2001);
INSERT INTO USER_ROLE VALUES (1002, 2002);
INSERT INTO USER_ROLE VALUES (1002, 2003);

INSERT INTO USER_PROFILES (id, gender, user_id)
values ('4001', 1, 1001);
INSERT INTO USER_PROFILES (id, gender, user_id)
values ('4002', 1, 1002);

insert into request(request_id,name)
values(5001,'Suman');
insert into request(request_id,name)
values(5002,'Rat');
