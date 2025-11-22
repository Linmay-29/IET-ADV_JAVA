delimiter $
drop procedure if exists pro1;
create procedure pro1(in e_id int,out e_sal int)
begin
	select sal into e_sal from test where eid=e_id;
end$	

delimiter ;