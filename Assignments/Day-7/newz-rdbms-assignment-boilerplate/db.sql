-- -- Create schema
-- create schema newsapp;
-- use newsapp;

-- -- Create the User table first
-- create table User (
--     UserId  nvarchar(50) not null,
--     Password  nvarchar(50) not null,
--     primary key (UserId)
-- );

-- -- Create the UserProfile table next
-- create table UserProfile (
--     UserId  nvarchar(50) not null,
--     FirstName  nvarchar(50) not null,
--     LastName  nvarchar(50) not null,
--     Contact  nvarchar(50) default null,
--     Email  nvarchar(50) default null,
--     CreatedAt datetime not null,
--     primary key (UserId),
--     foreign key (UserId) references User(UserId) on delete cascade on update cascade
-- );

-- -- Create the News table before Reminders, since Reminders references News
-- create table News (
--     NewsId int not null,
--     Title nvarchar(50) not null,
--     Content nvarchar(500) not null,
--     PublishedAt datetime not null,
--     CreatedBy nvarchar(50) not null,
--     Url nvarchar(255) default null,
--     UrltoImage nvarchar(255) default null,
--     primary key (NewsId),
--     foreign key (CreatedBy) references UserProfile(UserId) on delete cascade on update cascade
-- );

-- -- Create the Reminders table last
-- create table Reminders (
--     ReminderId int not null,
--     Schedule datetime not null,
--     NewsId int not null,
--     primary key (ReminderId),
--     foreign key (NewsId) references News(NewsId) on delete cascade on update cascade
-- );

-- -- Insert data into User table
-- insert into User (UserId, Password) values
--     ('Jack', 'pass@123'),
--     ('John', 'something#121'),
--     ('Kevin', 'test@123');

-- -- Insert data into UserProfile table
-- insert into UserProfile (UserId, FirstName, LastName, Contact, Email, CreatedAt) values
--     ('Jack', 'Jackson', 'James', '8899776655', 'jack@ymail.com', str_to_date('07-12-2019 00:00:00', '%d-%m-%Y %H:%i:%s')),
--     ('John', 'Johnson', 'dsouza', '7869543210', 'john@gmail.com', str_to_date('25-12-2019 00:00:00', '%d-%m-%Y %H:%i:%s')),
--     ('Kevin', 'Kevin', 'Lloyd', '9878685748', 'kevin@gmail.com', str_to_date('01-12-2019 00:00:00', '%d-%m-%Y %H:%i:%s'));

-- -- Insert data into News table
-- insert into News (NewsId, Title, Content, PublishedAt, CreatedBy, Url, UrltoImage) values
--     (101, 'IT industry in 2020', 'IT industry was facing disruptive changes in 2019. It is expected to have positive growth in 2020', str_to_date('01-12-2019 00:00:00', '%d-%m-%Y %H:%i:%s'), 'Jack', null, null),
--     (102, '2020 FIFA U-17 Women World Cup', 'The tournament will be held in India between 2 and 21 November 2020. It will mark the first time that India has hosted a FIFA women football tournament.', str_to_date('05-12-2019 00:00:00', '%d-%m-%Y %H:%i:%s'), 'Jack', null, null),
--     (103, 'chandrayaan2-spacecraft', 'The Lander of Chandrayaan-2 was named Vikram after Dr Vikram A Sarabhai, the Father of the Indian Space Programme. It was designed to function for one lunar day', str_to_date('05-12-2019 00:00:00', '%d-%m-%Y %H:%i:%s'), 'John', null, null),
--     (104, 'NEFT transactions to be available 24x7', 'Bank customers will be able to transfer funds through NEFT around the clock on all days including weekends and holidays from December 16.', str_to_date('07-12-2019 00:00:00', '%d-%m-%Y %H:%i:%s'), 'John', null, null);

-- -- Insert data into Reminders table
-- insert into Reminders (ReminderId, Schedule, NewsId) values
--     (1, str_to_date('04-12-2019 00:00:00', '%d-%m-%Y %H:%i:%s'), 101),
--     (2, str_to_date('10-12-2019 00:00:00', '%d-%m-%Y %H:%i:%s'), 102),
--     (3, str_to_date('10-12-2019 00:00:00', '%d-%m-%Y %H:%i:%s'), 104);
    
-- -- ----------------------------------------------------------------------------------------------------

-- Question 1: Retreive all the user profiles joined on or after 10-Dec-2019.

select * from UserProfile where CreatedAt >= str_to_date('10-12-2019 00:00:00', '%d-%m-%Y %H:%i:%s');

-- ----------------------------------------------------------------------------------------------------
-- Question 2: Retreive the details of user 'Jack' along with all the news created by him.

select u.UserId, u.FirstName, u.LastName, u.Contact, u.Email, u.CreatedAt, n.Title, n.Content from UserProfile as u 
join News n on u.UserId = n.CreatedBy where u.UserId = "Jack";

-- ----------------------------------------------------------------------------------------------------
-- Question 3: Retreive all details of the user who created the News with newsId=103.

select u.UserId, u.FirstName, u.LastName, u.Contact, u.Email, u.CreatedAt from UserProfile as u
join News n on n.CreatedBy = u.UserId 
where n.NewsId = 103;

-- ----------------------------------------------------------------------------------------------------
-- Question 4: Retreive the details of all the users who have not added any news yet.

select u.UserId, u.FirstName, u.LastName, u.Contact, u.Email, u.CreatedAt from UserProfile as u
left join News n on n.CreatedBy = u.UserId
where n.NewsId is null;

-- ----------------------------------------------------------------------------------------------------
-- Question 5: Retreive the newsid and title of all the news having some reminder.

select n.NewsId, n.Title from News as n
join Reminders r on n.NewsId = r.NewsId;

-- ----------------------------------------------------------------------------------------------------
-- Question 6: Retreive the total number of news added by each user.

select u.UserId, u.FirstName, u.LastName, count(n.NewsId) as Total_No_Of_News
from UserProfile as u
left join News n on u.UserId = n.CreatedBy
group by u.UserId;

-- ----------------------------------------------------------------------------------------------------
-- Question 7: Update the contact number of userId='John' to '9192939495'.

update UserProfile set Contact = '9192939495' where UserId = 'John';

-- ----------------------------------------------------------------------------------------------------
-- Question 8: Update the title of the newsId=101 to 'IT industry growth can be seen in 2020'.

update News set Title = 'IT industry growth can be seen in 2020' where NewsId = 101;

-- ----------------------------------------------------------------------------------------------------
-- Question 9: Remove all the reminders belonging to the news created by Jack.

delete from Reminders where NewsId in
(select n.NewsId from News n
join UserProfile u on u.Userid = n.CreatedBy 
where u.UserId = 'Jack');

-- ----------------------------------------------------------------------------------------------------
-- Question 10: Write a query to set a reminder for a particular news (Use Reminder and News tables - insert statement)

insert into Reminders (ReminderId, Schedule, NewsId)
values (5, str_to_date('04-12-2019 00:00:00', '%d-%m-%Y %H:%i:%s'), 101);



