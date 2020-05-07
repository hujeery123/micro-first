-- 初始化数据
INSERT INTO `MICROSERVICE`.`APP_BOOK`( `author`, `name`, `price`, `create_time`, `description`) VALUES ('金庸', '笑傲江湖', 12, '2018-09-01 10:10:12', '是作家金庸创作的一部长篇武侠小说');
INSERT INTO `MICROSERVICE`.`APP_BOOK`( `author`, `name`, `price`, `create_time`, `description`) VALUES ('罗贯中', '三国演义', 22, '2018-09-01 10:10:16', '是作家罗贯中创作的一部长篇历史小说');
INSERT INTO `MICROSERVICE`.`APP_BOOK`( `author`, `name`, `price`, `create_time`, `description`) VALUES ('吴承恩', '西游记', 17, '2018-09-01 10:10:19', '是作家吴承恩创作的一部长篇小说');

INSERT INTO `MICROSERVICE`.`APP_LOGIN`( `name`, `password`, `role`, `create_time`) VALUES ('zs', '123456', 1, '2020-05-01 10:30:35');
INSERT INTO `MICROSERVICE`.`APP_LOGIN`( `name`, `password`, `role`, `create_time`) VALUES ('ls', '123456', 2, '2020-05-01 10:30:35');

INSERT INTO `MICROSERVICE`.`APP_ROLE`( `name`,  `create_time`) VALUES ('admin', '2020-05-01 10:30:35');
INSERT INTO `MICROSERVICE`.`APP_ROLE`( `name`,  `create_time`) VALUES ('user', '2020-05-01 10:30:35');