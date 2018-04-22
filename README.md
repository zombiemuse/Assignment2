# Assignment2
CIS304 assignment 2

1) Write a class, named ReadProduct.java. It has the following two attributes:
• an ArrayList object, listProduct, which will contain Product objects and
• a HashMap object, mapCodeProduct, in which the key is product code, and the value is the
product object.
2) The class has a method, readProductFile(), that reads products.txt line by line(refer to chapter 18 for
the text file’s format and sample content). Using information from each line, it creates a Product object
and stores the object in the listProduct ArrayList. This class contains another method, getListProduct(),
which returns the listProduct ArrayList object.
3) When reading each line, it stores the product code and the product object as a record to the
mapCodeProduct HashMap object. It provides another method, getMapCodeProduct(), which returns
the mapCodeProduct HashMap object.
4) Write another class, ProductApp.java, which has a main method to test the ReadProduct class.
5) Products.txt file would be comma-separated text file. Each row represents one product as follows:
Wuth,Wuthering Heights,49.50
Mbdk, Moby Dick,33.67
Wooz,Wizard of Oz, 44.29
