# The Secret Kung Fu JSON Guide

### JSON -> javascript object notation
- Don't be fooled by the javascript part. This is just a technique for presenting data in a language agnostic way.

#### So we were given a link for our final project:

```json
http://api.openweathermap.org/data/2.5/weather?q=New%20York,NY
```
##### So what should we do with this?

Before you go off and start using the http object to go grab this data, `stop` and `think` about the fact that this is live data from some external source and as such can change and even become unavailable at any point. It's probably not likely especially if it's from a reputable source such as google or facebook but it can happen. So while we develop our code, I recommend that we take this data and copy/paste into a file. Once our code is working the way we expect then go ahead and tweak it so that it now takes the json directly from the web api.

Once you place the URL into your browser you should get back a JSON blob that you can then store in a file. We'll later import this file into an intellij project.

Here's what I got when I tried this:

```json
{"coord":{"lon":-74.01,"lat":40.71},"sys":{"message":0.011,"country":"United States of America","sunrise":1428229930,"sunset":1428276303},"weather":[{"id":800,"main":"Clear","description":"Sky is Clear","icon":"01d"}],"base":"stations","main":{"temp":282.417,"temp_min":282.417,"temp_max":282.417,"pressure":1033.26,"sea_level":1037.02,"grnd_level":1033.26,"humidity":68},"wind":{"speed":3.21,"deg":237.501},"clouds":{"all":0},"dt":1428243309,"id":5128581,"name":"New York","cod":200}
```

Yuck, so much for human readable right? Let's throw it into our `JSON viewer` over @ [code beautify] (http://codebeautify.org/jsonviewer)

