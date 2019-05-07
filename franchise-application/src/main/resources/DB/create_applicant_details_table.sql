CREATE TABLE `applicantdetails` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(255) NOT NULL,
	`id_number` VARCHAR(255) NOT NULL,
	`date_of_birth` VARCHAR(50) NULL DEFAULT NULL,
	`address` VARCHAR(255) NULL DEFAULT NULL,
	`phone` VARCHAR(255) NOT NULL,
	`email_id` VARCHAR(255) NOT NULL,
	`previous_experience` VARCHAR(255) NULL DEFAULT NULL,
	`interest_in_brand` VARCHAR(255) NULL DEFAULT NULL,
	`investment_amount` VARCHAR(255) NULL DEFAULT NULL,
	`preffered_geographical_area` VARCHAR(255) NULL DEFAULT NULL,
	`additional_notes` VARCHAR(255) NULL DEFAULT NULL,
	`time_created` DATETIME NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
);