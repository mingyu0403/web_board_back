use web02board;

drop table if exists post;
drop table if exists user;

create table user(
  id bigint primary key auto_increment,
  account varchar(100) not null unique,
  password varchar(100) not null,
  username varchar(30) not null,
  email varchar(50) not null unique,
  created datetime default current_timestamp,
  updated datetime default current_timestamp
) engine=InnoDB default charset=utf8mb4;

create table post(
  id bigint primary key auto_increment,
  user_id bigint,
  title varchar(255),
  content text,
  created datetime default current_timestamp,
  updated datetime default current_timestamp
) engine=InnoDB default charset=utf8mb4;

select last_insert_id();
select max(id) as last_id from user;

