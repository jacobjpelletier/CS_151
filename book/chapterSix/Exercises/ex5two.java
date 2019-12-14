/* what is wrong with the following code fragment?

if (total == MAX)
  if (total < sum)
    System.out.println("total == MAX and < sum");
else
  System.out.println("total is not equal to MAX");

The error here is that it will execute the else clause after the last if statement, 
which is inside the if statement stating total == MAX is true. 


