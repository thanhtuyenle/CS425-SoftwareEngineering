
INSERT INTO `carmanagementdb`.`users` (`email`, `firstname`, `lastname`, `middlename`, `password`,`username`) 
VALUES ('user@mum.edu', 'user', 'user', 'user', '$2a$10$IWwUPPV5cPJyeMwQ0VL2QedTH9uDwcz05ZGCeO.RXCxgHEsBFqYDS', 'user@mum.edu');

INSERT INTO `carmanagementdb`.`users` (`email`, `firstname`, `lastname`, `middlename`, `password`,`username`) 
VALUES ('admin@mum.edu', 'admin', 'admin', 'admin', '$2a$10$wOvHq0PgfWoYBuMnd4GVcOAcL7Bx43jxnwtLL8fR8YqMKCI.KPkoa', 'admin@mum.edu');

INSERT INTO `carmanagementdb`.`users` (`email`, `firstname`, `lastname`, `middlename`, `password`,`username`) 
VALUES ('dealer@mum.edu', 'dealer', 'dealer', 'dealer', '$2a$10$AgYzpl40rMUXwG2mIj2pKeJwBwxzrKOhb0vPvooR2IbxGjDRWrKYq', 'dealer@mum.edu');

INSERT INTO `carmanagementdb`.`roles` (`id`, `name`) VALUES ('1', 'ROLE_ADMIN');
INSERT INTO `carmanagementdb`.`roles` (`id`, `name`) VALUES ('2', 'ROLE_DEALER');
INSERT INTO `carmanagementdb`.`roles` (`id`) VALUES ('3','ROLE_USER'); 