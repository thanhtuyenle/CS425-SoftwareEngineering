INSERT INTO `carmanagementdb`.`conditions`(`condition_name`) VALUES('NEW');
INSERT INTO `carmanagementdb`.`conditions`(`condition_name`) VALUES('USED');
INSERT INTO `carmanagementdb`.`conditions`(`condition_name`) VALUES('CERTIFIED');

INSERT INTO `carmanagementdb`.`makes`(`make_name`) VALUES('TOYOTA');
INSERT INTO `carmanagementdb`.`makes`(`make_name`) VALUES('BMW');
INSERT INTO `carmanagementdb`.`makes`(`make_name`) VALUES('HUYNDAI');


INSERT INTO `carmanagementdb`.`models`(`car_model_name`, `make_id`) VALUES('TOYOTA-model1', 1);
INSERT INTO `carmanagementdb`.`models`(`car_model_name`, `make_id`) VALUES('TOYOTA-model2', 1);
INSERT INTO `carmanagementdb`.`models`(`car_model_name`, `make_id`) VALUES('BMW-model1', 2);
INSERT INTO `carmanagementdb`.`models`(`car_model_name`, `make_id`) VALUES('BMW-model2', 2);
INSERT INTO `carmanagementdb`.`models`(`car_model_name`, `make_id`) VALUES('HUYNDAI-model1', 3);
INSERT INTO `carmanagementdb`.`models`(`car_model_name`, `make_id`) VALUES('HUYNDAI-model2', 3);

INSERT INTO `carmanagementdb`.`styles`(`style_name`) VALUES('RED');
INSERT INTO `carmanagementdb`.`styles`(`style_name`) VALUES('WHITE');
INSERT INTO `carmanagementdb`.`styles`(`style_name`) VALUES('BLACK');