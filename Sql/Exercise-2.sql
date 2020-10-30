use NIIT;
alter table Student_Status modify Start_Date date;
alter table Student_Status modify End_Date date;
alter table FacultyDetails add column FacultyMobile int(12);
alter table BatchDetails add column BatchYear date;
alter table BatchDetails modify Batch_Id int;
alter table FacultyDetails modify Faculty_Id int; 
desc FacultyDetails;