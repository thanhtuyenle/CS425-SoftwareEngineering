CREATE SCHEMA `carmanagementdb` ;

DROP TABLE `carmanagementdb`.`users_roles`;

DROP TABLE `carmanagementdb`.`roles`;

DROP TABLE `carmanagementdb`.`dealers`;

DROP TABLE `carmanagementdb`.`users`;

-- Table users --
INSERT INTO `carmanagementdb`.`users` (`email`, `firstname`, `lastname`, `middlename`, `password`,`username`)
VALUES ('admin@mum.edu', 'admin', 'admin', 'admin', '$2a$10$wOvHq0PgfWoYBuMnd4GVcOAcL7Bx43jxnwtLL8fR8YqMKCI.KPkoa', 'admin@mum.edu');

INSERT INTO `carmanagementdb`.`users` (`email`, `firstname`, `lastname`, `middlename`, `password`,`username`) 
VALUES ('admin@mum.edu', 'admin', 'admin', 'admin', '$2a$10$wOvHq0PgfWoYBuMnd4GVcOAcL7Bx43jxnwtLL8fR8YqMKCI.KPkoa', 'admin@mum.edu');

INSERT INTO `carmanagementdb`.`users` (`email`, `firstname`, `lastname`, `middlename`, `password`,`username`) 
VALUES ('dealer@mum.edu', 'dealer', 'dealer', 'dealer', '$2a$10$AgYzpl40rMUXwG2mIj2pKeJwBwxzrKOhb0vPvooR2IbxGjDRWrKYq', 'dealer@mum.edu');

-- Table roles --
INSERT INTO `carmanagementdb`.`roles` (`id`, `name`) VALUES ('1', 'ROLE_ADMIN');
INSERT INTO `carmanagementdb`.`roles` (`id`, `name`) VALUES ('2', 'ROLE_DEALER');
INSERT INTO `carmanagementdb`.`roles` (`id`, `name`) VALUES ('3','ROLE_USER');

-- Table users_roles --
INSERT INTO `carmanagementdb`.`users_roles`(`user_id`,`role_id`) VALUES(1,1);
INSERT INTO `carmanagementdb`.`users_roles`(`user_id`,`role_id`) VALUES(2,2);
INSERT INTO `carmanagementdb`.`users_roles`(`user_id`,`role_id`) VALUES(3,3);

-- Table users --
INSERT INTO `carmanagementdb`.`users` (`email`, `firstname`, `lastname`, `middlename`, `password`,`username`) VALUES ('louis@mum.edu', 'dealer1', 'dealer1', 'dealer1', '$2a$10$AgYzpl40rMUXwG2mIj2pKeJwBwxzrKOhb0vPvooR2IbxGjDRWrKYq', 'louis@mum.edu');
INSERT INTO `carmanagementdb`.`users` (`email`, `firstname`, `lastname`, `middlename`, `password`,`username`)VALUES ('marry@mum.edu', 'dealer2', 'dealer2', 'dealer2', '$2a$10$AgYzpl40rMUXwG2mIj2pKeJwBwxzrKOhb0vPvooR2IbxGjDRWrKYq', 'marry@mum.edu');
INSERT INTO `carmanagementdb`.`users` (`email`, `firstname`, `lastname`, `middlename`, `password`,`username`)VALUES ('daisy@mum.edu', 'dealer3', 'dealer3', 'dealer3', '$2a$10$AgYzpl40rMUXwG2mIj2pKeJwBwxzrKOhb0vPvooR2IbxGjDRWrKYq', 'daisy@mum.edu');
INSERT INTO `carmanagementdb`.`users` (`email`, `firstname`, `lastname`, `middlename`, `password`,`username`)VALUES ('highway@mum.edu', 'dealer4', 'dealer4', 'dealer4', '$2a$10$AgYzpl40rMUXwG2mIj2pKeJwBwxzrKOhb0vPvooR2IbxGjDRWrKYq', 'highway@mum.edu');
INSERT INTO `carmanagementdb`.`users` (`email`, `firstname`, `lastname`, `middlename`, `password`,`username`)VALUES ('billards@mum.edu', 'dealer5', 'dealer5', 'dealer5', '$2a$10$AgYzpl40rMUXwG2mIj2pKeJwBwxzrKOhb0vPvooR2IbxGjDRWrKYq', 'billards@mum.edu');
INSERT INTO `carmanagementdb`.`users` (`email`, `firstname`, `lastname`, `middlename`, `password`,`username`)VALUES ('main@mum.edu', 'dealer6', 'dealer6', 'dealer6', '$2a$10$AgYzpl40rMUXwG2mIj2pKeJwBwxzrKOhb0vPvooR2IbxGjDRWrKYq', 'main@mum.edu');

-- Table users_roles --
INSERT INTO `carmanagementdb`.`users_roles`(`user_id`,`role_id`) VALUES(4,2);
INSERT INTO `carmanagementdb`.`users_roles`(`user_id`,`role_id`) VALUES(5,2);
INSERT INTO `carmanagementdb`.`users_roles`(`user_id`,`role_id`) VALUES(6,2);

INSERT INTO `carmanagementdb`.`users_roles`(`user_id`,`role_id`) VALUES(7,2);
INSERT INTO `carmanagementdb`.`users_roles`(`user_id`,`role_id`) VALUES(8,2);
INSERT INTO `carmanagementdb`.`users_roles`(`user_id`,`role_id`) VALUES(9,2);

-- Table dealers --
INSERT INTO `carmanagementdb`.`dealers` (`address`, `dealer_number`, `email`, `name`, `password`, `phone_number`, `website`, `user_id`)
VALUES ('2 New Jersey', 'DL001', 'louis@mum.edu', 'Louis Store', 'test1234', '(641) 5555 9999', 'www.louis.com', '4');

INSERT INTO `carmanagementdb`.`dealers` (`address`, `dealer_number`, `email`, `name`, `password`, `phone_number`,`website`, `user_id`)
VALUES ('1 Court N, Fairfield', 'DL002', 'marry@mum.edu', 'Marry Store', 'test1234', '(641) 5555 0000', 'www.marry.com', '5');

INSERT INTO `carmanagementdb`.`dealers` (`address`, `dealer_number`, `email`, `name`, `password`, `phone_number`, `website`, `user_id`)
VALUES ('3 Lavender St., Iowa', 'DL003', 'daisy@mum.edu', 'Daisy Store', 'test1234', '(641) 5555 1111', 'www.daisy.com', '6');

INSERT INTO `carmanagementdb`.`dealers` (`address`, `dealer_number`, `email`, `name`, `password`, `phone_number`, `website`, `user_id`)
VALUES ('7 N Court St., Fairfield', 'DL004', 'court@mum.edu', 'Court Store', 'test1234', '(641) 5555 2222', 'www.courst.com', '7');

INSERT INTO `carmanagementdb`.`dealers` (`address`, `dealer_number`, `email`, `name`, `password`, `phone_number`, `website`, `user_id`)
VALUES ('20 Highway St., Fairfield', 'DL005', 'highway@mum.edu', 'Highway Store', 'test1234', '(641) 5555 3333', 'www.highway.com', '8');

INSERT INTO `carmanagementdb`.`dealers` (`address`, `dealer_number`, `email`, `name`, `password`, `phone_number`, `website`, `user_id`)
VALUES ('10 Billards St., Fairfield', 'DL006', 'billards@mum.edu', 'Billards Store', 'test1234', '(641) 5555 4444', 'www.billards.com', '9');


