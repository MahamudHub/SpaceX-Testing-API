# SpaceX-Testing-API
API Testing For SpaceX

To run a test you would need to create an instance of DTOs classes  in your testing class
There are two DTO classes one for the headers and another for the JSON API which return the key pair values.

The DTO provides you with getters you could use those getters to call it through the assertion to run the appropriate tests you require.
There is also a loggers if you require to see the return Values of DTO methods you could also use the logger info and pass the DTO getter method in the logger which shows you the results.

There is a method which allows you to open URL links test links in the DTO coming from JSON.
To do this you just need to call openLink method pass it  it the return of the methods which return a links from the getters. 

