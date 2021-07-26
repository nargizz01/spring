insert into users(id, age, full_name, password, phone_number, username)
values (1,'10','Nurdaulet','123','787','nur');

insert into role(id, name)
values (1,'ADMIN');
values (2,'USER');

insert into user_roles(user_id, role_id)
values (1,1);
values (1,2);

insert into room(id, color, is_available, model, num_sim, price, ram, storage, type)
values (1,'black','true','Samsung','2','250000','6','128',2)

