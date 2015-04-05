# The KICKASS JSON Guide


### JSON -> javascript object notation
- Don't be fooled by the javascript part. This is just a technique for presenting data in a language agnostic way.

#### So we were given a link for our final project:

```json
http://api.openweathermap.org/data/2.5/weather?q=New%20York,NY
```
##### So what should we do with this?

Before you go off and start using the http object to go grab this data, `stop` and `think` about the fact that this is live data from some external source and as such can change and even become unavailable at any point. It's probably not likely, especially if it's from a reputable source such as google or facebook but it can happen. So while we develop our code, I recommend that we take this data and copy and paste into a file. Once our code is working the way we expect then go ahead and tweak it so that it now takes the json directly from the web api using the http object. So long as the json format wasn't changed while you were working on your own, then your code should continue to work properly. This is an unlikely scenario so I wouldn't worry too much.

So go into your browser and copy paste the blob into a file and import into your intellij project. Here is what I go when I did this:

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
- We can do this by clicking on the arrays that are located to the left of the JSON data.

![collapsed.png](https://github.com/accesscode-2-1/unit-0/blob/master/images/collapsed.png)


As we can see, there's an open curly brace, followed by a bunch of key value pairs with a closing curly brace at the end. This is referred to as a `JSONObject`. 

![collapsed.png2](https://github.com/accesscode-2-1/unit-0/blob/master/images/collapsed2.png)

It's essentially a hashmap. You remember hashmaps right?

![hashmaps] (https://github.com/accesscode-2-1/unit-0/blob/master/images/hashmap-picture.png)

You'll see the `JSONObject` datatype once we talk about the `json-simple` library. This library will us help parse this data.


