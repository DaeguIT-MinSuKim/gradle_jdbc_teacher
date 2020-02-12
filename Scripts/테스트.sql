select user(), database();

select * from department d ;
select * from title;
select * from employee e ;

select title_no, title_name from title;

-- 조민희가 로그인하려고 할경우
select emp_no, emp_name, title, manager, salary, dept, hire_date 
  from employee 
 where emp_no = 1003 and passwd = password('1234567'); 
 
select  emp_no, emp_name, t.title_name 
  from employee e left join title t on e.title  = t.title_no 
 where dept = 2; 