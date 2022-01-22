Write a class Employee with attributes ename, dept(Tech or Admin), design(PL, TL, Admin), salary

Responsibility - 

1. Calculate allowance based on designation
  
  	  Design    Allowance
    	    PL        1600
    	    TM        1300
    	    TL        1270
   	    Admin     1500
   	    Others    1100

2. Calculate Tax (calculate monthly tax and deduct from the salary)
	
	Gross Salary > 20,000 = 13 % PA;
	15000 - 20000 = 12.5 % PA;
	12500 - 14999 = 11.25% PA;
	7500 - 12499 = 9.6 % PA;
	<7500 = NIL;

                    
3. Calculate gross salary
4. Calculate net salary
5. Create a Main class
	i. Add employee
	ii. Display employee detail with basic, gross and net