![ code beautify ] (https://github.com/accesscode-2-1/unit-0/blob/master/images/minified2beautiful.png)


```json
{
    "coord": {
        "lon": -74.01,
        "lat": 40.71
    },
    "sys": {
        "message": 0.011,
        "country": "United States of America",
        "sunrise": 1428229930,
        "sunset": 1428276303
    },
    "weather": [
        {
            "id": 800,
            "main": "Clear",
            "description": "Sky is Clear",
            "icon": "01d"
        }
    ],
    "base": "stations",
    "main": {
        "temp": 282.417,
        "temp_min": 282.417,
        "temp_max": 282.417,
        "pressure": 1033.26,
        "sea_level": 1037.02,
        "grnd_level": 1033.26,
        "humidity": 68
    },
    "wind": {
        "speed": 3.21,
        "deg": 237.501
    },
    "clouds": {
        "all": 0
    },
    "dt": 1428243309,
    "id": 5128581,
    "name": "New York",
    "cod": 200
}
```

## Ah much better. Or is it? 
- Let's collapse the JSON fields in order to get a bird's eye view. 
- We can do this by clicking on the arrows that are located to the left of the JSON data.

![collapsed.png](https://github.com/accesscode-2-1/unit-0/blob/master/images/collapsed.png)


As we can see, there's an open curly brace, followed by a bunch of key value pairs with a closing curly brace at the end. This is referred to as a `JSONObject`. 

![collapsed.png2](https://github.com/accesscode-2-1/unit-0/blob/master/images/collapsed2.png)

It's essentially a hashmap. 

You remember hashmaps right?

![hashmaps] (https://github.com/accesscode-2-1/unit-0/blob/master/images/hashmap-picture.png)

You'll see the `JSONObject` datatype once we talk about the `json-simple` library. This library will us help parse this data.

#So let's do some parsing shall we?

- We'll need to start with downloading the simple-json library: [simple-json library ](https://json-simple.googlecode.com/files/json-simple-1.1.1.jar)
- Next we'll need to import this into our intellij project.

#### So I'd like to suggest that we create a folder called jars to seperate out our external jar files.

![hashmaps] (https://github.com/accesscode-2-1/unit-0/blob/master/images/makenewjarsdirectory.png)

<br />
#### Once you've got your folder in place, save the simple-json jar file into the folder. 
<br />
![ select java-simple2 ] (https://github.com/accesscode-2-1/unit-0/blob/master/images/select_json_simple2.png)

You should end up with something like this:

![jar directory] (https://github.com/accesscode-2-1/unit-0/blob/master/images/jarsdirectory.png)

Cool so it's now added to our intellij project file structure but we're not out the water just yet. 

We still need to make sure that our project is aware of this new library. 

Let's import it!

### You'll need to now go to File -> Project Structure

![ project structure] (https://github.com/accesscode-2-1/unit-0/blob/master/images/projectstructure.png)

#### Then you'll need to click on Libraries -> Java

![ libraries java] (https://github.com/accesscode-2-1/unit-0/blob/master/images/libraries_java.png)

#### Select the json-simple library that hopefully should be located in your jars directory

![ select java-simple ] (https://github.com/accesscode-2-1/unit-0/blob/master/images/select_json_simple.png)

#### Click ok for it to be imported.

![ select java-simple4 ] (https://github.com/accesscode-2-1/unit-0/blob/master/images/select_json_simple4.png)

#### If you now see the following then you're golden.

![ select java-simple3 ] (https://github.com/accesscode-2-1/unit-0/blob/master/images/select_json_simple3.png)

##### As a side note, just to be organized I also created a folder called json-files and placed my JSON blob file into it. 
##### I called it "weather.json"
##### Make sure to use a .json file extension in order to get the color coding.

![json folder](https://github.com/accesscode-2-1/unit-0/blob/master/images/json-folder.png)
# Hurray! If you got this far, good job.

## Now that you've got the simple-json library imported, let's do some parsing!
#### You'll find all the details in the comments.
#### Here's the project if you'd rather do this live: [ simple-json example ] (https://github.com/davisRoman/simple-json)

```java
package com.c4q.davisroman;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class Main {

    public static void whereTheHeckAmI(){
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
    }
    public static void main(String[] args) throws Exception {
        whereTheHeckAmI();

        // We need to start off by creating the object responsible for doing the heavy lifting for us.
        // So long as you've imported the json-simple library correctly then this line should be happy.
        JSONParser parser = new JSONParser();

        // Alright, so the jsonparser object is ready to go and it now wants you to point
        // it to some json data for it to chew on.
        // The weather_json_obj variable will contain the data of the entire json blob so
        // long as it parses properly and the file is found of course.
        JSONObject weather_json_obj = (JSONObject)parser.parse(new FileReader("json-files/weather.json"));

        // So at this point, we'll use weather_json_obj to help us parse our JSON blob which is
        // essentially a big hashmap where the keys return values that could consist of

        // Case 1 - String denoted by ""
        // Case 2 - Object ( think of this as hashmap) denoted by {}
        // Case 3 - Array denoted by []

        // When parsing json data, you'll need to be ready to handle all three cases.


        // But fear not! I've done you a solid and spelled out all three in good detail.

        // *Hurray!* right?


        // Case 1 - Grabbing a key whose value is a String
        // Complexity -> Eh, not so bad
        // So start with the main json blob, weather_json_obj and grab the 'name' key
        // It'll return an object of type Object`

        // Object? Huh?

        // Java uses the Object datatype when it doesn't know what it's suppose to be.
        // It's the most generic datatype that an object can be.
        // So here is where you come to the rescue.
        // We know that the value of the `name` key is String ( just look at the JSON file! ) so now we'll
        // just use what java folks like to call a `cast` to help java figure out what datatype it should be.

        // (String)weather_json_obj.get("name")   ->  takes the return value of weather_json_obj.get("name") and
        //                                            converts it into a string.

        String cityName = (String)weather_json_obj.get("name");
        System.out.println("Name: " + cityName);

        // Now that we know the magic, let's grab the values of some other keys!
        Long dt = (Long)weather_json_obj.get("dt");
        System.out.println("dt: " + dt);


        Long id = (Long)weather_json_obj.get("id");
        System.out.println("id: " + id);

        Long cod = (Long)weather_json_obj.get("cod");
        System.out.println("cod: " + id);

        //Case 2 - Grabbing a key whose value is an Object (think "hashmap")
        //Complexity - not too bad but a little tricker

        //Remember, hashmaps can point to hashmaps right?

        // So take the big JSON blob and use the wind key to return the Object
        // make sure to use a cast because we have to cast it as a JSONObject
        // and store it into a variable of type JSONObject

        JSONObject windJSONObj = (JSONObject)weather_json_obj.get("wind");

        // So basically windJSONObj now contains a hashmap that contains
        // two keys, 'speed' and 'deg' right?

        // But the quirk this time is that the value of the speed key is a double
        // Don't believe me? Just look at the JSON file.
        // Which is fine, just use a cast to convert windJSONObj.get("speed")
        // into a double and store it into a variable, windspeed of type double.
        Double windspeed = (Double)windJSONObj.get("speed");
        System.out.println("wind speed: " + windspeed);

        // Let's grab the other key while we're at it.

        Double wind_deg = (Double)windJSONObj.get("deg");
        System.out.println("wind deg: " + wind_deg);



        //Case 3

        // Grabbing a key that contains a Array

        // So let's consider the "weather" key. It looks something like this:
        /*
        ...more json above...
        "weather": [
        {
            "id": 800,
                "main": "Clear",
                "description": "Sky is Clear",
                "icon": "01d"
        }
        ],
        ...more json below...

        As you can see the weather key contains an array denoted by the open brackets.
        This is fine, we just need to ensure that the returned value is stored in a JSONArray
        like so:
        */
        JSONArray weatherJSONArray = (JSONArray)weather_json_obj.get("weather");

        // But hey, it's an array just like any array that we've used in the past!

        // Let's grab the element located at the 0th position.

        // According to our sample JSON file, we see that the value of the 0th element is an Object

        // Well well well, didn't we just already learn how to work with Objects already? ( Just visit case#2 )

        JSONObject weatherJSONObj = (JSONObject)weatherJSONArray.get(0);

        /* Sweet! Now the variable weatherJSONObj contains a JSON Object:
        {
            "id": 800,
            "main": "Clear",
            "description": "Sky is Clear",
            "icon": "01d"
        }

        But don't be fooled! As I've mentioned before, it's just a hashmap at this point.

        So I'm interested in the value of description. We can see that the value
        of the description key is "Sky is Clear" which is a String right?

        So let's grab it.

        */

        String descriptionOfWeather = (String)weatherJSONObj.get("description");

        System.out.println("Description of weather: " + descriptionOfWeather);

        // What about the id? I'm not sure what it's for but anyhow, let's grab it.

        Long myid = (Long)weatherJSONObj.get("id");

        System.out.println("weatherJSONobj's id value: " + myid);

        // So that about covers it.

        // Hope you're a little more comfortable with JSON now.

        // Happy coding!

    }
}
```
<br />
<br />

##Congratulations, you're now a JSON Kung fu master

![JSON kung fu master] (https://github.com/accesscode-2-1/unit-0/blob/master/images/master.jpg?raw=true)
