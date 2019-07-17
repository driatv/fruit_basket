# fruit_market

## How to run the project:
1- Clone the project: git clone https://github.com/driatv/fruit_basket.git <br />
2- Run command mvn clean install in the good repository<br />
3- Run command java -jar java -jar target/fruit-market-1.0-SNAPSHOT.jar<br />
4- Look at the results in your terminal.


## To modify the quantity/price/reductions:

In the project, look at the file: fruit_basket/src/main/resources/input.txt

It will be as below:

<pre> fruit name | quantity | price | total | number_to_pay<br />
 Apple      | 4        | 0.20  | 2     | 1<br />
 Orange     | 3        | 0.50  | 1     | 1<br />
 Watermelon | 27       | 0.80  | 3     | 2</pre>

-fruit name defines the name of the fruit<br />
-quantity defines the quantity to buy<br />
-price defines the price of one fruit<br />
-total is the amount on which you can get an offer<br />
-number_to_pay is the number to pay compare to the total

###  Example with apples: 
If you buy 4 Apples at 0.20€ each with an offer: buy one get one free, you should pay 0.40€ instead of 0.80€.




##  Next step

User should not have to compile project so the file input.txt should be alterable and taken into account.
