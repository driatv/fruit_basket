# fruit_market

** How to run the project:** 
1- Clone the project
2- Run command mvn clean install in the good repository
3- Run command java -jar java -jar target/fruit-market-1.0-SNAPSHOT.jar
4- See the results.


** To modify the quantity/price/reductions:** 

See in the project the file: fruit_basket/src/main/resources/input.txt

It will be as below:

 fruit name | quantity | price | total | number_to_pay
 Apple      | 4        | 0.20  | 2     | 1
 Orange     | 3        | 0.50  | 1     | 1
 Watermelon | 27       | 0.80  | 3     | 2

-fruit name defines the name of the fruit
-quantity defines the quantity to buy
-price defines the price of one fruit
-total is the amount on which you can get an offer
-number_to_pay is the number to pay compare to the total

** Exemple with apples:** 
You will buy 4 Apple at the unit price of 0.20€.
But you have a reduction. Every two apples, you get one offered.
So you should pay 0.40€ instead of 0.80€.
