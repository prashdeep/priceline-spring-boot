
insert into user(user_id, user_name, password)
		values
        (1, 'kiran', '$2a$10$QCOXueElj1XMzqXY2PB/8OmkHQOkBK5o/RAzGpI5R4HiTur/V8TcW'),
        (2, 'vinay', '$2a$10$cLAm1dcOwXKXWKEkxwf/3uFs52ls6k4EFzlhgMnleiUKDcfxW5UFm');

insert into role (role_id, role)
     values
     (1, 'USER'),
     (2, 'ADMIN');

insert into user_roles (user_id, role_id)
    values
    (1,1),
    (2, 2);