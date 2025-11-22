delimiter $
drop function if exists fun1;
create function fun1() returns double
DETERMINISTIC
begin 
	declare totalsum double;
	select sum(sal) into totalsum from test;
	return totalsum;
end$
delimiter ;