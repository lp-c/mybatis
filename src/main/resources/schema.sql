drop table if exists user;

create table user(
    id bigint(20) not null comment '主键id',
    name varchar(30) null default null comment '姓名',
    age int(11) null default null comment '年龄',
    email varchar(50) null default null comment '邮箱',
    primary key (id)
);