**Wall Area**

A class with the name  "Wall". The class has two fields, "width" and "height". The class has two constructors. The first constructor does not have any parameters. The second constructor has parameters  width and  height of type double. In case width/height are less than "0"  it set width/height  field value to "0".

**Methods**
-   Method named  "getWidth"/"getHeigh"t  without  any parameters, it return  the value of  "width"/"height".
-   Method named  "setWidth"/"setHeight"  with one parameter of type double, it set the value of the  "width"/"height". If the parameter is  less than "0", set the  "width"/"height" value to "0".
-   Method named "getArea" without any parameters, it return the area of the wall.

**EXAMPLE**
1  Wall wall =  new  Wall(4,3);
2  System.out.println("area= "  + wall.getArea()); --> area=  12.0

NOTE:  In total, you have to write 5 methods and 2 constructors.

