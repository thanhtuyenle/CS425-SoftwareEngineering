INSERT INTO `carmanagementdb`.`conditions`(`condition_name`) VALUES('NEW');
INSERT INTO `carmanagementdb`.`conditions`(`condition_name`) VALUES('USED');
INSERT INTO `carmanagementdb`.`conditions`(`condition_name`) VALUES('CERTIFIED');

INSERT INTO `carmanagementdb`.`makes`(`make_name`) VALUES('Acura');
INSERT INTO `carmanagementdb`.`makes`(`make_name`) VALUES('Audi');
INSERT INTO `carmanagementdb`.`makes`(`make_name`) VALUES('BMW');
INSERT INTO `carmanagementdb`.`makes`(`make_name`) VALUES('Buick');
INSERT INTO `carmanagementdb`.`makes`(`make_name`) VALUES('Cadillac');
INSERT INTO `carmanagementdb`.`makes`(`make_name`) VALUES('Chevrolet');
INSERT INTO `carmanagementdb`.`makes`(`make_name`) VALUES('Chrysler');
INSERT INTO `carmanagementdb`.`makes`(`make_name`) VALUES('Dodge');
INSERT INTO `carmanagementdb`.`makes`(`make_name`) VALUES('Ford');
INSERT INTO `carmanagementdb`.`makes`(`make_name`) VALUES('Genesis');
INSERT INTO `carmanagementdb`.`makes`(`make_name`) VALUES('GMC');



INSERT INTO `carmanagementdb`.`models`(`car_model_name`, `make_id`) VALUES('Accord', 1);
INSERT INTO `carmanagementdb`.`models`(`car_model_name`, `make_id`) VALUES('Civic', 1);
INSERT INTO `carmanagementdb`.`models`(`car_model_name`, `make_id`) VALUES('Clarity', 2);
INSERT INTO `carmanagementdb`.`models`(`car_model_name`, `make_id`) VALUES('CR-V', 2);
INSERT INTO `carmanagementdb`.`models`(`car_model_name`, `make_id`) VALUES('Fit', 3);
INSERT INTO `carmanagementdb`.`models`(`car_model_name`, `make_id`) VALUES('HR-V', 3);
INSERT INTO `carmanagementdb`.`models`(`car_model_name`, `make_id`) VALUES('Insight', 3);

INSERT INTO `carmanagementdb`.`styles`(`style_name`) VALUES('Convertible');
INSERT INTO `carmanagementdb`.`styles`(`style_name`) VALUES('Sedan');
INSERT INTO `carmanagementdb`.`styles`(`style_name`) VALUES('Van/Minivan');
INSERT INTO `carmanagementdb`.`styles`(`style_name`) VALUES('Coupe');
INSERT INTO `carmanagementdb`.`styles`(`style_name`) VALUES('Wagon');
INSERT INTO `carmanagementdb`.`styles`(`style_name`) VALUES('SUV/Crossover');
INSERT INTO `carmanagementdb`.`styles`(`style_name`) VALUES('Hatchback');
INSERT INTO `carmanagementdb`.`styles`(`style_name`) VALUES('Truck');