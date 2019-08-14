
INSERT INTO `carmanagementdb`.`users` (`email`, `firstname`, `lastname`, `middlename`, `password`,`username`)
VALUES ('admin@mum.edu', 'admin', 'admin', 'admin', '$2a$10$wOvHq0PgfWoYBuMnd4GVcOAcL7Bx43jxnwtLL8fR8YqMKCI.KPkoa', 'admin@mum.edu');

INSERT INTO `carmanagementdb`.`users` (`email`, `firstname`, `lastname`, `middlename`, `password`,`username`)
VALUES ('dealer@mum.edu', 'dealer', 'dealer', 'dealer', '$2a$10$AgYzpl40rMUXwG2mIj2pKeJwBwxzrKOhb0vPvooR2IbxGjDRWrKYq', 'dealer@mum.edu');

INSERT INTO `carmanagementdb`.`users` (`email`, `firstname`, `lastname`, `middlename`, `password`,`username`) 
VALUES ('user@mum.edu', 'user', 'user', 'user', '$2a$10$IWwUPPV5cPJyeMwQ0VL2QedTH9uDwcz05ZGCeO.RXCxgHEsBFqYDS', 'user@mum.edu');

INSERT INTO `carmanagementdb`.`roles` (`id`, `name`) VALUES ('1', 'ROLE_ADMIN');
INSERT INTO `carmanagementdb`.`roles` (`id`, `name`) VALUES ('2', 'ROLE_DEALER');
INSERT INTO `carmanagementdb`.`roles` (`id`, `name`) VALUES ('3','ROLE_USER');

INSERT INTO `carmanagementdb`.`users_roles`(`user_id`,`role_id`) VALUES(1,1);
INSERT INTO `carmanagementdb`.`users_roles`(`user_id`,`role_id`) VALUES(2,2);
INSERT INTO `carmanagementdb`.`users_roles`(`user_id`,`role_id`) VALUES(3,3);

INSERT INTO `carmanagementdb`.`dealers` (`address`, `dealer_number`, `email`, `name`, `password`, `phone_number`, `website`)
VALUES ('2 New Jersey', 'DL001', 'louis@mum.edu', 'Louis Store', 'test1234', '(641) 5555 9999', 'www.louis.com');

INSERT INTO `carmanagementdb`.`dealers` (`address`, `dealer_number`, `email`, `name`, `password`, `phone_number`)
VALUES ('1 Court N, Fairfield', 'DL002', 'marry@mum.edu', 'Marry Store', 'test1234', '(641) 5555 0000');

INSERT INTO `carmanagementdb`.`dealers` (`address`, `dealer_number`, `email`, `name`, `password`, `phone_number`, `website`)
VALUES ('3 Lavender St., Iowa', 'DL003', 'daisy@mum.edu', 'Daisy Store', 'test1234', '(641) 5555 1111', 'www.daisy.com');

INSERT INTO `carmanagementdb`.`dealers` (`address`, `dealer_number`, `email`, `name`, `password`, `phone_number`, `website`)
VALUES ('7 N Court St., Fairfield', 'DL004', 'court@mum.edu', 'Court Store', 'test1234', '(641) 5555 2222', 'www.courst.com');

INSERT INTO `carmanagementdb`.`dealers` (`address`, `dealer_number`, `email`, `name`, `password`, `phone_number`, `website`)
VALUES ('20 Highway St., Fairfield', 'DL005', 'highway@mum.edu', 'Highway Store', 'test1234', '(641) 5555 3333', 'www.highway.com');

INSERT INTO `carmanagementdb`.`dealers` (`address`, `dealer_number`, `email`, `name`, `password`, `phone_number`, `website`)
VALUES ('1000 Billards St., Fairfield', 'DL006', 'billards@mum.edu', 'Billards Store', 'test1234', '(641) 5555 4444', 'www.billards.com');

INSERT INTO `carmanagementdb`.`dealers` (`address`, `dealer_number`, `email`, `name`, `password`, `phone_number`, `website`)
VALUES ('108 Main St., Fairfield', 'DL007', 'main@mum.edu', 'Main Store', 'test1234', '(641) 5555 5555', 'www.main.com');

INSERT INTO `carmanagementdb`.`dealers` (`address`, `dealer_number`, `email`, `name`, `password`, `phone_number`)
VALUES ('77 Rose St., Fairfield', 'DL008', 'rose@mum.edu', 'Rose Store', 'test1234', '(641) 5555 6666');
