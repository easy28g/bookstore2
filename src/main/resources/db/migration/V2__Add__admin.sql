insert into usr (id, username, password,  active)
    values (0, 'admin', 'admin',  true);

insert into user_roles (user_id, roles)
    values (0, 'ADMIN'), (0, 'USER');


insert into usr (id, username, password,  active)
    values (1, 'user', 'user',  true);

insert into user_roles (user_id, roles)
    values (1, 'USER');



insert into usr (id, username, password,  active)
    values (2, 'admin0', 'admin0',  true);

insert into user_roles (user_id, roles)
    values (2, 'ADMIN');