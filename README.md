
# jnewton (under development)

Java based wrapper for [newton-api](https://github.com/aunyks/newton-api)

## How does it work

Simply call the function with the expression as the argument for the operation you wish to perform. You get the result as a string. If the answer can be parsed to a number (as shown in the example below), you can do that a later stage.

```java
String cosPiStr = Newton.Cosine("pi");
double CosPi = Double.parseDouble(cosPiStr);
```

## A little bit about newton

Newton is a micro-service based API written in node.js that does anything from numerical calculation to symbolic math parsing. Newton works on sending HTTP GET requests and recieving responses in the JSON format. jnewton takes care of all this for you.

### Supported Endpoints (as of now)

1. Cosine
2. Sine
3. Tangent
4. AbsoluteValue
5. Simplify
6. Factor
7. Derive
8. Integrate
9. Zeroes
10. Find Tangent
11. Inverse Sine
12. Inverse Cosine
13. Logarithm