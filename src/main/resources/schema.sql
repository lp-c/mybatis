drop table if exists user;

create table user(
    id bigint(20) not null auto_increment comment '主键id',
    name varchar(30) null default null comment '姓名',
    age int(11) null default null comment '年龄',
    email varchar(50) null default null comment '邮箱',
    primary key (id)
);

drop table if exists information;

create table information(
    id bigint(20) not null comment '主键ID',
    create_people varchar(10) null default null comment '添加人',
    create_time datetime comment '创建时间',
    modify_people varchar(10) null default null comment '修改人',
    modify_time datetime comment '修改时间',
    deleted int(1) default '0' comment '是否删除',
    content varchar(100) comment '咨询内容',
    type int(1) null comment '咨询类型'
);