
CREATE USER 'hbstudent'@'localhost' IDENTIFIED BY 'hbstudent';

GRANT ALL PRIVILEGES ON * . * TO 'hbstudent'@'localhost';



#alter table hb_student_tracker.student auto_increment=3000;

#ALTER TABLE `hb_student_tracker`.`student` 
#ADD COLUMN `date_of_birth` DATETIME NULL AFTER `last_name`;