use NIIT;
create table BatchDetails(Batch_Id varchar(20) unique,Batch_Faculty varchar(30),Batch_DEPT_Name varchar(30));
create table ModuleDetails(Module_Id varchar(20) unique,Module_Name varchar(40),Module_Duration varchar(11));
create table StudentDetails(Student_Id varchar(20)unique,Title varchar(7),Student_Name varchar(30),Student_Location varchar(30),Student_Track varchar(15),Student_Qualification varchar(200),Student_Email varchar(100),Student_Password varchar(20));
create table Questions(Question_Id varchar(20)unique,Module_Id varchar(20),Question_Text varchar(900));
create table Student_Status(Student_Id varchar(20),Module_Id varchar(20),Start_Date varchar(20),End_Date varchar(20),AFeedbackGiven varchar(20),TFeedbackGiven varchar(20));
create table Faculty_Feedback(Faculty_Id varchar(20),Question_Id varchar(20),Batch_Id varchar(20),Faculty_Rating int(11));
create table Student_Feedback(Student_Id varchar(20),Question_Id varchar(20),Module_Id varchar(20),Student_Rating int(11));
create table Login_Details(User_Id varchar(20),User_Password varchar(10));