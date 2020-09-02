Area Calculator

A method named area with one double parameter "radius". The method return double value the area of a circle.  If the parameter is negative return -1.0(Invalid Value).
The formula is "radius * radius * PI" for calculate an area.  Use Math.PI for PI

Another overloaded method with 2 parameters x and y (both doubles). x and y represent the sides of a rectangle. The method return an area of a rectangle. If x, y, or both is/are a negative, return -1.0(Invalid Value). The area of a rectangle is x * y.

Examples of input/output:
-   `**area(5.0);**` should return 78.53975
-   `**area(-1);**` should return -1 since the parameter is negative
-   `**area(5.0, 4.0);**` should return 20.0 (5 * 4 = 20)
-   `**area(-1.0, 4.0);**` should return -1 since first the parameter is negative