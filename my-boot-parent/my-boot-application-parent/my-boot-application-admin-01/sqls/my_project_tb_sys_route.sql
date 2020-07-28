create table tb_sys_route
(
    id        bigint auto_increment
        primary key,
    url       varchar(1000) null,
    name      varchar(255)  null,
    parent_id bigint        null,
    weight    int           null
)
    comment '路由表';

INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333455968210944, 'customer/info/update', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456081457152, 'customer/info/list', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456094040064, 'customer/info/data', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456106622976, 'customer/info/save', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456119205888, 'customer/info/delete', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456131788800, 'customer/info/delete/{id}', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456144371712, 'customer/info', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456161148928, 'customer/log/list', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456173731840, 'customer/log/data', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456186314752, 'customer/log', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456194703360, 'customer/type', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456207286272, 'sys/role/get', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456219869184, 'sys/role/update', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456228257792, 'sys/role/list', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456236646400, 'sys/role/data', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456253423616, 'sys/role/delete', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456266006528, 'sys/role/save', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456274395136, 'sys/role/delete/{id}', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456282783744, 'sys/role', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456291172352, 'sys/route/list', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456299560960, 'sys/route', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456312143872, 'sys/user/get', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456320532480, 'sys/user/update', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456328921088, 'sys/user/list', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456337309696, 'sys/user/data', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456349892608, 'sys/user/delete', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456362475520, 'sys/user/save', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456370864128, 'sys/user/delete/{id}', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456383447040, 'sys/user', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835648, '${server.error.path:${error.path:/error}}', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835649, 'customer/type/get', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835650, 'customer/type/update', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835651, 'customer/type/list', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835652, 'customer/type/data', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835653, 'customer/type/delete/{id}', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835654, 'customer/type/save', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835655, 'customer/type/delete', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835656, 'customer/type/get/{id}', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835657, 'goods/info/update', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835658, 'goods/info/list', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835659, 'goods/info/data', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835660, 'goods/info/save', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835661, 'goods/info/delete', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835662, 'goods/info/delete/{id}', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835663, 'goods/info', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835664, 'goods/type/get', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835665, 'goods/type/update', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835666, 'goods/type/list', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835667, 'goods/type/data', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835668, 'goods/type/delete/{id}', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835669, 'goods/type/save', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835670, 'goods/type/delete', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835671, 'goods/type/get/{id}', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835672, 'goods/type', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835673, '/swagger-resources//configuration/security', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835674, '/swagger-resources//configuration/ui', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835675, '/swagger-resources', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835676, '//v2/api-docs-ext', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835677, '', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835678, 'customer/info/get', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835679, 'customer/info/get/{id}', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835680, 'goods/info/get', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835681, 'goods/info/get/{id}', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835682, 'customer/info/{id}', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835683, 'customer/type/{id}', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835684, 'goods/info/{id}', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835685, 'goods/type/{id}', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835686, 'sys/role/{id}', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835687, 'sys/user/{id}', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835688, 'sys/user/add', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835689, 'sys/role/route', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835690, 'sys/role/info', null, null, null);
INSERT INTO my_project.tb_sys_route (id, url, name, parent_id, weight)
VALUES (1279333456391835691, 'sys/user/test', null, null, null);