CREATE database kek;

create table lol(
  id serial primary key,
  firstname varchar(50),
);

select * from users;

alter table users
    add column isadmin2 int;

alter table users
    alter column isadmin2 set data type boolean USING isadmin2::boolean;

alter table users
    alter column isadmin2 set default false;

create table tasks(
  id serial,
  name varchar(50),
  user_id int
);

drop table users;
drop database kek;