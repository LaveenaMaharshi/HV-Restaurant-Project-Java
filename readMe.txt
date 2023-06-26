IMPORTANT NOTES:

-Please make note of all the important stuff in this file, so that all the team members are on the same page.
-Try and write all the code with commments, so that it's not difficult for others to understand.
-If using any system classes please write the imported classes in this file as well.
-If applying any new stuff which is not being covered in class, do write the about them in commments specifically describing about it.
----------------------------------------------------------------------------------------------------
IMPORTANT SYSNTAX:

for reading system date:-
System.out.println(DateTimeFormatter.ofPattern("YYYY-dd-MMM").format(LocalDate.now()));

----------------------------------------------------------------------------------------------------
ABOUT CSV FILES:
1. Menu Details - [csvMenu.csv]
Columns Names - itemID, itemDescription, itemCost

2. Order Details - [csvOrder.csv]
Columns Names - orderID, orderDate, totalBillingAmount, orderDetails, orderStatus
User Inputs - orderDetails
System Calculated - orderID, orderDate, totalBillingAmount
orderStatus - ‘Approved’ by default

3. Customer Details- [csvCustomer.csv]
Columns Names - custID, custName, userName, userPass, Membership
User Inputs - custID, custName, Membership
System Calculated - userName, userPass  (By default, it will be Guest, Guest)
Depending on Membership, Calculate userName and userPass (custName+custID)

4.Employee Details- [csvEmployee.csv]
Columns Names - EmpID, EmpName, AdminFlag, LoginName, LoginPass, entryTime, exitTime(Time will be only for Employee)
User Inputs - EmpID, EmpName, AdminFlag
System Calculated - LoginName, LoginPass,   (If AdminFlag is true, it will be Admin, Admin)
If AdminFlag is false, Calculate LoginName(custName+custID) and LoginPass (custName 3 letters+custID)


----------------------------------------------------------------------------------------------------

Members working on modules:
1. Laveena:
2. Utkarsh:
3. Lavanya:
4. Ishaq:

----------------------------------------------------------------------------------------------------