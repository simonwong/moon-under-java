create table moon_under.demo
(
    demo_id     bigint(20) not null auto_increment comment 'Demo ID',
    demo_name   varchar(64)  not null comment 'Demo 名称',
    demo_type   varchar(64)  not null comment 'Demo 分类',
    active      int       not null comment '是否可用',
    remark      varchar(500) null comment '备注',
    creator_id  long      not null comment '创建人ID',
    create_time datetime  not null comment '创建时间',
    updater_id  long      not null comment '更新人ID',
    update_time datetime  not null comment '更新时间',
    PRIMARY KEY (`demo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment 'Demo 表';

